package String.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import String.String;

class StringTest {

	@Test
	void test() {
		String mystring = String.valueOf('A');
		char[] myChars = mystring.toCharArray();
		
		myChars[0] = 'B';
		
		assertEquals('A',mystring.charAt(0));
		// assertEquals('B', mystring.charAt(0));
		
		
	}

}
