package practiceArrayExamples;

public class DupicateNumbers {
	
	int arr[] = new int[]{1,2,1,3,2,3,1,4,5,4};
void findduplicate() {
	

    int dup = 0;
     for(int i = 0; i<arr.length;i++){
         for(int j =i+1; j<arr.length;j++){
             if(arr[i] == arr[j]){
                 System.out.print(arr[i] +"\n");
                 break;
             }
         }
     }

}}	
	 
