package package1;

import java.util.List;

public class QuizClass {
	
	private String question;
	private List<String> options;
	private int answer;
	
	
	public QuizClass(String question, List<String> options, int answer) {
		this.question = question;
		this.options = options;
		this.answer = answer;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public List<String> getOptions() {
		return options;
	}
	
	public boolean isCorrect(int ans) {
		return this.answer==ans;
	}

}
