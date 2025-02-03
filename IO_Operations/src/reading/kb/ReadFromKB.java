package reading.kb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFromKB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");

		String name = sc.next();

		System.out.println("Enter salary "); // 50000

		int salary = sc.nextInt(); // sc.nextXXX();

		System.out.println("Hi " + name + " your salary is " + salary);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("City name");
			String city = br.readLine();

			System.out.println("City " + city);
			
			System.out.println("Phone number");
			
				long phone = 		Long.parseLong(br.readLine());
			System.out.println("Phone No: "+phone);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
