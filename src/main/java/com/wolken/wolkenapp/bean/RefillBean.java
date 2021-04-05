package com.wolken.wolkenapp.bean;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component
public class RefillBean {
	Logger logger=Logger.getLogger("RefillBean");
	
	private String refillBrand;
	 
	private int refillPrice;
	@Autowired
	public RefillBean(@Value("rorito")String refillBrand,@Value("3")int refillPrice) {
		this.refillBrand = refillBrand;
		this.refillPrice = refillPrice;
	}
	public void refill() {
		logger.info("refill kaali hosadu togobeku");
	}
	

}
