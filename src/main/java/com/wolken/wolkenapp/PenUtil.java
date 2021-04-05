package com.wolken.wolkenapp;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.PenBeans;
import com.wolken.wolkenapp.bean.RefillBean;

public class PenUtil {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger("PenUtil");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		PenBeans penBeans=applicationContext.getBean(PenBeans.class);
		penBeans.pen();
		logger.info("penName: "+penBeans.getPenName()+"penPrice:"+penBeans.getPenPrice()+"Type: "+penBeans.getType());
		RefillBean refillBean=applicationContext.getBean(RefillBean.class);
		refillBean.refill();
		logger.info("RefillBrand:"+refillBean.getRefillBrand()+"RefillPrice:"+refillBean.getRefillPrice());

	}

}
