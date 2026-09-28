public class SalariedEmployee extends Employee{
    int weeklySalary;

    public int getWeeklySalary(){
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString(){
        return "Salaried Employee{" + "first name = '" + super.getFirstName() + '\'' + ", last name = '" + super.getLastName() + '\'' + ", social security number = '" + super.getSocialSecurityNumber() + '\'' + "', weekly salary ='" + weeklySalary + '}';
    }
}