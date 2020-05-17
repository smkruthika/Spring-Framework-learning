package com.kru.basics.only.spring.noSpringBoot.mockito;

import org.springframework.stereotype.Component;

@Component
public interface JdbcConnection {
	int getData();
}
