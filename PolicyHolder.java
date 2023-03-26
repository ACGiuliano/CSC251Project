public class PolicyHolder
{
    // Intance fields related to policy holder
    private int holderAge;
    private String holderFirstName, holderLastName;
    private boolean holderSmoker;
    private double holderHeight, holderWeight;

    // No-arg constructor that uses default values
    public PolicyHolder()
    {
        holderAge = 25;
        holderFirstName = "John";
        holderLastName = "Smith";
        holderSmoker = false;
        holderHeight = 66;
        holderWeight = 175;
    }

    /** Argument accepting constructor
     * 
     * @param first First name
     * @param last Last name
     * @param age Holder's age
     * @param smoker Whether holder is a smoker or not
     * @param height Holder height
     * @param weight Holder weight
     */
    public PolicyHolder(String first, String last, int age, boolean smoker, double height, double weight)
    {
        holderFirstName = first;
        holderLastName = last;
        holderAge = age;
        holderSmoker = smoker;
        holderHeight = height;
        holderWeight = weight;
    }

    /** Copy constructor initialized object
     * as a copy of another object
     * 
     * @param object2 The object being copied
     */
    public PolicyHolder(PolicyHolder object2)
    {
        holderFirstName = object2.holderFirstName;
        holderLastName = object2.holderLastName;
        holderAge = object2.holderAge;
        holderSmoker = object2.holderSmoker;
        holderHeight = object2.holderHeight;
        holderWeight = object2.holderWeight;
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

    public String toString()
    {
        String str = "Policyholder's First Name: " + holderFirstName +
                    "\nPolicyholder's Last Name: " + holderLastName +
                    "\nPolicyholder's Age: " + holderAge +
                    "\nPolicyholder's Smoking Status: " + holderSmoker +
                    "\nPolicyholder's Height: " + holderHeight + " inches" +
                    "\nPolicyholder's Weight: " + holderWeight + " pounds";

        return str;
    }
}