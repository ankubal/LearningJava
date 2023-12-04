package practiceArrayExamples;

public class ReverseArray {

	
	int arr[] = new int[] { 10,20,30,50,70 };
	void reversearray() {
    System.out.println("reversing an array:");
    for(int i = 0; i < arr.length / 2; i++){
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }   
}
}

