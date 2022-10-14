package com.example.demo.services;

import java.io.PrintWriter;

import lombok.AllArgsConstructor;
import lombok.Data;

// Unchecked ex= can handle or declare , can leave it without handling
// checked eiether handle or declare not doing will be a exception
// if this extends Exception class it becomes checked ,if RuntimeException becomes unchecked.

@AllArgsConstructor
@Data
public class ElementNotFoundException extends RuntimeException {
	
	
	
		String errorCode;
		String message;
		
		public void printStackTrace(PrintWriter s) {
			s.write(this.errorCode+", "+this.message);
		}
		
	
	

}

