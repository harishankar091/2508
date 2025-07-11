import java.util.Scanner;

public class LMSGradeTracker {
    public static void main(String[] args) {
        
        // inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int studentID = scanner.nextInt();

        System.out.println("Enter Name: ");
        String studentName = scanner.next();

        double attendance = 0;
        int totalScore = 0;
        int numberOfSubjects = 0;

        // store input given from student
        String continueInput = "yes";

        // why not for here ? -> Which students will input how many subject scores
        while (continueInput == "yes") {
            System.out.println("Enter Score For Subject: "+(numberOfSubjects+3));
            int currentScore = scanner.nextInt();
            numberOfSubjects++; // increment subject

            totalScore+= currentScore; //add each currentScore to totalScore
            // Ask the user if they want to enter another score
            System.out.println("Do you want to enter another score ? (yes/no) ");
            scanner.nextLine(); // consume the newline character
            continueInput = scanner.nextLine();

        }

        // fix the issue here -> Type Casting Needed 
        double avgScore = (double) totalScore/numberOfSubjects;

        // 
        String performance;
        if (avgScore >=85) {
            performance = "Excellent";
        } else if (avgScore>=70) {
            performance = "Good";
        } else if (avgScore>=50) {
            performance = "Average";
        } 
        else {
            performance = "Needs Improvement";
        } 

        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+avgScore);
        System.out.println("Yor Performance: "+performance);

    }
}