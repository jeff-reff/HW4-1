public class ComissionEmployee extends Employee{
    int commissionRate;
    int grossSales;

    public int getComissionRate(){
        return commissionRate;
    }

    public void setComissionRate(int commissionRate){
        this.commissionRate = commissionRate;
    }

    public int getGrossSales(){
        return grossSales;
    }

    public void setGrossSales(int grossSales){
        this.grossSales = grossSales;
    }

    @Override
    public String toString(){
        return "Comission Employee{" + "first name = '" + super.getFirstName() + '\'' + ", last name = '" + super.getLastName() + '\'' + ", social security number = '" + super.getSocialSecurityNumber() + '\'' + "', comission rate ='" + commissionRate + "', gross sales = '" + grossSales + '}';
    }
}