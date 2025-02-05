package factorymethod.designpattern;

public class ShipCreatorImp implements Creator {

	@Override
	public Logistics getTransport() {  // factory method
		// TODO Auto-generated method stub
		return new ShipLogistics();
	}

}
