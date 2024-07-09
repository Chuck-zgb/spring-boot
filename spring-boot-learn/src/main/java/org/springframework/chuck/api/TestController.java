package org.springframework.chuck.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*@BelongsProject: spring-boot-train
*@BelongsPackage: org.springframework.boot.api
*@Author: 上青天
*@CreateTime: 2024-07-05  15:25
*@Description: TODO
*@Version: 1.0
*/
@RestController
public class TestController {

	@RequestMapping(value = "sayHello")
	public String sayHello() {
		return "Hello World!";
	}
}
