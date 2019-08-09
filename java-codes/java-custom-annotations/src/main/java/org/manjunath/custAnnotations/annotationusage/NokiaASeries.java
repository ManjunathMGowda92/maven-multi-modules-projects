package org.manjunath.custAnnotations.annotationusage;

import org.manjunath.custAnnotations.annotations.SmartPhone;

@SmartPhone(os = "Android", version = 6)
public class NokiaASeries {
	private String model;
	private int size;
	private double cost;
	
	public NokiaASeries() {}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
