public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNum;

    public Instructor(String firstName, String lastName, String officeNum){
        setFirstName(firstName);
        setLastName(lastName);
        setOfficeNum(officeNum);
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getOfficeNum(){
        return officeNum;
    }

    public void setOfficeNum(String officeNum){
        this.officeNum = officeNum;
    }

    @Override
    public String toString(){
        return "First name: " + getFirstName() + ", last name: " + getLastName() + ", office number: " + getOfficeNum();
    }
}