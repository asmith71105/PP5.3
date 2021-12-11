public class Dog implements Comparable
{
    private String dogName;
    private int dogAge;
    private String dogBreed;
    private double dogWeight;
    private static int count;

    public Dog (String dogName, int dogAge, String dogBreed, double dogWeight)
    {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogBreed = dogBreed;
        this.dogWeight = dogWeight;
        count++;
    }

    //Getters

    public Dog (int update)
    {
        dogAge = update;
    }
    public String getDogName()
    {
        return dogName;
    }

    public int getDogAge()
    {
        return dogAge;
    }

    public String getDogBreed()
    {
        return dogBreed;
    }

    public double getDogWeight()
    {
        return dogWeight;
    }

    public static int getCount()
    {
        return count;
    }

    //Setters
    public void setValue (int update)
    {
        dogAge = update;
    }
    public void setDogName(String dogName)
    {
        this.dogName = dogName;
    }

    public void setDogAge(int dogAge)
    {
        this.dogAge = dogAge;
    }

    public void setDogBreed(String dogBreed)
    {
        this.dogBreed = dogBreed;
    }

    public void setDogWeight(double dogWeight)
    {
        this.dogWeight = dogWeight;
    }

    public int compareTo (Object obj)
    {
        int otherAge = ((Dog)obj).getDogAge();
        if(dogAge < otherAge)
            return otherAge - dogAge;
        else if (dogAge > otherAge)
            return dogAge - otherAge;
        else
            return 0;
    }
    //toString
    public String toString()
    {
        String output = "Name: " + dogName;
        output += "\nAge: " + dogAge;
        output += "\nBreed: " + dogBreed;
        output += "\nWeight: " + dogWeight;
        return output;
    }
}