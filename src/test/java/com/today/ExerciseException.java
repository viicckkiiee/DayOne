package com.today;

public class ExerciseException extends Exception {
	
		@Override
		public String getMessage() {
			String s = "Sample Exception";
			return s;
		}
}
