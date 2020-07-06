package com.fan.core.util;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class DownloadUtils {

    /**
     * 从网络Url中下载文件
     * @param urlStr
     * @param fileName
     * @param savePath
     * @throws IOException
     */
    public static File downLoadByUrl(String urlStr,String fileName,String savePath) {
        File file = null;
        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            //设置超时间为10秒
            conn.setConnectTimeout(10*1000);
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 2.0.50727; .NET CLR 3.0.04506.30; .NET CLR 3.0.04506.648; CIBA)");
            //得到输入流
            try(InputStream inputStream = conn.getInputStream();) {
                //获取自己数组
                byte[] getData = readInputStream(inputStream);
                //文件保存位置
                File saveDir = new File(savePath);
                if (!saveDir.exists()) {
                    if(!saveDir.mkdir()){
                        log.error("make dir : {} error ",savePath);
                        return null;
                    }
                }
                file = new File(saveDir + File.separator + fileName);
                try (FileOutputStream fos = new FileOutputStream(file);) {
                    fos.write(getData);
                }
            }
            log.info("file: "+ url +" download success.");
            log.info("file path: {}", file.getAbsolutePath());
        } catch (FileNotFoundException | MalformedURLException  e) {
            log.error("downLoadByUrl error", e);
        }  catch (IOException e) {
            log.error("downLoadByUrl error", e);
        }
        return file;
    }


    /**
     * 从输入流中获取字节数组
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static  byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }

    public static void main(String[] args) {
        try{
            downLoadByUrl("https://finmas-app.s3.ap-southeast-1.amazonaws.com/paper/staging/351f45005bda11e8a9cb5dca43285ffd.pdf"
                    ,"note.pdf", "agreement");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[]  getBytesByUrl(String urlStr) {
        byte[] bytes = null;
        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            //设置超时间为10秒
            conn.setConnectTimeout(10*1000);
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 2.0.50727; .NET CLR 3.0.04506.30; .NET CLR 3.0.04506.648; CIBA)");
            //得到输入流
            InputStream inputStream = conn.getInputStream();
            //获取自己数组
            bytes = readInputStream(inputStream);

            if(inputStream!=null){
                inputStream.close();
            }
            log.info("getBytesByUrl success: {}", urlStr);
        } catch (Exception e) {
            log.error("getBytesByUrl error，urlStr:{}, error:{}", urlStr, e);
        }
        return bytes;
    }
}