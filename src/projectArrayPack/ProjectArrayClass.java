package projectArrayPack;

import java.util.Scanner;

//import java.util.Scanner;
public class ProjectArrayClass {
	//String sam;
	//String [] mobilestore= {"S20","S21","FILP3","FOLD3"};
	String [] samsung= {"S20","S21","FILP3","FOLD3"};
	String[] google= {"pixel 6","pixel 6 pro","pixel pro","pixel5" };
	String[] Apple= {"iphone 12","iphone 12 mini","iphone 11","iphone 11 pro"};
	Scanner sc = new Scanner(System.in);
	void displayPhone() {
		System.out.println("sumsung mobiles");
		for(int i=0;i<samsung.length;i++) {
			System.out.println(samsung[i]);
			//samsung[2]=sc.next();
		}
		System.out.println("Google Mobiles");
		for (int j=0;j<google.length;j++) {
			System.out.println(google[j]);
		}
		System.out.println("Apple Mobiles");
		for(int k=0; k<Apple.length;k++) {
			System.out.println(Apple[k]);
		}
	}
		
	void searchPhone() {
		
		System.out.println("Enter the model");
		String search =sc.nextLine();
		
		for(int i=0;i<samsung.length;i++) {
			//samsung[i]= sc.nextLine();
		if (search.equals(samsung[0]) || search.equals(samsung[1]) || search.equals(samsung[2])||search.equals(samsung[3])) {
			
			System.out.println("the "+sc.nextLine()+" mobile is displayed in the list");
			//break;
			
		}
		
		else
		{
			System.out.println("is not in the list");
		}
	}

	
}
}
//}
