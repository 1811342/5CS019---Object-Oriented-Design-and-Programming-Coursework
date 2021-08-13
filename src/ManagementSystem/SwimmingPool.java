/**
 * Swimming Class
 * */
package ManagementSystem;
public class SwimmingPool implements Facility {
    private java.lang.String id;
    private boolean booked;
    private double AdultPrice;
    private double ChildPrice;

    public SwimmingPool(){
        java.lang.String Id ="SP001";
        this.AdultPrice=2.00;
        this.ChildPrice=1.25;
    }

    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public double getAdultPrice() {
        return AdultPrice;
    }

    public void setAdultPrice(double adultPrice) {
        AdultPrice = adultPrice;
    }

    public double getChildPrice() {
        return ChildPrice;
    }

    public void setChildPrice(double childPrice) {
        ChildPrice = childPrice;
    }


    public java.lang.String getPrices(){
        java.lang.String Price=
                "Adults - £2.00\n" +
                "Children - £1.25 (children under 10 must be accompanied by an adult)\n" +
                "Children under 4 - No Charge\n" +
                "Senior Citizens (aged 60 and over) - £1.25\n" +
                "Unemployed - £1.25\n" +
                "Student - £1.25\n" +
                "Disabled People - £1.25\n" +
                "Private Hire for Pool Parties etc. - £26.50 + lifeguards @£7 per hour each\n";
        return Price;
    }

    public java.lang.String getOpenTimes(){
        java.lang.String time =
                "Monday to Friday 6am - 10am, 2pm - 11.00pm (6.00pm - 7.00pm Adults Only)\n" +
                "Saturday - 7.00am - 7.00pm (6.00pm - 7.00pm Adults Only)\n" +
                "Sunday - 8.00am - 7.00pm (6.00pm - 7.00pm Adults Only)\n";
        return time;
    }
}
