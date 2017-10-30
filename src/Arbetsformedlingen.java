import java.util.Random;


public class Arbetsformedlingen {
	
	private Job arbetsJob;
	private Random random;
	
	public Arbetsformedlingen(){
		int areYouLucky = random.nextInt(10);
		if (areYouLucky==0){
			arbetsJob = new Job (Job.getRandomOtherJobName(), 18000, random.nextInt(player.getTechnicalEducation()), random.nextInt(player.getSocialEducation()), random.nextInt(player.getSwedishLevel()), false);
		}
		else
			arbetsJob = null;
		
		
	}

}
