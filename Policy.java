public class Policy
{
    
    // Instance fields for data
    private int policyNum, holderAge;
    private String providerName;
    private String holderFirstName, holderLastName;
    private boolean holderSmoker;
    private double holderHeight, holderWeight;

    /** No-arg constuctor with default values that accepts no arguments */
    public Policy()
    {
        policyNum = 12345;
        providerName = "Insurance Company";
        holderFirstName = "John";
        holderLastName = "Smith";
        holderAge = 25;
        holderSmoker = false;
        holderHeight = 66;
        holderWeight = 175;
    }

    /** Argument accepting constructor 
     * @param policyNum User's insurance policy number
     * @param providerName User's insurance provider
     * @param holderFirstName Policyholder's first name
     * @param holderLastName Policyholder's last name
     * @param holderAge Policyholder's age
     * @param holderSmoker Policyholder's smoking status (smoker or non-smoker)
     * @param holderHeight Policyholder's height
     * @param holderWeight Policyholder's weight
    */
    public Policy(int pNum, String provName, String first, String last, int age, boolean smoker, double height, double weight)
    {
        policyNum = pNum;
        providerName = provName;
        holderFirstName = first;
        holderLastName = last;
        holderAge = age;
        holderSmoker = smoker;
        holderHeight = height;
        holderWeight = weight;
    }

    /** Methods to set & get policy number */
    public void setPolicyNumber(int p)
    {
        policyNum = p;
    }
    public int getPolicyNumber()
    {
        return policyNum;
    }

    /** Methods to set & get name of insurance provider  */
    public void setProviderName(String pName)
    {
        providerName = pName;
    }
    public String getProviderName()
    {
        return providerName;
    }

    /** Set & get policyholder's first name */
    public void setFirstName(String hFirst)
    {
        holderFirstName = hFirst;
    }
    public String getFirstName()
    {
        return holderFirstName;
    }

    /** Set & get policyholder's last name */
    public void setLastName(String hLast)
    {
        holderLastName = hLast;
    }
    public String getLastName()
    {
        return holderLastName;
    }

    /** Set & get holder's age */
    public void setAge(int a)
    {
        holderAge = a;
    }
    public int getAge()
    {
        return holderAge;
    }

    /** Set & get smoking status */
    public void setSmoker(boolean s)
    {
        holderSmoker = s;
    }
    public boolean getSmoker()
    {
        return holderSmoker;
    }

    /** Set & get height */
    public void setHeight(double h)
    {
        holderHeight = h;
    }
    public double getHeight()
    {
        return holderHeight;
    }

    /** Set & get weight */
    public void setWeight(double w)
    {
        holderWeight = w;
    }
    public double getWeight()
    {
        return holderWeight;
    }

    /** Method to calculate BMI for policyholder
     * using provided data */
    public double calcBMI()
    {
       double bmi = (holderWeight * 703) / (Math.pow(holderHeight, 2.0)); // Math.pow method to raise a number to a power
       return bmi;
    }

    /** Calculates and returns insurance policy price
     * based on variables determined by user input */
    public double policyCost(double b)
    {
        double bmi = b;
        double polPrice = 600;

        if (holderAge > 50)
            polPrice += 75;
        
        if (holderSmoker == true)
            polPrice += 100;

        if (bmi > 35)
            polPrice += (bmi - 35) * 20;
        
        return polPrice;
    }
}