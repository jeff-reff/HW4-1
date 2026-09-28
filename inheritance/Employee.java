//abstract since no one can just be an employee
public abstract class Employee {
    private String firstName, lastName;
    private String socialSecurityNumber;

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

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString(){
        return "Employee{" + "first name = '" + firstName + '\'' + ", last name = '" + lastName + '\'' + ", social security number = '" + socialSecurityNumber + '\'' + '}';
    }
}