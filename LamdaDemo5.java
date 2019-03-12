package java8;
import java.util.*;
public class LamdaDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Map<String,String> books=new HashMap<>();
				books.put("Let us C","Yashwant kanetkar");
				books.put("OOPS","Simon kendel");
				
				books.forEach((key,value)-> System.out.println("Book name:-" + key +",Author:- "+ value));
				System.out.println();
				books.forEach((key,value)->{
					System.out.println("Book name:-" + key +",Author:- "+ value);
				});
				System.out.println();
			}

	}


