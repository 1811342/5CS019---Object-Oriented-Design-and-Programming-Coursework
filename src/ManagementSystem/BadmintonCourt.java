/**
 * Simple Class About Badminton court
 * */

package ManagementSystem;
public class BadmintonCourt extends SportsHall {
    private String id;
    private boolean booked;
    private double AdultPrice;
    private double ChildPrice;

    public BadmintonCourt(){
        this.id="BC001";
        this.AdultPrice=4.75;
        this.ChildPrice=2.75;
    }

    /**
     * Getters and setters
     * */
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getPrices(){
        return "Adults - £4.75\n" +
                "Juniors - £2.65\n";
    }
}
