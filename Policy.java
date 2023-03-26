public class Policy
{
    
    // Instance fields for data
    private int policyNum;
    private String providerName;
    private PolicyHolder holder;

    /** No-arg constuctor with default values that accepts no arguments */
    public Policy()
    {
        policyNum = 12345;
        providerName = "Insurance Company";
    }

    /** Argument accepting constructor 
     * @param pNum User's insurance policy number
     * @param provName User's insurance provider
    */
    public Policy(int pNum, String provName, PolicyHolder hldr)
    {
        policyNum = pNum;
        providerName = provName;

        holder = new PolicyHolder(hldr);
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
    
    /** Method to calculate BMI for policyholder
     * using provided data */
    public double calcBMI()
    {
       double bmi = (holder.getWeight() * 703) / (Math.pow(holder.getHeight(), 2.0)); // Math.pow method to raise a number to a power
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

        if (holder.getAge() > 50)
            polPrice += 75;
        
        if (holder.getSmoker() == true)
            polPrice += 100;

        if (bmi > 35)
            polPrice += (bmi - 35) * 20;
        
        return polPrice;
    }

    public String toString()
    {
        String str = "Policy Number: " + policyNum +
                    "\nProvider Name: " + providerName +
                    "\n" + holder.toString() +
                    "\nPolicyholder's BMI: " + calcBMI() +
                    "\nPolicy Price: " + policyCost(calcBMI());
        return str;
    }
}