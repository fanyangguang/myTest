package com.fan.configuration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author: yonghao
 * @date: May 10, 2019
 */

@Configuration
public class DataSourceConfig {

    @Bean(name = "tradeDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.trade")
    public DataSource dbTwoDataSource() {
        return DataSourceBuilder.create().driverClassName("com.mysql.cj.jdbc.Driver").build();
    }
}
