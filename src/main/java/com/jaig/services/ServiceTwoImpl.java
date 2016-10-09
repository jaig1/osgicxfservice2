package com.jaig.services;

public class ServiceTwoImpl implements ServiceTwo {

	@Override
	public String getServiceTwo() throws Exception {
		System.out.println("ServiveOne :: restful endpoint hit.");
       
		return "<ATT><WARNING><ServiceTwo>You have reached ServiceTwo. ServiceTwo is currently not available now</ServiceTwo></WARNING></ATT>";
		
	}

}
