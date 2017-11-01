package Model;
import java.util.Random;


public class SaleHouseAdvert {
	
	private House saleHouse;
	private Random random;
	
	public SaleHouseAdvert(){
		int room = random.nextInt(5);
		int rent = 8000 + (3000*random.nextInt(room+1));
		int moralM = random.nextInt(21)*room;
		
		saleHouse = new House(moralM, room, rent);
		
	}

}
