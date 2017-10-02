
public class ParkingSpot {
	
	// Types of Parking Spot
	enum Types{
		motorcycle,
		car,
		bus;
	}
	
	protected Types pTypes;
	boolean parked=false;		// the first stage is unparked
	protected String ID;		// license number of vehicle
	protected int num;		// location of the parking spot
	
	// 	put the information of the vehicle into parking spot
	public ParkingSpot(String ID, Types pTypes ) {
		this.ID= ID;
		this.pTypes= pTypes;
	}
	
	
	//	park a vehicle and change the state
	public void setparked() {
		parked=true;
	}
	
	// vehicle leaves and state changes again
	public void clearparked() {
		parked=false;
	}
}
