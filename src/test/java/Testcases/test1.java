package Testcases;

import Pages.HomePage;

public class test1 {

	
	public static HomePage home; 
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		home.intiliazation();
	String acutaul=	home.loginfunction("6360451473", "sC*2UHe%");
		
	String expec="Dashboard";
	
	
	if (acutaul.equals(expec)) 
	{System.out.println("pass");
	
	 
		
	System.out.println("fail");}
	
	
	home.DoctorUser.click();
	

	}

}
