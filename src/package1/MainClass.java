package package1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
		
		QuizMethods app=new QuizMethods(scan);
		
		boolean isEntering=true;
		
		while(isEntering) {
		
		System.out.println("----------------------------");
		System.out.println("    Welcome to Quiz game    ");
		System.out.println("----------------------------");
		System.out.println("1. Start Quiz");
		System.out.println("2. Add Question");
		System.out.println("3. Exit");
		
		System.out.println("Enter the Operation number : ");
		int choice=scan.nextInt();
		scan.nextLine();
		switch(choice) {
			
		case 1:{
			app.start();
			break;
		}
		case 2:{
			app.addQuestions();
			break;
		}
		case 3:{
			break;
		}
		default:{
			System.out.println("Invalid Operation Number...");
			break;
		}
		}
		if(choice==3) {
			isEntering=false;
			System.out.println("ThankYou For Visiting.....");
		}
	}
	}

}
