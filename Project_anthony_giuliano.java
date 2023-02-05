
import java.util.Scanner;

public class Project_anthony_giuliano {
    public static void main(String[] args)
    {
        // Establish & declare variables
        int policyNumber = 0, age = 0;
        String provider = "", firstName = "", lastName = "", smokeStatus = "";
        boolean smoker = false;
        double height = 0, weight = 0, bodyMass = 0;

        // Set up scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Begin user prompts & input
        System.out.print("Please enter the Policy Number: ");
        policyNumber = keyboard.nextInt();
        keyboard.nextLine(); // Clear out keyboard buffer

        System.out.print("\nPlease enter the Provider Name: ");
        provider = keyboard.nextLine();

        System.out.print("\nPlease Enter the Policyholder's First Name: ");
        firstName = keyboard.nextLine();

        System.out.print("\nPlease enter the Policyholder's Last Name: ");
        lastName = keyboard.nextLine();

        System.out.print("\nPlease enter the Policyholder's Age: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // buffer clear

        System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        smokeStatus = keyboard.nextLine();

        System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
        height = keyboard.nextDouble();

        System.out.print("\nPlease enter the Policyholder's weight (in pounds): ");
        weight = keyboard.nextDouble();

        // Set smoker boolean variable using string input from user
        if (smokeStatus.equalsIgnoreCase("smoker"))
            smoker = true;
        else if (smokeStatus.equalsIgnoreCase("non-smoker"))
            smoker = false;

        // Create Policy object using input data
        Policy userPolicy = new Policy(policyNumber, provider, firstName, lastName, age, smoker, height, weight);

        // Determine BMI and store to variable for output
        bodyMass = userPolicy.calcBMI();

        // Format and display output
        System.out.println("Policy Number: " + userPolicy.getPolicyNumber());
        System.out.println("Provider Name: " + userPolicy.getProviderName());
        System.out.println("Policyholder's First Name: " + userPolicy.getFirstName());
        System.out.println("Policyholder's Last Name: " + userPolicy.getLastName());
        System.out.println("Policyholder's Age: " + userPolicy.getAge());
        System.out.println("Policyholder's Smoking Status: " + smokeStatus);
        System.out.printf("Policyholder's Height: %.1f", userPolicy.getHeight());
        System.out.printf("\nPolicyholder's Weight: %.1f", userPolicy.getWeight());
        System.out.printf("\nPolicyholder's BMI: %.2f", bodyMass);
        System.out.printf("\nPolicy Price: $%.2f", userPolicy.policyCost(bodyMass));
    }
}