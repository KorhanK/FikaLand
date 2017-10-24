
public class RentalHouse extends House {
	
	private int rent;
	
	public RentalHouse(int moraleModifier, int room, int rent) {
		super(moraleModifier, room);
		this.rent = rent;
		
	}

	public int getRent() {
		return rent;
	}


	public void setRent(int rent) {
		this.rent = rent;
	}


	

}
