package encapsulation;

public class testtrainer {
    public static void main(String[] args) {

        // set the student id 
        teststudent hari = new teststudent();
        hari.setId(100);
        // get the student id
        System.out.println("The student id is:" + hari.getId());
    }

}
