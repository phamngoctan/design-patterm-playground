package com.tanpham.designpattern.playground.observer;

public class NghiaListener implements Observer {

	@Override
	public void update(long price) {
		System.out.println("Nghia updated price: " + price);
	}
}
