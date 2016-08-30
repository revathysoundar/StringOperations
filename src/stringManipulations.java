import java.util.Arrays;
import java.util.Scanner;
import java.lang.StringBuilder;

public class stringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String firstName = "Revathy";
		String lastName = "Raja";
		String fullName = firstName + " " + lastName;
		System.out.println("My Full Name is " + fullName);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		if(name.equals("David") || name.equalsIgnoreCase("David"))
		{
			System.out.println("You're the instructor");
			System.out.println("Starts with Dav");
		}
		else
		{
			System.out.println("You're a student");
		}
		char firstChar = name.charAt(0);
		System.out.println("First Character " + firstChar);
		int lenOfString = name.length();
		for(int i = 0; i < lenOfString; i++)
		{
			if(name.charAt(i) == 'f')
			{
				System.out.println("Contains f");
			}
		}
		String sentence = "She sells seashells by the seashore." ;
		String sentence1 = sentence.replace('s', 'S');
		System.out.println("Sentence Before Replace: " + sentence );
		System.out.println("Sentence After Replace: " + sentence1 );
		System.out.println("Sentence Before Replace: " + sentence );
		String sentence2 = sentence.replace("ell", "oo");
		System.out.println("Sentence After ell Replace: " + sentence2);
		int lenOfSentence = sentence.length();
		System.out.println("Length of sentence: " + lenOfSentence);
		String lowerCase = sentence.toLowerCase();
		System.out.println("Sentence lower case: " + lowerCase );
		
		
		/////////////////////////////////
		
		String word1 = "Hello World";
		
		System.out.println(word1);
		
		char ch = word1.charAt(1);
		System.out.println(ch);
		System.out.println(word1.indexOf('l'));
		System.out.println(word1.startsWith("Hello"));
		System.out.println(word1.endsWith("World"));
		System.out.println(word1.length());
		System.out.println(word1.lastIndexOf('l'));
		String word2 = word1.replace('l', '5');
		System.out.println(name.contains("f"));
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word1.substring(7,10));
		System.out.println(word1.substring(6));
		//System.out.println(Arrays.asList(word1.spilt(" "));
		
		StringBuffer fullNameBuffer = new StringBuffer();
		fullNameBuffer.append(firstName);
		fullNameBuffer.append(" ");
		fullNameBuffer.append(lastName);
		System.out.println(fullNameBuffer);
		
		String phrase = "Grant Chirpus loves Detroit";
		System.out.println(phrase.substring(0, 5)); // prints "Grant"
		System.out.println(phrase.substring(6, 13)); // prints "Chirpus"
		System.out.println(phrase.substring(14, 19)); // prints "loves"
		System.out.println(phrase.substring(20)); // prints "Detroit"
		

		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
		
		sc.close();
		

	}

}
