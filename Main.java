// A simple Java program that demonstrate all the given control statements in the question
public class Main {

    public static void main(String[] args) {
        // Java if...else statement
        int x = 10;
        int y = 20;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("y is greater than x");
        }

        // Java switch statement
        int month = 4;
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
        }
        System.out.println("The name of the month is " + monthName);

        // Java for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Java for-each loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("number = " + number);
        }

        // Java while loop
        int n = 1;
        while (n <= 10) {
            System.out.println("n = " + n);
            n++;
        }

        // Java break statement
        for (int j = 1; j <= 10; j++) {
            if (j == 6) {
                break; // exit the loop when j is 6
            }
            System.out.println("j = " + j);
        }

        // Java continue statement
        for (int k = 1; k <= 10; k++) {
            if (k % 2 == 0) {
                continue; // skip the even numbers
            }
            System.out.println("k = " + k);
        }
    }
}
