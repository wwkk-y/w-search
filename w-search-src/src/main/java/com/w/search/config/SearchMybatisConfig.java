package com.w.search.config;

import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;


/**
 * @author yongzhi.wei
 */
@Configuration
@MapperScan("com.w.search.mapper")
public class SearchMybatisConfig {

}
