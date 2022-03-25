import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceGeneratorTest {

    InvoiceGenerator invoiceGenerator = null;

    // created invoiceGenerator object
    @Before
    public void setUp() throws Exception {
        invoiceGenerator = new InvoiceGenerator();
    }

    /***
     * created givenDistanceAndTime_ReturnTotalFare method to test
     * calculated total fare actual value is equals to expected value
     */
    @Test
    public void givenDistanceAndTime_ReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    /***
     * created givenDistanceAndTime_ReturnMinFare method to test
     * calculated minimum fare actual value is equals to expected value
     */
    @Test
    public void givenDistanceAndTime_ReturnMinFare(){
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }

    /***
     * created givenMultipleRides_ReturnInvoiceSummary method to test
     * actual number of rides and total fare to expected 
     */
    @Test
    public void givenMultipleRides_ReturnInvoiceSummary(){
        Ride rides[] = { new Ride(1.1, 1),
                         new Ride(10.0, 5),
                         new Ride(5.0, 6),
                         new Ride(8.9, 1),
                         new Ride(9.0, 9) };
        InvoiceSummary fare = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummery = new InvoiceSummary(5, 362);
        Assert.assertEquals(expectedInvoiceSummery, fare);
    }
}
