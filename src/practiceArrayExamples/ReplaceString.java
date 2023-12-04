package practiceArrayExamples;

import java.util.Arrays;

public class ReplaceString {

	public void replaceinttostring(Object[] numbers) {

		int i = 0;

		for (Object o : numbers) {
			int n = (int) o;
			boolean t3 = n % 3 == 0;
			boolean t5 = n % 5 == 0;

			numbers[i] = t3 && t5 ? "shersha" : t3 ? "sher" : t5 ? "sha" : n;
			i++;
		}
	}
}