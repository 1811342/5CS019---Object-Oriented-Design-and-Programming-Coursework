/**
* a simple class to contain and manage Staff details
* (id,name,phone,hours)
* */
package ManagementSystem;
public class Employees {
    private String id;
    private Name name;
    private String phone;
    private int hours = 0;
    private double salary;


    /**
     * set up contact details.
     * @param name the name
     * @param phone the number
     * */
    public Employees(String id, Name name, String phone){

        //id and name MUSt be provided
        if( name==null || id.trim().length()== 0)
        {
            throw new IllegalStateException(
                    "Cannot have blank id or name");
        }

        this.id=id.trim();
        this.name=name;
        this.phone=phone.trim();
    }

    public String getId() { return id; }
    public Name getName() { return name; }
    public String getPhone() { return phone; }
    public int getHours(){ return hours;}
    public double getSalary(){return salary;}

    public void setId(String id) { this.id = id; }
    public void setName(Name name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void addHours(int newhours){this.hours+=newhours; }
    public void setSalary(double rate){this.salary=this.hours*rate;}

    /**
    * test quality between objects
    * */
    public boolean equals(Object other){
        if(other instanceof Employees){
            Employees otheremployee = (Employees) other;
            return id.equals(otheremployee.getId());
        }else {
            return false;
        }
    }

    /**
     * Compare this Staff object against another, for the purpose
     * of sorting. The fields are compared by id.
     * @param otherDetails The details to be compared against.
     * @return a negative integer if this id comes before the parameter's id,
     *         zero if they are equal and a positive integer if this
     *         comes after the other.
     */

    public int compareTO(Employees otherDetails){
        return id.compareTo(otherDetails.getId());
    }

    /**
     * @return A multi-line string containing the name, phone, and address.
     */
    public String toString()
    {
        return String.format("%-5s", id ) + String.format("%-20s", name.getLastCommaFirst()) + String.format("%-25s", phone);
    }

    /**
     * return a salary report of each employee
     * */
    public String wagesreport(){
        return this.id+"has done"+hours+"earning"+this.salary;
    }
}