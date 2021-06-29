package model;

public class sportsVehicle extends vehicle {

	public sportsVehicle(int id) {	
		
		super();
		super.setId(id);
		super.setEngineType(new String[] {"oil"});
		super.setTurbo(true);
		super.setType("sports");
		super.setEnginePower(2500);
		super.setTireSize(250);
		super.setModelNo("SPORTSDEMO101");
	}
}
