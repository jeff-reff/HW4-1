public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer (String firstName, String lastName, double hourlyRate, double hoursWorked){
        setFirstName(firstName);
        setLastName(lastName);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    //firstname
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //lastname
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //hourly rate
    public double getHourlyRate(){
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate){
        if (this.hourlyRate < 0.0){
            throw new IllegalArgumentException("Rate cannot be negative");
        }
        this.hourlyRate = hourlyRate;
    }

    //hours worked
    public double getHoursWorked(){
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked){
        if (this.hoursWorked < 0.0){
            throw new IllegalArgumentException("Rate cannot be negative");
        }
        this.hoursWorked = hoursWorked;
    }

    @Override 
    public double calculatePayment(){
        if (hoursWorked > 40.0){
            return ((hoursWorked - 40.0) * hourlyRate * 1.5) + (40.0 * hourlyRate);
        } else {
            return hourlyRate * hoursWorked;
        }
        
    }

    @Override 
    public String getPayeeName(){
        return firstName + " " + lastName;
    }

    public void print() {
        System.out.println("Full name: " + getPayeeName() + ", Payment: $" + calculatePayment());
    }

}