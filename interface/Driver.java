import java.util.ArrayList;

public class Driver{
    public static void main(String[] args){
        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer("Dave", "Smith", 21.60, 42));
        payables.add(new Freelancer("Jack", "Daniels", 30.22, 34));
        payables.add(new VendorInvoice("Office Supplies", "M1234", 100.52));
        payables.add(new VendorInvoice("Computer Parts", "I5432", 400.22));

        double totalPayout = 0.00;

        for (int i = 0; i < payables.size(); i++){
            Payable payable = payables.get(i);

            if (payable instanceof Freelancer){
                Freelancer freelancer = (Freelancer) payable;
                freelancer.print();
            }
            if (payable instanceof VendorInvoice){
                VendorInvoice invoice = (VendorInvoice) payable;
                invoice.print();
            }

            totalPayout += payable.calculatePayment();
        }

        System.out.println("Total payout: $" + totalPayout);

    }
}