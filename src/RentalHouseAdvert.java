import java.util.Random;


public class RentalHouseAdvert{
	
	private House rentalHouse;
	private Random random;
	
	public RentalHouseAdvert(){
		int room = random.nextInt(5);
		int rent = 10000 + (2000*random.nextInt(room+1));
		int moralM = random.nextInt(11)*room;
		
		rentalHouse = new House(moralM, room, rent);
		
	}
	
	

}
