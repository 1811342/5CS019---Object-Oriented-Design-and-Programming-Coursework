/**
 * Half Hall facility Class
 * */
package ManagementSystem;
public class HalfHall extends SportsHall{
    private String id;
    private boolean booked;
    private double AdultPrice;
    private double ChildPrice;

    public HalfHall(){
        this.id ="HH001";
        this.AdultPrice=18.40;
        this.ChildPrice=10.10;
    }


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
        return "Block booking (Adults) - £18.40 per hour\n" +
                "Block booking (Concessions) - £10.50 per hour\n" +
                "Casual booking (Adults) - £21.00 per hour\n" +
                "Casual booking (Concessions) - £12.25 per hour\n";
    }
}
