package com.example.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.domain.Model;
import com.example.myproject.repository.ModelRepository;
import com.example.myproject.service.ModelService;

/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
@ComponentScan
@Configuration
@EnableConfigurationProperties
public class App {

	@Autowired
	private ModelService modelService;

	@Autowired
	private ModelRepository modelRepository;

	@Autowired
	private Settings seeting;

	@RequestMapping("/")
	@ResponseBody
	public Model home() {
		modelRepository.save(modelService.findModel());
		return modelService.findModel();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(
//			SpringApplicationBuilder builder) {
//		// TODO Auto-generated method stub
//		return builder.sources(App.class);
//	}
}
