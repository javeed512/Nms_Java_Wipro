package adapter;

public class PrinterAdapter  implements Printer {

	private LegacyPrinter legacyPrinter = new LegacyPrinter();
	
	
	@Override
	public void print(String doc) {

			legacyPrinter.printDocument(doc);
		
	}

}
