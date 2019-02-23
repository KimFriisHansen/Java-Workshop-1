/**
 * 
 */
package com.bs.java8workshop;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

/**
 * @author Kim
 *
 */
public class Java8NashornJavaScript {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
	      ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
			
	      String name = "Bestseller";
	      Integer result = null;
	      Object result1 = null;
		      
	      try {
	         nashorn.eval("print('" + name + "')");
	         result = (Integer) nashorn.eval("2 + 2");
	         result1 = nashorn.eval(
		    		   "var greeting='hello Java 8';" +
		    		   "print(greeting);");
	         
	      } catch(ScriptException e) {
	         System.out.println("Error executing script: "+ e.getMessage());
	      }
	      System.out.println(result.toString());
	      

	}

}
