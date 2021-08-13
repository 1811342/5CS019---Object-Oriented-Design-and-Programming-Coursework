package ManagementSystem;

public class Lifeguards extends Employees{
    private final double rate   = 4.25;

    public Lifeguards(String ID, Name name, String phone, int hours){
        super(ID,name,phone);
        super.addHours(hours);
    }

    /**
     * this method used to calculate salary of the employee
     * */
    public void CalcSalary(){
        super.setSalary(this.rate);
    }
}
