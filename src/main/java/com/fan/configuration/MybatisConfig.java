package com.fan.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author: yonghao
 * @date: May 10, 2019
 */

@Configuration
public class MybatisConfig {

    @Configuration
    @MapperScan(basePackages = {
            "com.fan.dao.trade"}, sqlSessionFactoryRef = "tradeSqlSessionFactory", sqlSessionTemplateRef = "tradeSqlSessionTemplate")
    public static class TradeDB {
        @Resource
        private DataSource tradeDataSource;

        @Bean
        public SqlSessionFactory tradeSqlSessionFactory() throws Exception {
            SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
            factoryBean.setDataSource(tradeDataSource);
            factoryBean.setMapperLocations(
                    new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/trade/**/*.xml"));
            return factoryBean.getObject();
        }

        @Bean
        public SqlSessionTemplate tradeSqlSessionTemplate() throws Exception {
            SqlSessionTemplate template = new SqlSessionTemplate(tradeSqlSessionFactory()); // 使用上面配置的Factory
            return template;
        }
    }

}
