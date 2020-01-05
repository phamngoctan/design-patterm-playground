package com.tanpham.designpattern.playground.observer;

import java.util.ArrayList;
import java.util.List;

public class Holder {
	private List<Observer> observers;
	private long price;
	
	public void register(Observer obs) {
		observers.add(obs);
	}
	
	public void unregister(Observer obs) {
		int indexOfObs = observers.indexOf(obs);
		observers.remove(indexOfObs);
	}
	
	public void notifyObsersers() {
		for(Observer observer : observers) {
			observer.update(price);
		}
	}
	
	
	
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("Nghia");
		str.add("Tan");
		int t=str.indexOf("Tan");
		System.out.println(t);
	}

	public void updatePrice(long newPrice) {
		this.price = newPrice;
		notifyObsersers();
	}
	
}
