public class Studentgrading {
    public static void main(String[] args) {
        // student details
        String name = "hari";
        byte rollno = 25;
        String subjects = "english, math, science";
        //marks in subjects
        byte english = 85;
        byte math = 90;
        byte science = 55;
        //total marks
        int totalmarks = 300;
        boolean passorfail = true;
        // operators calculation
        double averagemarks = english + math + science / 3;
        boolean pass = averagemarks >= 50;
        boolean passallsubjects = english > 50 || math > 50 || science > 50;
        // print student details
        System.out.println("name is " + name);
        System.out.println("rollno is " + rollno);
        System.out.println("subjects are " + subjects);
        System.out.println("marks in english is " + english);
        System.out.println("marks in math is " + math);
        System.out.println("marks in science is " + science);
        System.out.println("total marks is " + totalmarks);
        System.out.println("average marks is " + averagemarks);
        System.out.println("passorfail is " + passorfail);
        System.out.println("pass is " + pass);
        System.out.println("passallsubjects is " + passallsubjects);
        

    }
}
