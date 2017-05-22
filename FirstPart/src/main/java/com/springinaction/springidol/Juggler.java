package com.springinaction.springidol;

public class Juggler implements Performer {
	private int beanBags = 3;
	
	public  Juggler() {
		
	}
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("JUGGLING "+ beanBags+ " BEANBAGS");
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
