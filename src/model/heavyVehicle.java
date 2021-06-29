package model;

public class heavyVehicle extends vehicle {

	public heavyVehicle(int id) {	
		
		super();
		super.setId(id);
		super.setEngineType(new String[] {"diesel"});
		super.setType("heavy");
		super.setEnginePower(5000);
		super.setTireSize(400);
		super.setModelNo("HEAVYDEMO101");
		super.setWeight(1000);
	}
}

