package com.tj.dwback.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;



/**
 * @author wangyi
 * @version 1.0
 */

@Configuration
public class HiveJdbcConfig {
    @Value("${hive.url}")
    private String url;

    @Value("${hive.driver-class-name}")
    private String driver;

    @Value("${hive.user}")
    private String user;

    @Bean
    public DataSource dataSource(){
        DataSource dataSource = new DataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(user);
        return dataSource;
    }

    @Bean("hive")
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
}
