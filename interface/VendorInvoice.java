public class VendorInvoice implements Payable{
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue){
        setVendorName(vendorName);
        setInvoiceNumber(invoiceNumber);
        setAmountDue(amountDue);
    }

    public String getVendorName(){
        return vendorName;
    }

    public void setVendorName(String vendorName){
        this.vendorName = vendorName;
    }

    public String getInvoiceNumber(){
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }

    public double getAmountDue(){
        return amountDue;
    }

    public void setAmountDue(double amountDue){
        if (amountDue < 0.0){
            throw new IllegalArgumentException("cannot be negative");
        }
        this.amountDue = amountDue;
    }

    @Override 
    public double calculatePayment(){
        return amountDue;
    }

    @Override 
    public String getPayeeName(){
        return vendorName;
    }

    public void print(){
        System.out.println("Vendor name: " + getPayeeName() + ", Invoice number: " + invoiceNumber + ", Calculated payment: $" + calculatePayment());
    }
}