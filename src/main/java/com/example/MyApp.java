package com.example;
import org.apache.commons.lang3.StringUtils;

public class MyApp {

	public static void main(String[] args) {
		
		String message = "  Hello, World!  ";
		System.out.println(StringUtils.deleteWhitespace(message));
	}
}

