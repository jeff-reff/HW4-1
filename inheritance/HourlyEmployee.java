public class HourlyEmployee extends Employee{
    int wage;
    int numberOfHoursWorked;

    public int getWage(){
        return wage;
    }

    public void setWage(int wage){
        this.wage = wage;
    }

    public int getNumberOfHoursWorked(){
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked){
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public String toString(){
        return "Hourly Employee{" + "first name = '" + super.getFirstName() + '\'' + ", last name = '" + super.getLastName() + '\'' + ", social security number = '" + super.getSocialSecurityNumber() + '\'' + "', wage ='" + wage + "', hours worked = '" + numberOfHoursWorked + '}';
    }
}