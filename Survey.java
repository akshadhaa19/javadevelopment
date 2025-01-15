import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");
        int count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        count++;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        count++;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        count++;


        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        count++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        count++;
        scanner.close();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you " +name + " for answering all " + count +" questions");
        System.out.println("Weekly, you spend $"+ (coffeeAmount*coffeePrice) + " on coffee");
        System.out.println("Weekly, you spend $" +(foodAmount*foodPrice)+ " on food");

    }
}
