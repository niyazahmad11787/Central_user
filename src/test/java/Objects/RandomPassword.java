package Objects;

import java.util.Random;

public class RandomPassword 
{
	public static String r_functionality() { 
		// create a string of uppercase and lowercase characters and numbers
		String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialChracterString = "!@#$%*&";

		// combine all strings
		String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

		// create random string builder
		StringBuilder sb = new StringBuilder();

		// create an object of Random class
		Random random = new Random();

		// specify length of random string
		int length = 7;
		int randomIndex = random.nextInt(length);
		for (int i = 0; i < length; i++) {

			// generate random index number
			int index = random.nextInt(alphaNumeric.length());

			// get character specified by index
			// from the string
			char randomChar = alphaNumeric.charAt(index);

			// append the character to string builder

			sb.append(randomChar);
			if (randomIndex == i && !sb.toString().contains(specialChracterString)) {
				int ii = random.nextInt(specialChracterString.length() - 1);
				char sp = specialChracterString.charAt(ii);
				sb.append(sp);
			}
		}

//		int index = random.nextInt(specialChracterString.length() - 1);
//		char sp = specialChracterString.charAt(index);
//		sb.append(sp);

		String randomString = sb.toString();
		System.out.println("Random String is: " + randomString);
		if (randomString.contains(specialChracterString)) {
//	    	System.out.println(randomString);
			return randomString;

		}
		return randomString;

	}

	public static void main(String[] args) {
		String pass = r_functionality();
		System.out.println(pass);
	}
}
