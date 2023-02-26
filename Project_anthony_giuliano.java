
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_anthony_giuliano {
    public static void main(String[] args) throws IOException
    {
        // Establish & declare variables
        int policyNumber = 0, age = 0;
        String provider = "", firstName = "", lastName = "", smokeStatus = "";
        boolean smoker = false;
        double height = 0, weight = 0, bodyMass = 0;

        // Set up file object
        // Chose to specify full file pathname due to CSC251Project folder not being recognized when using just the filename.
        File myFile = new File("C:/Users/Antho/OneDrive/Documents/CPCC School/Programming Files/CSC251 Advanced JAVA Programming/GitHub/CSC251Project/PolicyInformation.txt");

        // Set up scanner for file input
        Scanner readFile = new Scanner(myFile);

        while(readFile.hasNext())
        {
            // Create ArrayList to hold all the policies
            ArrayList<Policy> policyList = new ArrayList<Policy>();


            // Collect input from file
            policyNumber = readFile.nextInt();
            readFile.nextLine(); // Clear out keyboard buffer
           
            provider = readFile.nextLine();
            firstName = readFile.nextLine();
            lastName = readFile.nextLine();
            age = readFile.nextInt();
            readFile.nextLine(); // buffer clear
            
            smokeStatus = readFile.nextLine();
            height = readFile.nextDouble();
            weight = readFile.nextDouble();

            // Set smoker boolean variable using string input from user
            if (smokeStatus.equalsIgnoreCase("smoker"))
            {   
                smoker = true;
            }
            else if (smokeStatus.equalsIgnoreCase("non-smoker"))
            {
                smoker = false;
            }
            // Create Policy object using input data
            Policy userPolicy = new Policy(policyNumber, provider, firstName, lastName, age, smoker, height, weight);

            // Add policy to policyList ArrayList
            policyList.add(userPolicy);

            // Determine BMI and store to variable for output
            bodyMass = userPolicy.calcBMI();

            // Format and display output
            System.out.println("Policy Number: " + userPolicy.getPolicyNumber());
            System.out.println("Provider Name: " + userPolicy.getProviderName());
            System.out.println("Policyholder's First Name: " + userPolicy.getFirstName());
            System.out.println("Policyholder's Last Name: " + userPolicy.getLastName());
            System.out.println("Policyholder's Age: " + userPolicy.getAge());
            System.out.println("Policyholder's Smoking Status: " + smokeStatus);
            System.out.printf("Policyholder's Height: %.1f inches", userPolicy.getHeight());
            System.out.printf("\nPolicyholder's Weight: %.1f pounds", userPolicy.getWeight());
            System.out.printf("\nPolicyholder's BMI: %.2f", bodyMass);
            System.out.printf("\nPolicy Price: $%.2f", userPolicy.policyCost(bodyMass));
            System.out.print("\n\n");
        }
       
        // Close file scanner
        readFile.close();
    }
}