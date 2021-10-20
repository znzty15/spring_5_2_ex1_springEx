package com.javaGG.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Pencil pencil = ctx.getBean("pencil4B", Pencil.class);
		Pencil pencil2 = ctx.getBean("pencil6B", Pencil.class);
		Pencil pencil3 = ctx.getBean("pencil6BE", Pencil.class);
		pencil.use();
		pencil2.use();
		pencil3.use();
		ctx.close();	
	}

}
