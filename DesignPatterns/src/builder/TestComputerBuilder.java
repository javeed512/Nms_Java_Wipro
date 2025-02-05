package builder;

public class TestComputerBuilder {

	public static void main(String[] args) {


		Computer computer1 =		new Computer.ComputerBuilder("500GB", "8GB")
				      .setGraphicCardEnable(true)
				      .setBluetoothEnable(true)
				      .build();
		
			System.out.println(computer1);
			

			Computer computer2 =new Computer.ComputerBuilder("1000GB", "32GB")
					      .setGraphicCardEnable(true)
					      .setBluetoothEnable(false)
					      .build();
			
				System.out.println(computer2);
				

				Computer computer3 =new Computer.ComputerBuilder("250GB", "4GB")
						      .setGraphicCardEnable(false)
						      .setBluetoothEnable(false)
						      .build();
				
					System.out.println(computer3);
		

	}

}
