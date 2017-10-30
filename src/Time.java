
public class Time {
	
	private int year;
	private int month;
	private int apLeft;
	private boolean ateThisTurn;
	
	public Time() {
		this.year = 0;
		this.month = 0;
		this.apLeft = 5;
		this.ateThisTurn = false;
	}
	
	public void eatingThisTurn(){
		ateThisTurn = true;
		
	}
	
	

}
