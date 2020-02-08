package com.epam.maven;

public class Chocolates extends Gifts //inheritance
{
	int a=no_of_things_toBe_in_gift;
	int weight()
	{
	int weight_of_gift=0;
	int weight_of_eachchocolate=20;
	int no_of_chocolate=50;
	if(a<no_of_chocolate && total_weight_of_gift<500)
	{
	for(int i=0;i<a;i++)
	{
	weight_of_gift=weight_of_gift+weight_of_eachchocolate;
	}

	return weight_of_gift;
	}

	else
	{
		return 0;
	}
	}
	
	

}
