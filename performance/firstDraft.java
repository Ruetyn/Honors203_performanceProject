import java.util.*;

public class firstDraft {
	public static void main(String[] args) {
		Random random = new Random();
		int randomInteger = (int) (Math.random() * 3) + 1;
		String givenString = "";

		if(randomInteger == 1) {
			givenString = "DF6K04";
		} else if(randomInteger == 2) {
			givenString = "QZQ43P";
		} else {
			givenString = "ZY7J25";
		} // end if

		boolean keepGoing = true;
		int attempts = 0;
		while(keepGoing) {
			System.out.println("Your error is: " + givenString);
                	Scanner scanner = new Scanner(System.in);
                	System.out.println("How do you want to fix this error? ");
                	String fix = scanner.nextLine();
			attempts++;
			if(givenString.equals("DF6K04") && fix.equals("One")) {
				System.out.println("Correct, you did it in " + attempts + " attempts!");
				keepGoing = false;
			} else if(givenString.equals("QZQ43P") && fix.equals("Too")) {
				System.out.println("Correct, you did it in " + attempts + " attempts!");
				keepGoing = false;
			} else if(givenString.equals("ZY7J25") && fix.equals("3")) {
				System.out.println("Correct, you did it in " + attempts + " attempts!");
				keepGoing = false;
			} else {
				System.out.println("Attempt " + attempts + ") Incorrect try again!");
			} // end if
		} // end while

		randomInteger = (int) (Math.random() * 3) + 1;
                givenString = "";

                if(randomInteger == 1) {
                        givenString = "100101";
                } else if(randomInteger == 2) {
                        givenString = "110110";
                } else {
                        givenString = "011101";
                } // end if

                keepGoing = true;
                int codeAttempts = 0;
                while(keepGoing) {
                        System.out.println("Your code is: " + givenString);
			Scanner scanner = new Scanner(System.in);
                        System.out.println("How do you want to satisfiy this code? ");
                        String fix = scanner.nextLine();
                        codeAttempts++;
                        if(givenString.equals("100101") && fix.equals("37")) {
                                System.out.println("Correct, you did it in " + codeAttempts + " attempts!");
                                keepGoing = false;
                        } else if(givenString.equals("110110") && fix.equals("54")) {
                                System.out.println("Correct, you did it in " + codeAttempts + " attempts!");
                                keepGoing = false;
                        } else if(givenString.equals("011101") && fix.equals("29")) {
                                System.out.println("Correct, you did it in " + codeAttempts + " attempts!");
                                keepGoing = false;
                        } else {
                                System.out.println("Attempt " + codeAttempts + ") Incorrect try again!");
                        } // end if
		} // end while

		int totalAttempts = attempts+codeAttempts;
		System.out.println("You're done, you completed the whole thing in " + totalAttempts + " attempts!");
	}
} // end firstDraft
