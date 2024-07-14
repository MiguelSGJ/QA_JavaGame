package entitites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
    private String question;
    private String correctAnswer;
    private List<String> options;

    public Question(String question, String correctAnswer, String optionA, String optionB, String optionC, String optionD) {
        this.question = question;
        this.options = new ArrayList<>();
        this.options.add(optionA);
        this.options.add(optionB);
        this.options.add(optionC);
        this.options.add(optionD);

        Collections.shuffle(this.options);
        this.correctAnswer = getOptionLetter(correctAnswer);
    }

    private String getOptionLetter(String answer) {
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).equals(answer)) {
                return String.valueOf((char) ('A' + i));
            }
        }
        return null;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getFormattedQuestion() {
        return question + "\n" +
                "A - " + options.get(0) + "\n" +
                "B - " + options.get(1) + "\n" +
                "C - " + options.get(2) + "\n" +
                "D - " + options.get(3);
    }
}
