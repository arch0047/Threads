package HomePackage;


public class Encapsulate

{

    // private variables declared

    private String myName;
    private String myRoll;
    private int myAge;

    // get method
    public int getAge()
    {
        return myAge;
    }
    public String getName()
    {
        return myName;
    }
    public String getRoll()
    {
        return myRoll;
    }

    // set method

    public void setAge(int newAge)
    {
        myAge = newAge;
    }
    public void setName(String newName)
    {
        myName = newName;
    }
    public void setRoll(String newRoll)
    {
        myRoll = newRoll;
    }
}
