/**
 * 
 */
package com.bs.java8workshop;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Kim
 *
 */
public class Java8MethodReferences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List names = new ArrayList();
			
	      names.add("B");
	      names.add("Be");
	      names.add("Bes");
	      names.add("Best");
	      names.add("Bestseller");
			
	      names.forEach(System.out::println);

	}

}
