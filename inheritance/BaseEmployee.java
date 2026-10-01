public class BaseEmployee extends Employee{
    private int baseSalary;

    public int getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString(){
        return "Salaried Employee{" + "first name = '" + super.getFirstName() + '\'' + ", last name = '" + super.getLastName() + '\'' + ", social security number = '" + super.getSocialSecurityNumber() + '\'' + "', base salary ='" + baseSalary + '}';
    }
}