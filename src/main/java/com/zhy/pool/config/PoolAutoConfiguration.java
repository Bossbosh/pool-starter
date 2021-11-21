package com.zhy.pool.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhy.pool.condition.PoolCheckCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@Conditional(PoolCheckCondition.class)
public class PoolAutoConfiguration {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Bean
    public DataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        druidDataSource.setUrl(dataSourceProperties.getUrl());
        druidDataSource.setUsername(dataSourceProperties.getUsername());
        druidDataSource.setPassword(dataSourceProperties.getPassword());
        druidDataSource.setInitialSize(5);
        druidDataSource.setMinIdle(5);
        druidDataSource.setMaxActive(20);
        druidDataSource.setMaxWait(60*1000);
        druidDataSource.setTimeBetweenEvictionRunsMillis(60*1000);
        druidDataSource.setMinEvictableIdleTimeMillis(30*1000);
        druidDataSource.setTestWhileIdle(true);
        druidDataSource.setTestOnBorrow(false);
        druidDataSource.setTestOnReturn(false);
        druidDataSource.setPoolPreparedStatements(true);
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
        druidDataSource.setUseGlobalDataSourceStat(true);
        return druidDataSource;
    }




}
