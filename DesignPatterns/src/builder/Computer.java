package builder;

public  class Computer {

	// required properties
	private String HDD;
	private String RAM;

	// optional properties

	private boolean isGraphicCardEnable;
	private boolean isBluetoothEnable;

	public Computer(ComputerBuilder builder) {
		
		 this.HDD = builder.HDD;
		 this.RAM = builder.RAM;
		 this.isGraphicCardEnable = builder.isGraphicCardEnable;
		 this.isBluetoothEnable = builder.isBluetoothEnable;

	}
	
	
	
	
	

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicCardEnable=" + isGraphicCardEnable
				+ ", isBluetoothEnable=" + isBluetoothEnable + "]";
	}






	// static inner class ComputerBuilder
	public static class ComputerBuilder {

		// required properties
		private String HDD;
		private String RAM;

		// optional properties

		private boolean isGraphicCardEnable;
		private boolean isBluetoothEnable;

		public ComputerBuilder(String hDD, String rAM) {
			super();
			HDD = hDD;
			RAM = rAM;
		}

		public ComputerBuilder setGraphicCardEnable(boolean isGraphicCardEnable) {
			this.isGraphicCardEnable = isGraphicCardEnable;
			return this;
		}

		public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnable) {
			this.isBluetoothEnable = isBluetoothEnable;

			return this; // here this means ComputerBuilder object
		}

		public Computer build() {

			return new Computer(this);  // here this means ComputerBuilder object

		}
		

	}

}
