package org.Test;

public class Employee {
	public void findId(float salary) {
    System.out.println(salary);
	}
	public void findId(int age,String name){
    System.out.println(age);
    System.out.println(name);
	}
	public void findId(String dob,long phone) {
    System.out.println(dob);
    System.out.println(phone);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.findId(25,"Bharath");
		e.findId(40.5f);
		e.findId("10-05-93",8300840420l);
	}
  

}
