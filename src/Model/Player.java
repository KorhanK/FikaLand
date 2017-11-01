package Model;
import java.util.ArrayList;


public class Player {
	private String name;
	
	private int money;
	private int morale;
	private int luck;
	
	private boolean isMarried;
	private int numberOfChildren;
	private Job job;
	private int technicalEducation;
	private int socialEducation;
	private ArrayList<String> friends;
	private int score;
	private House house;
	private int swedishLevel;
	private int englishLevel;
	private String dating = null;
	private int workingForMonths;
	private Time time;
	private ArrayList<String> achievements;
	
	public Player(int money, int morale, int luck, int englishLevel, int technicalEducation, int socialEducation) {
		//super();
		this.setMoney(money);
		this.morale = morale;
		this.luck = luck;
		this.englishLevel = englishLevel;
		this.isMarried = false;
		this.score = 0;
		this.technicalEducation = technicalEducation;
		this.socialEducation = socialEducation;
		friends = new ArrayList<String>();
		time = new Time();
		achievements = new ArrayList<String>();
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
			morale=0;
	}


	public int getTechnicalEducation() {
		return technicalEducation;
	}


	public void setTechnicalEducation(int technicalEducation) {
		this.technicalEducation = technicalEducation;
	}


	public int getSocialEducation() {
		return socialEducation;
	}


	public void setSocialEducation(int socialEducation) {
		this.socialEducation = socialEducation;
	}


	public int getSwedishLevel() {
		return swedishLevel;
	}


	public void setSwedishLevel(int swedishLevel) {
		this.swedishLevel = swedishLevel;
	}

	public void eat(){
		time.eatingThisTurn();
	}
	

	

}
