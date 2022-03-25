import java.util.Objects;

public class InvoiceSummary {

    private int noOfRides;
    private double totalFare;
    private double average;

    /***
     * created parameterized constructor
     * @param noOfRides - to pass number of rides
     * @param totalFare - to pass total fare
     */
    public InvoiceSummary(int noOfRides, double totalFare) {
        this.noOfRides = noOfRides;
        this.totalFare = totalFare;
        // calculating average
        this.average = this.totalFare / this.noOfRides;
    }

    /***
     * overridden equals method to compare objects
     * @param obj - to pass object
     * @return - returning number of rides
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) obj;
        return noOfRides == that.noOfRides &&
                            Double.compare(that.totalFare, totalFare) == 0 &&
                            Double.compare(that.average, average) == 0;
    }
}
