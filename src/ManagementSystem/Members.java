/**
 * Super Class of all the members types
 * */
package ManagementSystem;

public class Members {
   private String id;
   private Name name;
   private String age;
   private String phone;
   private String email;

    /**
     *
     * @param id user id
     * @param name user name
     * @param age user age
     * @param phone user phone
     * @param email user email
     */
   public Members(String id, Name name, String age, String phone, String email ){
       this.id=id;
       this.name=name;
       this.age=age;
       this.phone=phone;
       this.email=email;
   }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Name getName() { return name;}
    public void setName(Name name) { this.name = name;}

    public String getAge() { return age; }

    public void setAge(String age) { this.age = age; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone;}

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    /**
     * test quality between objects
     * @param other
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
        return String.format("%-5s", id ) + String.format("%-20s", name.getLastCommaFirst()) + String.format("%-8s",age)+ String.format("%-8s",phone)+ String.format("%-10s",email);
    }
}
