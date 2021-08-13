package ManagementSystem;

public class TabelTennisCourt extends SportsHall{


    private String id;
    private boolean booked;
    private double AdultPrice;
    private double ChildPrice;

    public TabelTennisCourt() {
        this.id = "TT001";
        AdultPrice = 4.25;
        ChildPrice = 2.50;
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
        return "Adults - £4.25\n" +
                "Juniors - £2.50\n";
    }
}
