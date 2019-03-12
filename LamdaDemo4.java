package java8;

import java.util.Arrays;
import java.util.List;

public class LamdaDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Before java8 , too much code for too little to do");}
			}).start();
		
		new Thread( ()-> System.out.println("In java8,Lambda expression rocks!!")).start();
		System.out.println("_ _ _ _ _***************_ _ _ _ _ ");
		
		List features=Arrays.asList("Lambdas","Default Method","Stream API","Date and Time API");
		features.forEach(n-> System.out.println(n));
		System.out.println("_ _ _ _ _***************_ _ _ _ _ ");
		// features.forEach(System.out::println);

	}

}
