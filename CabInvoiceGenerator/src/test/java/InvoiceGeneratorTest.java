import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceGeneratorTest {

    InvoiceGenerator invoiceGenerator = null;

    @Before
    public void setUp() throws Exception {
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_ReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    @Test
    public void givenDistanceAndTime_ReturnMinFare(){
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }
}
