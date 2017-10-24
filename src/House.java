
public class House {
	private int moraleModifier;
	private int room;

	public House(int moraleModifier, int room) {
		//super();
		this.setMoraleModifier(moraleModifier);
		this.room = room;
	}

	public int getMoraleModifier() {
		return moraleModifier;
	}

	public void setMoraleModifier(int moraleModifier) {
		this.moraleModifier = moraleModifier;
	}

	
	

}
