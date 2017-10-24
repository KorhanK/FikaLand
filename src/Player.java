import java.util.ArrayList;


public class Player {
	private int money;
	private int morale;
	private int luck;
	private boolean knowsEnglish;
	private boolean isMarried;
	private int numberOfChildren;
	private Job job;
	private Education primaryEducation;
	private Education secondaryEducation;
	private ArrayList <String> friends;
	private int score;
	private House house;
	private Swedish swedishLevel;
	
	public Player(int money, int morale, int luck, boolean knowsEnglish) {
		super();
		this.setMoney(money);
		this.morale = morale;
		this.luck = luck;
		this.knowsEnglish = knowsEnglish;
		this.isMarried = false;
		//this.numberOfChildren = numberOfChildren;
		//this.job = job;
		//this.education = education;
		//this.friends = friends;
		this.score = 0;
		//this.house = house;
		//this.swedishLevel = swedishLevel;
		
		friends = new ArrayList<String>();
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void addFriend(String friendName){
		friends.add(friendName);
		
	}
	
	public void createEducation(boolean isTechnical, boolean isSocial, int lvl, boolean isFinished) {
		primaryEducation = new Education(isTechnical, isSocial, lvl, isFinished);
		
	}
	
	public void getMarried(){
		isMarried = true;
		
	}
	
	public void haveAChild(){
		numberOfChildren++;
		
	}
	
	public void moraleUp(int number){
		morale = morale + number;
		if (morale > 100)
			morale = 100;
		
	}
	
	public void moraleDown(int number){
		morale = morale - number;
		if (morale < 0)
			morale = 0;
		
	}
	
	

}
