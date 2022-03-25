public class InvoiceService {

    private int userID;
    private Ride[] rides;
    private String invoice;
    private InvoiceSummary totalFare;

    /***
     * created parameterized constructor
     * @param userID - to pass user ID
     * @param rides - to pass rides array
     */
    public InvoiceService(int userID, Ride[] rides) {
        this.userID = userID;
        this.rides = rides;
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        this.totalFare = invoiceGenerator.calculateFare(rides);
        this.invoice = userID + ", " + rides + ", " + totalFare;
    }
}
