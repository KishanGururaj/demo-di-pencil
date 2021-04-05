package com.wolken.wolkenapp.bean;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Component
public class PenBeans {
	Logger logger=Logger.getLogger("PenBeans");

	@Value("jiffy")
	private String penName;
	@Value("5")
	private int penPrice;
	@Value("gel pen")
	private String type;
	@Autowired
	private RefillBean refillBean;
	public void pen() {
		logger.info("pen kaali refill togebeku");
	}

}
