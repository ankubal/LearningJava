package interviewpracticeprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ary = String.valueOf(sc.next()).split("");

        StringBuilder answer = new StringBuilder();

        for (String n : ary) {
            int value = Integer.parseInt(n);
            if (value == 0) {
                answer.append("z");
            } else if (value % 2 == 0) {
                answer.append("q");
            } else {
                answer.append("p");
            }
        }

        System.out.print(answer.toString());
    }}