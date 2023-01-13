import java.util.Scanner;

public class Exercise2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("Drive!");
        scan.close();
    }

    static void drive (String learning) {

        System.out.println("You are taking the driving test!");
        drive2(learning);

        String feedback = getFeedBack(learning);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            instructor(learning);

            // Recursive call
            drive(learning);
        } else if (feedback.equals("yes")) {
            drive1(learning);
        }
    }

    static void drive2(String learning) {
        System.out.println("Testing Driving Skills!");
    }

    static String getFeedBack(String learning) {
        System.out.println("Do I pass the Driving test? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void instructor(String learning) {
        System.out.print("Give advice or tips:");
        String advice = scan.next();
        System.out.println("Re taking driving test , while keeping in mind " + advice);
    }

    static void drive1(String learning) {
        System.out.println(" you are now qualified " + learning);
    }

}