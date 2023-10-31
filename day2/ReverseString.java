package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		String test = "I am a Software Tester";
		
		char[] charArray = test.toCharArray();
		
		for (int i = charArray.length-1; i >=0; i--) {
		//	System.out.print(charArray[i]);
		}
		System.out.println("##############################");
		String[] split = test.split("S");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		
		

	}

}
