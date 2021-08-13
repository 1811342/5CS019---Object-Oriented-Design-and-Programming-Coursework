package ManagementSystem;

public class WeekleyReport {
    private double totlifeSalary=0.0;
    private double totreceSalary=0.0;
    private double totbookingfees=0.0;
    /**
     * Default Constructor
     * */
    public  WeekleyReport(){
    }

    public String Show (){
        CalcSalarys();
        CalcBookings();
        return "__________________Salary Report____________________\n"+
                "-------------------------------------------------------------------------------------"+
                "\nTotal Lifeguard salary for the week: "+this.totlifeSalary+
                "\nTotal Receptionist salary for the week: "+this.totreceSalary+
                "\n\n__________________Booking Report____________________\n"+
                "-------------------------------------------------------------------------------------"+
                "\nTotal Earnings from bookings for the week: "+this.totbookingfees;
    }

    private void CalcSalarys(){
        LifeguardList llist = new LifeguardList();
        ReceptionistList rlist = new ReceptionistList();
        llist.ReadCSV();
        rlist.ReadCSV();
        this.totlifeSalary=llist.getFinalSalary();
        this.totreceSalary=rlist.getFinalSalary();
    }

    private void CalcBookings(){
        BookingList blist = new BookingList();
        blist.ReadCSV();
        this.totbookingfees=blist.totfees();
    }

}
