package com.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	
    @Test
    public void fizzBuzzTest() {
    	int num = 50;
    	List<Object> strArray = new ArrayList<Object>();
    	
    	for (int i=1; i<=num; i++) {
    		if(mod(i, 3) && mod(i, 5)) strArray.add("fizzbuzz");
    		else if(mod(i, 3)) strArray.add("fizz");
    		else if(mod(i, 5)) strArray.add("buzz");
    		else strArray.add(i);
    	}
    	System.out.println("result: "+strArray);
    }
    
    public boolean mod(int num, int modNum) {
    	boolean bool = false;
		if(num % modNum == 0) {
			bool = true;
		}
		return bool;
	}
    
}
