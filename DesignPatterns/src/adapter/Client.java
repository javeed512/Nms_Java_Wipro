package adapter;

public class Client { // Machine

	public static void main(String[] args) {


		 Printer printer = new PrinterAdapter();
		 
		 printer.print("Hello friends1");
		
		 
		 printer.print("Hello friends2");
		 
		 printer.print("Hello friends3");

	}

}
