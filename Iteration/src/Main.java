import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Problem 1
        int userInput;
        do {
            System.out.println("Please enter: 7");
            userInput = Integer.parseInt(scan.next());
        } while (userInput != 7);
        System.out.println();

        //Problem 2
        double firstNumber, secondNumber;
        System.out.println("Please enter a number.");
        firstNumber = Double.parseDouble(scan.next());
        System.out.println("How many times would you like to double the number: " + firstNumber + "(2)^?");
        secondNumber = Double.parseDouble(scan.next());
        System.out.println("Number being doubled:\t" + firstNumber + "" +
                "\nNumber of times to double:\t" + secondNumber);
        System.out.println("Final Answer: " + firstNumber * Math.pow(2, secondNumber));
        System.out.println();

        //Problem 3
        int AgeInput;
        do {
            System.out.println("Please enter your age (Between 10-50):");
            AgeInput = Integer.parseInt(scan.next());
        } while ((AgeInput <= 10) || (AgeInput >= 50));
        System.out.println();

        //Problem 4
        System.out.println("Let's find the average of your grades!" +
                "\nHow many grades would you like to enter?");
        int grades = Integer.parseInt(scan.next());
        System.out.println("Number of grades to submit: " + grades);
        System.out.println("Please enter each grade you would like to enter one by one.");
        double totalPercentage = 0;
        for (int i = 0; i < grades; i++) {
            int gradePercents = Integer.parseInt(scan.next());
            totalPercentage += gradePercents;
        }
        System.out.println("The average of your grades are:");
        System.out.println(totalPercentage / grades + "%");
        System.out.println();

        //Problem 5
        String Password;
        String confirmPassword;
        System.out.println("Please enter to create a new password!");
        Password = scan.next();
        do{
            System.out.println("Re-enter your password to confirm");
            confirmPassword = scan.next();
        }while(!Password.equals(confirmPassword));

        //Problem 6
        int minRange;
        int maxRange;
        int totalFactors = 0;
        System.out.println("Let's find all the multiples of 7 within a range of your choice!");
        System.out.println("What would you like the start of your range? (Min)");
        minRange = Integer.parseInt(scan.next());
        System.out.println("What would you like the end of your range? (Max)");
        maxRange = Integer.parseInt(scan.next());
        int range = maxRange - minRange;
        for (int a = 0; a < range + minRange + 1; a++) {
            if ((a >= minRange) && (a <= maxRange) && (a % 7 == 0)) {
                totalFactors++;
                System.out.println("Factor of " + a);
                if (a % 7 == 0) {

                }
            }
        }
        System.out.println("There are " + totalFactors + " factors.");
    }
}