import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sIn = new Scanner(System.in);

        // EXAMPLE OF THE USAGE OF THE METHOD

        double housePrice = goodDouble(sIn, "What is the value of the property? ", "Please enter a number!\n");

        System.out.println("The price of your house is: " + housePrice);
    }

    public static double goodDouble(Scanner sIn, String question, String error) {

        double userinput = (double) 0;

        boolean done = false;

        do {
            System.out.print(question);
            String input = sIn.nextLine();

            try {
                userinput = Double.parseDouble(input);
                done = true;

            } catch (Exception e) {
                System.out.print(error);
            }

        } while (!done);
        return userinput;

    }
}
