package org.Test;

public class HdfBank extends Axisbank {
	public void fixedDeposite() {
   System.out.println("10%");
	}
	public static void main(String[] args) {
		HdfBank h=new HdfBank();
		h.fixedDeposite();
		h.accountDetails();
	}

}
