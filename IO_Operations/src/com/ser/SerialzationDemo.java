package  com.ser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialzationDemo {

	public static void main(String[] args) {


		Employee emp = new Employee(101, "King", 45000);
		
		emp.setSalary(65000);
		
		try {
			FileOutputStream  fos = new FileOutputStream("EmpObj.ser");
			
			ObjectOutputStream  oos = new ObjectOutputStream(fos);
			
					oos.writeObject(emp);
			
					System.out.println("Emp Object is Serialized");
					
					System.out.println(emp);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
