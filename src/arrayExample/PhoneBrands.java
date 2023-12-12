package arrayExample;
import java.util.Scanner;

public class PhoneBrands {
//S20	Google Pixel 6	Iphone12
//	S21	Google Pixel 6 Pro 	Iphone SE
//	Flip3	Google Pixel Pro	Iphone 15
	//Fold3	Google  Pixel 5	Iphone 13

//	String[][] phones = new String[4][3] {{{"S20", "GoogleP0ixel6","Iphone12"},
//		                                  {"S21","GooglePixel6Pro","IphoneSE"},
//		                                  {"Flip3","GooglePixelPro","Iphone 15"},
//		                                  {"Fold3","GooglePixel5","Iphone 13"}};
//		String [][] phones = {{"S20", "GoogleP0ixel6","Iphone 12"},
//               {"S21","Google Pixe l6Pro","Iphone SE"},
//               {"Flip3","Google Pixel Pro","Iphone 15"},
//               {"Fold3","Google Pixe l5","Iphone 13"}};
		
		String [][]phones = new String [4][3]
		phones[0][0] = "S20";
		
		
	Scanner sc = new Scanner (System.in);
	
	void populatephones() {
	for(int i=0;i<phones.length;i++) {
		for(int j =0;j<phones[i].length;j++) {


System.out.println(phones [i][j]);
}
			}}
		
		
void findmodel() {

	System.out.println("Enter the product you want to buy");
	String phonesName = sc.next();

	boolean itemFound = false;

	
	for (int i = 0; i < phones.length; i++) {
		for (int j = 0; j < phones[i].length; j++) {
		if (phones[i][j].equalsIgnoreCase(phonesName)) {

			itemFound = true;
			break;

		}

	}

	if (itemFound) {
		System.out.println("Found the model : " + phones + " in the product list");
	} else {
		System.out.println("please select the model in the product list");
	}

}}}