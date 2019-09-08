package com.example.springtestdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(basePackages ={"com.example.springtestdemo.modules.mapper"})
@SpringBootApplication
public class SpringtestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtestdemoApplication.class, args);


//		CbUser user= new CbUser();
//		user.setGerder(1);
//		user.setNickname("goutou");
//		user.setUid(UUID.randomUUID().toString();
//		ApplicationContext applicationContext = new ClassP

	}

}
