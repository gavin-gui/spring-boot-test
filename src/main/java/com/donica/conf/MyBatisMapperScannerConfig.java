package com.donica.conf;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {

  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer() {
      MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
      mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
      mapperScannerConfigurer.setBasePackage("com.donica.wqacvr.mapper");
      /*Properties properties = new Properties();
      properties.setProperty("mappers", "tk.mybatis.springboot.util.MyMapper");
      properties.setProperty("notEmpty", "false");
      properties.setProperty("IDENTITY", "MYSQL");
      mapperScannerConfigurer.setProperties(properties);*/
      
      return mapperScannerConfigurer;
  }

}