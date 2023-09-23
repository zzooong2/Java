package Mapping;

import java.util.List;
import java.util.ArrayList;

public class ToyPriceInfo {
	private String model;
	private int price;
	
	public ToyPriceInfo(String m, int p) {
		model = m;
		price = p;
	}
	
	public int getPrice() {
		return price;
	}

}
