package Model;
import java.util.ArrayList;
import java.util.Random;


public class JobAdvert{
	
	private ArrayList<Job> threeJobsList;
	private Random random;
	private String name;
	private int pay;
	private int requiredTech;
	private int requiredSocial;
	private int neededSwedishLevel;
	private boolean neededEnglish;
	
	
	
	public JobAdvert(){
		threeJobsList = new ArrayList<Job>();
		for (int i = 0; i < 3; i++ ){
			int rndm = random.nextInt(3);
			switch (rndm){
				case 0: name = Job.getRandomTechJobName();
						pay = random.nextInt(10000)+20000;
						requiredTech = 60 + random.nextInt(40);
						requiredSocial = 0;
						neededSwedishLevel = random.nextInt(100);
						int boolRndm = random.nextInt(1);
						if (boolRndm==0)
							neededEnglish = true;
						else
							neededEnglish = false;
						Job techJob = new Job(name, pay, requiredTech, requiredSocial, neededSwedishLevel, neededEnglish);
						threeJobsList.add(techJob);
						break;
				
				case 1: name = Job.getRandomSocialJobName();
				pay = random.nextInt(8000)+20000;
				requiredTech = 0;
				requiredSocial = 60 + random.nextInt(40);
				neededSwedishLevel = random.nextInt(100);
				int boolRndm1 = random.nextInt(1);
				if (boolRndm1==0)
					neededEnglish = true;
				else
					neededEnglish = false;
				Job socialJob = new Job(name, pay, requiredTech, requiredSocial, neededSwedishLevel, neededEnglish);
				threeJobsList.add(socialJob);
				break;
				
				case 2: name = Job.getRandomOtherJobName();
				pay = random.nextInt(5000)+20000;
				requiredTech = random.nextInt(40);
				requiredSocial = random.nextInt(40);
				neededSwedishLevel = random.nextInt(100);
				int boolRndm2 = random.nextInt(1);
				if (boolRndm2==0)
					neededEnglish = true;
				else
					neededEnglish = false;
				Job otherJob = new Job(name, pay, requiredTech, requiredSocial, neededSwedishLevel, neededEnglish);
				threeJobsList.add(otherJob);
				break;
			}
		}
				
		
		
	}

}
