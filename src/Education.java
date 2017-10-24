
public class Education {

	private boolean isTechnical;
	private boolean isSocial;
	private int levelOfEducation;
	private boolean isFinished;
	
	


	public Education(boolean isTechnical, boolean isSocial, int lvl, boolean isFinished){
		
		this.isTechnical = isTechnical;
		this.isSocial = isSocial;
		this.levelOfEducation = lvl;
		this.isFinished = isFinished;
		
	}
	
	
	public boolean isFinished() {
		return isFinished;
	}
	
	

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public int getLevelOfEducation() {
		return levelOfEducation;
	}

		
	
}
