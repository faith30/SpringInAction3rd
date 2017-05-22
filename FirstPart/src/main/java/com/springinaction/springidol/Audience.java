package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public void takeSeats(){
		System.out.println("The audience is taking their seats");
	}
	
	public void turnOffCellPhones(){
		System.out.println("The audience is turn off their cellphone");
	}
	
	public void appland(){
		System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP");
	}
	
	public void demandRefund(){
		System.out.println("Boo! We want our money back!");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinPoint){
		try{
			takeSeats();
			turnOffCellPhones();
			long start = System.currentTimeMillis();
			
			joinPoint.proceed();
			
			long end = System.currentTimeMillis();
			
			appland();
			System.out.println("The performance took " + (end - start) + " milliseconds.");
		}
		catch (Throwable e) {
			// TODO: handle exception
			demandRefund();
		}
	}
}
