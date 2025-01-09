package com.boot.swlugweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {
		"com.boot.swlugweb.v1.login",
		"com.boot.swlugweb.v1.signup",
		"com.boot.swlugweb.v1.admin",
		"com.boot.swlugweb.v1.board",
		"com.boot.swlugweb.v1.email",
		"com.boot.swlugweb.v1.notice",
		"com.boot.swlugweb.v1.main"
}) // MongoDB 레포지토리 경로 설정
@EnableJpaRepositories(basePackages = {
		"com.boot.swlugweb.v1.login",
		"com.boot.swlugweb.v1.signup",
		"com.boot.swlugweb.v1.admin",
		"com.boot.swlugweb.v1.board",
		"com.boot.swlugweb.v1.email",
		"com.boot.swlugweb.v1.notice",
		"com.boot.swlugweb.v1.main"

}) // JPA 레포지토리 경로 설정
@EntityScan(basePackages = {
		"com.boot.swlugweb.v1.login",
		"com.boot.swlugweb.v1.signup",
		"com.boot.swlugweb.v1.admin",
		"com.boot.swlugweb.v1.board",
		"com.boot.swlugweb.v1.email",

		"com.boot.swlugweb.v1.notice",
		"com.boot.swlugweb.v1.main"
}) // 엔티티 클래스 경로 설정


public class SwlugWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwlugWebApplication.class, args);
	}
}