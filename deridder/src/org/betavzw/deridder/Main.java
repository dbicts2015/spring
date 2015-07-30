package org.betavzw.deridder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml")){
			Ridder ridder = ctx.getBean(Ridder.class);
			ridder.vertrekOpQueeste();
		}
	}
}
