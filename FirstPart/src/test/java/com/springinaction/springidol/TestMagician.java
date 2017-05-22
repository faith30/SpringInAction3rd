package com.springinaction.springidol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMagician {

	@Test
	public void test() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/springidol-config.xml");
		Thinker volunteer = (Thinker) ctx.getBean("thinker");
		volunteer.thinkOfSomething("Hi hi");
		MindReader magician = (MindReader) ctx.getBean("magician");
		assertEquals("Hi hi", magician.getThoughts());
	}

}
