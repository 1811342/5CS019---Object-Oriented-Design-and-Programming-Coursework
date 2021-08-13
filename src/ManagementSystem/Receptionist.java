/**
 * Simple class to store wage of the receptionists
 * */
package ManagementSystem;

public class Receptionist extends Employees {
    private final double rate   = 5;

    public Receptionist(String ID, Name name, String phone, int hours){
        super(ID,name,phone);
        super.addHours(hours);
    }

    /**
     * this method used to calculate salary of the employee
     * */
    public void CalcSalary(){
        super.setSalary(rate);
    }

}
