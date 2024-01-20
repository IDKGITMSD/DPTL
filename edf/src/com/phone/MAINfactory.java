package com.phone;

public class MAINfactory {
	
	public static void main(String []args) {
		
		OSfactory osf = new OSfactory();
		OS ros = osf.getinstance("Open");
		ros.spec();
		
	}

}
