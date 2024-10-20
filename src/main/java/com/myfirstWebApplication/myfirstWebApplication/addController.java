package com.myfirstWebApplication.myfirstWebApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addController {
	
	@GetMapping("/add")
	public int add(@RequestParam int num1, @RequestParam int num2)
	{
		  int sum=num1+num2;
		  System.out.println("Incoming numbers are: " +"|| num1 "+num1+ "| num2: "+num2);
		  System.out.println("sum is :"+sum);
		  
		  return sum;
		  
	}

}
