package package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMethods {
	
	private Scanner scan;
	private List<QuizClass> ques;
	private int score=0;
	
	public QuizMethods(Scanner scan) {
		this.scan=scan;
		this.ques=new ArrayList<>();
	}
	
	public void addQuestions() {
		int num=1;
		List<String> opt=new ArrayList<>();
		System.out.println("Enter the question : ");
		String question=scan.nextLine();
		for(int i=0;i<4;i++) {
			System.out.println("Enter the Option "+ num +" : ");
			String options=scan.nextLine();
			opt.add(options);
			num++;
		}
		
		System.out.println("Enter the Correct Answer number : ");
		int answer=scan.nextInt();
		
		
		ques.add(new QuizClass(question,opt,answer-1));
		
		System.out.println("Questions Added...");
	}
	
	public  int checkAnswer(Scanner scan, int min, int max) {
		int choice;
		
		while(true) {
			System.out.println("Your answer ("+min+" - "+max+")");
			if(scan.hasNext()) {
				choice=scan.nextInt();
				scan.nextLine();
				if(choice >=min && choice <=max) { 
					break;
				}
				else {
	                System.out.println("Invalid input. Try again!");
	            }
			}
			else {
	            scan.nextLine(); 
	            System.out.println("Please enter a valid number.");
	        }
		}
		return choice;
	}
	
	public void result() {
		
		System.out.println("-------------------------");
		System.out.println("          Result         ");
		System.out.println("-------------------------");
		System.out.println("Score : "+score+"/"+ques.size());
		double percent=(score*100)/ques.size();
		System.out.println("Your Score : "+percent);
		if(percent>=80) {
			System.out.println("Great Job");
		}
		if(percent<=79 && percent>=50) {
			System.out.println("Good Effort");
		}
		if(percent<=49 && percent>=0) {
			System.out.println("Keep Practising !...");
		}
		score=0;
	}
	
	public void start() {
		int number=1;
		
		for(QuizClass quiz:ques) {
			System.out.println("\nQuestion "+number+") "+quiz.getQuestion());
			List<String> opt=quiz.getOptions();
			for(int i=0;i<opt.size();i++) {
				System.out.println(i+1 + ")" +opt.get(i));
			}
			int ans=checkAnswer(scan, 1, opt.size());
			
			if(quiz.isCorrect(ans-1)) {
				System.out.println("Correct...");
				score++;
			}
			else {
				System.out.println("Wrong Answer!!");
			}
			number++;
		}
	result();	
	}

}
