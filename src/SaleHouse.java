
public class SaleHouse extends House {
	
	private int price;
	private int pricePerMonth;
	private final int dividingNumber = 500;

	public SaleHouse(int moraleModifier, int room, int price) {
		super(moraleModifier, room);
		this.price = price;
		
	}
	
	public int getPricePerMonth(){
		return price/500;
		
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

}
