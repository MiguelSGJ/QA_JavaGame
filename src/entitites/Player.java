package entitites;

public class Player {
	private Player name;
	private String nome;
	private int position;
	private boolean winStatus;
		
	public Player(Player name, int position, boolean winStatus) {
		this.name = name;
		this.position = position;
		this.winStatus = winStatus;
	}
	
	public Player(String nome) {
		this.nome = nome;
	}

	public Player getName() {
		return name;
	}
	
	public Player setName() {
		return name;
	}
	
	public String getNome() {
		return nome;
	}

	public int getPosition() {
		return position;
	}
	
	public boolean winStatus() {
		return winStatus;
	}
	
	public int rightAnswer() {
		return position++;
	}

	@Override
	public String toString() {
		return nome;
	}

	
}
