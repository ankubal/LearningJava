package interviewpracticeprograms;



public class CheckAlphabetic {
	
	public static void main(String[] args) {
		
		char c= 'a';
		
		
		if (Character.isAlphabetic(c)) {
			System.out.println(c+" is alphabetic number");
		}else {
			System.out.println(c+ "is not alphabtic number");
		}
	
}
}