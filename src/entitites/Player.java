package entitites;

public class Player {
	private String name;
	private int[] position;
	private boolean winStatus;
		
	public Player(String name, int[] position, boolean winStatus) {
		this.name = name;
		this.position = position;
		this.winStatus = winStatus;
	}

	public String getName() {
		return name;
	}
	
	public int[] getPosition() {
		return position;
	}
	
	public int rightAnswer() {
		return position[1]++;
	}
	
	public boolean winner() {
		winStatus = true;
		return winStatus;
	}
	
}
