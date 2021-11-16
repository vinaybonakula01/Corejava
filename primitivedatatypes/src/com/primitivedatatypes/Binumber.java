package com.primitivedatatypes;

public class Binumber {
	private int a;
	private int b;
	public Binumber(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	void seta(int a) {
	this.a = a;
	}
	void setb(int b) {
		this.b = b;
	}
	int geta() {
		return a;
	}
	int getb() {
		return b;
	}
	int add(int a,int b) {
		return a+b;
	}

	public int multiply(int a, int b) {
		
		return a*b;
	}
	public void doublevalue() {
		this.a *=2;
		this.b *=b;	}

}
