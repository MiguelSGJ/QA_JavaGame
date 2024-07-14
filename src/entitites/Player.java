package entitites;

public class Player {
    private String nome;
    private int position;
    private boolean winStatus;

    public Player(String nome, int position, boolean winStatus) {
        this.nome = nome;
        this.position = position;
        this.winStatus = winStatus;
    }

    public Player(String nome) {
        this(nome, 0, false);
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

    public void rightAnswer() {
        this.position++;
    }

    @Override
    public String toString() {
        return nome;
    }
}
