package com.fan.core.common;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * Basic api header information ,no contains body
 * @author tony
 */
@Getter
@Setter
@ToString
public class RestHeader {
    private long errorCode = 0;
    private String msg = "success";
    private String prevCode;
    private String nextCode;
    private Map<String,Object> action= null;

}