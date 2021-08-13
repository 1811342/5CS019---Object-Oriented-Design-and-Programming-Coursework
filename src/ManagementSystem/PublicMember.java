package ManagementSystem;
public class PublicMember extends Members {
    private String Membership;
    private double monthlyFee;
    private double bookingFees = 0.00;

    public PublicMember(String id, Name name, String age, String phone, String email , String Membership){
        super(id,name,age,phone,email);
        this.Membership = (Membership.trim()).toLowerCase();
        //FeeFinder ff = new FeeFinder();
       // this.monthlyFee = ff.getFee(this.Membership);
    }

    public String getMembership() {
        return Membership;
    }

    public void setMembership(String membership) {
        Membership = membership;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public double getBookingFees() {
        return bookingFees;
    }

    public void addBookingFees(double bookingFees) {
        this.bookingFees = this.bookingFees+bookingFees;
    }

    public double getfullfees(){
        return this.monthlyFee+this.bookingFees;
    }
}
