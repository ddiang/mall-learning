package com.chendy.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.chendy.mall.tiny.mbg.mapper")
public class MybatisConfig {
}
