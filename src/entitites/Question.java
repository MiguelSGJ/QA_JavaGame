package entitites;

public class Question {
	private String question;
	private char answer;
	
	public String getQuestion() {
		return question;
	}

	public char getAnswer() {
		return answer;
	}

	public Question(String question, char answer) {
		this.question = question;
		this.answer = answer;
	}
	
}
