package ManagementSystem;

public abstract class SportsHall implements Facility {
    private java.lang.String id = "SH001";

    public SportsHall(){

    }

    public java.lang.String getOpenTimes(){
        java.lang.String openTimes ="Weekdays - 6.00am - 11.00pm\n" +
                "Weekends - 7.00am - 7.00pm\n" +
                "Bank Holidays - 10.00am - 11.00pm\n";

        return openTimes;
    }

    abstract public java.lang.String getPrices();

}
