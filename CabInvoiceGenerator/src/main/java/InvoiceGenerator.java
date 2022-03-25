public class InvoiceGenerator {

    private static final double MINIMUM_FARE = 5;
    private static double MINIMUM_COST_PER_KM = 10;
    private static int COST_PER_TIME = 1;

    /***
     * created calculateFare method to calculate total fare for the journey
     * @param distance - passing distance
     * @param time - passing time
     * @return - returning total fare
     */
    public double calculateFare(double distance, int time) {
        double totalFare =  distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
        return Math.max(MINIMUM_FARE, totalFare);
    }

    /***
     * created calculateFare method to calculate total fare for multiple rides
     * @param rides - passing rides array
     * @return
     */
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for(Ride ride: rides)
            totalFare += this.calculateFare(ride.distance, ride.time);
        return new InvoiceSummary(rides.length, totalFare);
    }
}
