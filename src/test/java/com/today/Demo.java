package com.today;

public class Demo {

	public static void main(String[] args) throws ExerciseException {
		String s = "12345";
		if(s.startsWith("11")) {
			System.out.println("It is correct");
		} else {
			try {
			throw new ExerciseException();
		} catch(Exception e) {
			} 
		} System.out.println("######");
	}
}
