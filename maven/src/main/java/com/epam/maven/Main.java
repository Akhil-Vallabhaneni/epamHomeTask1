package com.epam.maven;

public class Main { //Encapsulation
	public static void main(String[] args)
	{
		Gifts g;
		g=new Chocolates();//run time polymorphism
		
		
		int result=g.weight();
		if(result==0)
			System.out.println("gift weight exceeding");
		else
			System.out.println("the weight of gift it only have chocolates :"+result);
		
		g=new Sweets();
		int wgt=g.weight();
		
		if(wgt==0)
			System.out.println("gift weight exceeding");
		else
			System.out.println("the weight of gift  with only sweets :"+wgt);
		
		
	}

}
