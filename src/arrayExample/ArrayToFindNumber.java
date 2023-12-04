package arrayExample;

public class ArrayToFindNumber {
	int inputArray[] = {-40,-5,1,3,6,7,8,20};
	int inputNum = 15;
	 void findThePairs() {
		System.out.println("Pairs of elements whose sum is "+ inputNum+" are : ");
		for(int i = 0; i < inputArray.length; i++) {
			for(int j = i + 1; j < inputArray.length; j++) {
				if(inputArray[i]+inputArray[j] == inputNum) {
					System.out.println(inputArray[i]+" + "+ inputArray[j]+" = "+inputNum);
				}
			}
		}
	}

	
		
}
	
	
	
		
		