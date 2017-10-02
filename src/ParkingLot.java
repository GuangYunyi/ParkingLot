
/*
 * to put it simply
 * assume that there are 3 floors in the parkinglot
 * each floor can only park one type of car
 * each floor contains 200 parkingspots
 * no parking fees
 */

public class ParkingLot {
	
	ParkingSpot spots[][]= new ParkingSpot[3][200];		// array of all the parkingspots
	Vehicle parkingvehicle;
	
	
	public void Parkinglot(Vehicle parkingvehicle) {
		
		
		if(parkingvehicle.parking==false) {  //finding parkinglot
		
			switch (parkingvehicle.vTypes){
		
				case motorcycle:	// if it is a motorcycle
					
					for(int i=0;i<200;i++) {
						
						if(spots[2][i].parked==false) {	// unparked
							spots[2][i].setparked();	// change parking status from unparked to parked
							spots[2][i].num=i;		// location
							spots[2][i].ID=parkingvehicle.ID;	// record the vehicle ID
							break;
						}
						
					}
					
					System.out.println("no parking area");	// all parkingspots are parked
					break;
			
					
					
					
				case car:	// if it is a car
					
					for(int i=0;i<200;i++) {
						
						if(spots[1][i].parked==false) {
							spots[1][i].setparked();
							spots[1][i].num=i;
							spots[1][i].ID=parkingvehicle.ID;
							break;
						}
						
					}
					
					System.out.println("no parking area");
					break;
					
					
					
					
				case bus:	// if it is a bus
					
					for(int i=0;i<200;i++) {
						
						if(spots[0][i].parked==false) {
							spots[0][i].setparked();
							spots[0][i].num=i;
							spots[0][i].ID=parkingvehicle.ID;
							break;
						}
						
					}
					
					System.out.println("no parking area");
					break;
			}
			
		}
		
		else {	// leaving parkinglot
			
			int i;
			
			switch (parkingvehicle.vTypes){
			
			case motorcycle:
				i=parkingvehicle.num;	// find the num of parkingspot(location of vehicle)
				spots[2][i].clearparked();	// change parking status from parked to unparked
				break;
		
			case car:
				i=parkingvehicle.num;
				spots[1][i].clearparked();
				break;
				
			case bus:
				i=parkingvehicle.num;
				spots[0][i].clearparked();
				break;
			}
		}
	}
}
