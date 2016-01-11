package com.example.myproject.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.example.myproject.domain.Model;
import com.example.myproject.service.ModelService;

@Service("modelService")
public class ModelServiceImpl implements ModelService {
	
	private final Logger log = Logger.getLogger(ModelServiceImpl.class);

	@Override
	public Model findModel() {
		log.info("add Model");
		Model model = new Model();
		model.setAttr("akram moncer");
		return model;
	}

}
