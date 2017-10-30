import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class Job {
	protected String name;
	protected int pay;
	protected int requiredTech;
	protected int requiredSocial;
	protected int neededSwedishLevel;
	protected boolean neededEnglish;
	//private int difficulty;
	private static ArrayList<String> technicalJobNames = new ArrayList<String> (Arrays.asList("Engineer", "Software Specialist", "Technical Crew Member"));
	private static ArrayList<String> socialJobNames = new ArrayList<String> (Arrays.asList("Social Engineer", "Job Coach", "Administrator"));
	private static ArrayList<String> otherJobNames = new ArrayList<String> (Arrays.asList("Shop Assistant", "Cleaner", "Driver"));
	private static Random random;
	
	public Job(String name, int pay, int requiredTech, int requiredSocial,
			int neededSwedishLevel, boolean neededEnglish) {
		//super();
		this.name = name;
		this.pay = pay;
		this.requiredTech = requiredTech;
		this.requiredSocial = requiredSocial;
		this.neededSwedishLevel = neededSwedishLevel;
		this.neededEnglish = neededEnglish;
		//this.difficulty = difficulty;
	}
	
	
	public static String getRandomTechJobName(){
		int rndm = random.nextInt(technicalJobNames.size());
		return technicalJobNames.get(rndm);
		
	}
	
	public static String getRandomSocialJobName(){
		int rndm = random.nextInt(socialJobNames.size());
		return socialJobNames.get(rndm);
		
	}
	
	public static String getRandomOtherJobName(){
		int rndm = random.nextInt(otherJobNames.size());
		return otherJobNames.get(rndm);
		
	}
	
	
	
	
	
}
