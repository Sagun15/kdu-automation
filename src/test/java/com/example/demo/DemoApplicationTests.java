package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public void testIsPalindrome() {
		// Arrange
		String palindrome = "Noon";

		// Act
		boolean result = DemoApplication.isPalindrome(palindrome);

		// Assert
		Assertions.assertFalse(result);
	}

	@Test
	public void whenPalindrom_thenAccept() {
		// Arrange
		String palindrome = "non";

		// Act
		boolean result = DemoApplication.isPalindrome(palindrome);

		// Assert
		Assertions.assertTrue(result);
	}

	@Test
	public void whenNearPalindrom_thenReject(){
		// Arrange
		String palindrome = "neon";

		// Act
		boolean result = DemoApplication.isPalindrome(palindrome);

		// Assert
		Assertions.assertFalse(result);
	}

	@Test
	void contextLoads() {
	}

}
