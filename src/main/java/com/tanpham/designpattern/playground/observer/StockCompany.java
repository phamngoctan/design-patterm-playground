package com.tanpham.designpattern.playground.observer;

public class StockCompany {

	public void updatePrice(Holder holder, long newPrice) {
		holder.updatePrice(newPrice);
	}
	
}
