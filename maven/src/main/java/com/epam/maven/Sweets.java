package com.epam.maven;

public class Sweets extends Gifts{
	int a=no_of_things_toBe_in_gift;
	int weight()               
	{
	int weight_of_gift=0;
	int weight_of_eachSweet=90;
	int no_of_sweets=50;
	if(a<no_of_sweets && total_weight_of_gift<500)
	{
	for(int i=0;i<a;i++)
	{
	weight_of_gift=weight_of_gift+weight_of_eachSweet;
	}
	}
	return weight_of_gift;
	}

}
