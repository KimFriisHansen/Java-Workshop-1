package org.example.java8;
/**
 * @author Kim
 *
 */

import java.util.ArrayList;
import java.util.List;

public class CountItems {
	public static void main(String args[]){

		System.out.println("Creating list");
		List<String> strings = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			strings.add("Item " + i);
		}
		
//		strings.stream()
//			.parallel()
//			.forEach(str -> System.out.println(str));
		
		// we want actually to count items
		//Indsæt kode
		
		
	
	}
	
}