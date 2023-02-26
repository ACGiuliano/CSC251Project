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
     * @param pNum User's insurance policy number
     * @param provName User's insurance provider
     * @param first Policyholder's first name
     * @param last Policyholder's last name
     * @param age Policyholder's age
     * @param smoker Policyholder's smoking status (smoker or non-smoker)
     * @param height Policyholder's height
     * @param weight Policyholder's weight
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

    /** Method to set policy number
     * @param p User's policy number 
     */
    public void setPolicyNumber(int p)
    {
        policyNum = p;
    }

    /** Method to get policy number
     * @return Returns the user's policy number
     */
    public int getPolicyNumber()
    {
        return policyNum;
    }

    /** Method to set name of insurance provider
     * @param pName Insurance provider's name
      */
    public void setProviderName(String pName)
    {
        providerName = pName;
    }

    /** Method to get insurance provider's name
     * @return Returns user's insurance provider name
     */
    public String getProviderName()
    {
        return providerName;
    }

    /** Sets policyholder's first name
     * @param hFirst User's first name
     */
    public void setFirstName(String hFirst)
    {
        holderFirstName = hFirst;
    }

    /** Method to get user's first name
     * @return Returns user's first name
     */
    public String getFirstName()
    {
        return holderFirstName;
    }

    /** Set policyholder's last name
     * @param hLast Policy holder's last name
     */
    public void setLastName(String hLast)
    {
        holderLastName = hLast;
    }

    /** Get user's last name
     * @return Returns policyholder's last name
     */
    public String getLastName()
    {
        return holderLastName;
    }

    /** Set holder's age
     * @param a Policyholder's age
     */
    public void setAge(int a)
    {
        holderAge = a;
    }

    /** Get user's age
     * @return Returns policyholder's age
     */
    public int getAge()
    {
        return holderAge;
    }

    /** Set smoking status
     * @param s Policyholder's smoking status
     */
    public void setSmoker(boolean s)
    {
        holderSmoker = s;
    }

    /** Get smoking status
     * @return Return's policyholder's smoking status
     */
    public boolean getSmoker()
    {
        return holderSmoker;
    }

    /** Set height
     * @param h Policyholder's height
     */
    public void setHeight(double h)
    {
        holderHeight = h;
    }

    /** Get height
     * @return Policyholder's height
     */
    public double getHeight()
    {
        return holderHeight;
    }

    /** Set weight
     * @param w Policyholder's weight
     */
    public void setWeight(double w)
    {
        holderWeight = w;
    }

    /** Get weight
     * @return Returns policyholder's weight
     */
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
     * based on variables determined by user input
     * @param b Policyholder's BMI
     * @return Returns Policyholder's calculated price for policy */
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