package week3.day4;

public class LearnString {

	public static void main(String[] args) {
		//string Literal
		String s1= "Testleaf";
		String s2= "TestLeaf";
		
		//using Instantiation
		String str= new String ("Testleaf");
		
		//equals
		System.out.println(s1.equals(str)); 
		
		//compare operator == reference (memory)
		System.out.println(s1==str);
		
		//compare literal
		System.out.println(s1==s2);
		
		//equalsIsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//count of my char
		int len = s1.length(); // give s1.length and give ctrl +2 +l, will get this statement(shortcut)
		System.out.println(len);
		
		//test
		System.out.println(s1.contains("test"));
		
		//charAt(index)
		System.out.println(s1.charAt(5));
		
		//toCharArray  'T''e''s...'f'
		char[] ch = s1.toCharArray();  //give s1.toCharArray and then ctrl + 2 +l, will get this statement
		for (int i=0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		//reverse the string
        for (int i =ch.length-1 ; i>=0; i--) {
           System.out.println(ch[i]);
        }
	}
}
		
        
	
	

