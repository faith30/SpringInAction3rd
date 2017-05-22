package com.springinaction.springidol;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/springidol-config.xml");
		Performer performer = (Performer) ctx.getBean("duke");
		performer.perform();
	}

}
