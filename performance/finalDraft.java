import java.util.*;

public class finalDraft {
	public static void main(String[] args) {
		finalDraft program = new finalDraft();
		int points = 0;
		String selectedData = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("For this game you must:\n" + "Get Data -> give to runner -> wait for answer -> enter answer\n");

		int number = program.randomNumber(3);
		if (number == 1) {
			selectedData = "DBZ6SS";
		} else if (number == 2) {
			selectedData = "MD7X4";
		} else {
			selectedData = "Z53E59";
		} // end if
	
		System.out.println("Your first piece of data is: " +selectedData);
		
		int fails = 0;
		boolean keepGoing = true;
		int answerNumber = program.randomNumber(2);
		if (answerNumber == 1) {
			while (keepGoing && fails < 3) {
				System.out.println("How do you want to fix this issue? ");
				String answer = scanner.nextLine();
				if (selectedData.equals("DBZ6SS") && answer.equals("10")) {
					points++;
					keepGoing = false;
		 		} else if (selectedData.equals("MD7X4") && answer.equals("clock")) {
					points++;
					keepGoing = false;
				} else if (selectedData.equals("Z53E59") && answer.equals("chair")) {
					points++;
					keepGoing = false;
				} else {
					System.out.println("This is not the correct answer...");
					fails++;
				} // end if
			} // end while
		} else {
			while (keepGoing && fails < 3) {
                                System.out.println("How do you want to fix this issue? ");
                                String answer = scanner.nextLine();
                                if (selectedData.equals("DBZ6SS") && answer.equals("i")) {
                                        points++;
                                        keepGoing = false;
                                } else if (selectedData.equals("MD7X4") && answer.equals("watch")) {
                                        points++;
                                        keepGoing = false;
                                } else if (selectedData.equals("Z53E59") && answer.equals("fish")) {
                                        points++;
                                        keepGoing = false;
                                } else {
                                        System.out.println("This is not the correct answer...");
                                        fails++;
                                } // end if
                        } // end while
		} // end if
		
		 if (number == 1) {
                        selectedData = "Z53E59";
                } else if (number == 2) {
                        selectedData = "DBZ6SS";
                } else {
                        selectedData = "MD7X4";
                } // end if

                System.out.println("\nYour next piece of data is: " +selectedData);

               	fails = 0;
                keepGoing = true;
                answerNumber = program.randomNumber(2);
                if (answerNumber == 1) {
                        while (keepGoing && fails < 3) {
                                System.out.println("How do you want to fix this issue? ");
                                String answer = scanner.nextLine();
                                if (selectedData.equals("DBZ6SS") && answer.equals("10")) {
                                        points++;
                                        keepGoing = false;
                                } else if (selectedData.equals("MD7X4") && answer.equals("clock")) {
                                        points++;
                                        keepGoing = false;
                                } else if (selectedData.equals("Z53E59") && answer.equals("chair")) {
                                        points++;
                                        keepGoing = false;
                                } else {
                                        System.out.println("This is not the correct answer...");
                                        fails++;
                                } // end if
                        } // end while
                } else {
			while (keepGoing && fails < 3) {
                                System.out.println("How do you want to fix this issue? ");
                                String answer = scanner.nextLine();
                                if (selectedData.equals("DBZ6SS") && answer.equals("i")) {
                                        points++;
                                        keepGoing = false;
                                } else if (selectedData.equals("MD7X4") && answer.equals("watch")) {
                                        points++;
                                        keepGoing = false;
                                } else if (selectedData.equals("Z53E59") && answer.equals("fish")) {
                                        points++;
                                        keepGoing = false;
                                } else {
                                        System.out.println("This is not the correct answer...");
                                        fails++;
                                } // end if
                        } // end while
                } // end if

		number = program.randomNumber(4);
		if (number == 1) {
                        selectedData = "101011";
                } else if (number == 2) {
                        selectedData = "111011";
		} else if (number == 3) {
			selectedData = "100110";
                } else {
                        selectedData = "001011";
                } // end if

		System.out.println("\nYour next piece of data is: " + selectedData);

		keepGoing = true;
		fails = 0;
		while (keepGoing && fails < 3) {
			System.out.println("How do you want to fix this issue? ");
			String answer = scanner.nextLine();
			if (selectedData.equals("101011") && answer.equals("43")) {
				points++;
				keepGoing = false;
			} else if (selectedData.equals("111011") && answer.equals("59")) {
				points++;
				keepGoing = false;
			} else if (selectedData.equals("100110") && answer.equals("38")) {
				points++;
				keepGoing = false;
			} else if (selectedData.equals("001011") && answer.equals("11")) {
				points++;
				keepGoing = false;
			} else {
				System.out.println("This is not the correct answer...");
				fails++;
			} // end if
		} // end while

		number = program.randomNumber(4);
                if (number == 1) {
                        selectedData = "IQTL";
			System.out.println("\nYour next piece of data is: " + selectedData + " and the key is 5.");
                } else if (number == 2) {
                        selectedData = "GQHLUI";
			System.out.println("\nYour next piece of data is: " + selectedData + " and the key is 3.");
                } else if (number == 3) {
                        selectedData = "HFHLS";
			System.out.println("\nYour next piece of data is: " + selectedData + " and the key is 3.");
                } else {
                        selectedData = "IPKOCI";
			System.out.println("\nYour next piece of data is: " + selectedData + " and the key is 2.");
                } // end if

		keepGoing = true;
                fails = 0;
                while (keepGoing && fails < 3) {
                        System.out.println("How do you want to fix this issue? ");
                        String answer = scanner.nextLine();
                        if (selectedData.equals("IQTL") && answer.equals("gold")) {
                                points++;
                                keepGoing = false;
                        } else if (selectedData.equals("GQHLUI") && answer.equals("friend")) {
                                points++;
                                keepGoing = false;
                        } else if (selectedData.equals("HFHLS") && answer.equals("piece")) {
                                points++;
                                keepGoing = false;
                        } else if (selectedData.equals("IPKOCI") && answer.equals("gaming")) {
                                points++;
                                keepGoing = false;
                        } else {
                                System.out.println("This is not the correct answer...");
                                fails++;
                        } // end if
                } // end while

		 if (number == 1) {
                        selectedData = "IPKOCI";
                        System.out.println("\nYour next piece of data is: " + selectedData + " and the key is 2.");
                } else if (number == 2) {
                        selectedData = "IQTL";
                        System.out.println("\nYour next piece of data is: " + selectedData + " and the key is 5.");
                } else if (number == 3) {
                        selectedData = "GQHLUI";
                        System.out.println("\nYour next piece of data is: " + selectedData + " and the key is 3.");
                } else {
                        selectedData = "HFHLS";
                        System.out.println("\nYour next piece of data is: " + selectedData + " and the key is 3.");
                } // end if

                keepGoing = true;
                fails = 0;
                while (keepGoing && fails < 3) {
                        System.out.println("How do you want to fix this issue? ");
                        String answer = scanner.nextLine();
                        if (selectedData.equals("IQTL") && answer.equals("gold")) {
                                points++;
                                keepGoing = false;
                        } else if (selectedData.equals("GQHLUI") && answer.equals("friend")) {
                                points++;
                                keepGoing = false;
                        } else if (selectedData.equals("HFHLS") && answer.equals("piece")) {
                                points++;
                                keepGoing = false;
                        } else if (selectedData.equals("IPKOCI") && answer.equals("gaming")) {
                                points++;
                                keepGoing = false;
                        } else {
                                System.out.println("This is not the correct answer...");
                                fails++;
                        } // end if
                } // end while

		number = program.randomNumber(2);
		if (number == 1) {
			selectedData = "C + G * X - Z";
		} else {
			selectedData = "T * G - C + Z";
		} // end if
		
		System.out.println("\nYour final piece of data is: " + selectedData);

		keepGoing = true;
                fails = 0;
                while (keepGoing && fails < 3) {
                        System.out.println("How do you want to fix this issue? ");
                        String answer = scanner.nextLine();
                        if (selectedData.equals("C + G * X - Z") && answer.equals("3")) {
                                points++;
                                keepGoing = false;
                        } else if (selectedData.equals("T * G - C + Z") && answer.equals("9")) {
                                points++;
                                keepGoing = false;
                        } else {
                                System.out.println("This is not the correct answer...");
                                fails++;
                        } // end if
                } // end while

		System.out.println("You earned " + points + " points in this game!");
	} // end main
	
	public int randomNumber(int limit) {
		Random random = new Random();
                int randomInteger = (int) (Math.random() * limit) + 1;
		return randomInteger;
	} // end random()

} // end finalDraft
