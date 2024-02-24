package interviewpracticeprograms;

import java.util.Scanner;

public class Substring {

	public static boolean isSubstring(String main, String sub) {
		
		return main.contains(sub);
		//return main.indexOf(sub)!=-1;
		
		
	}
		public static void main(String[] args) {
			System.out.println(isSubstring("akanksha shersha", "shersha"));
		}
	}

