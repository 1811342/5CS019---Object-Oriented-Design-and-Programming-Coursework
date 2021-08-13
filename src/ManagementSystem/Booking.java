/**
 * Simple CLass to make booking. mostly contains setters and getters
 * */

package ManagementSystem;

import javax.swing.*;

public class Booking {
    private String id;
    private String Date ;
    private String facilities;
    private Employees employees;
    private Members members;
    private Double Price;

    /**
     *default constructor
     * */
    public Booking(){

    }

    /**
     * main constructor
     * */
    public Booking(String id, String Date, String facilities, String EmployeeID, String MemberID){
        LifeguardList lgList = new LifeguardList();
        lgList.ReadCSV();
        PublicMemberList pList = new PublicMemberList();
        pList.readCSV();

        this.id=id;
        this.Date=Date;
        this.facilities=facilities;
        this.employees=lgList.findById(EmployeeID);
        this.members=pList.findById(MemberID);
        this.Price=0.00;
    }

    /**
     * Method to calculate all the prices
     * */
    public void SetPrices (){
        LifeguardList lgList = new LifeguardList();
        lgList.ReadCSV();
        PublicMemberList pList = new PublicMemberList();
        pList.readCSV();
        SwimmingPool sp=new SwimmingPool();
        HalfHall hh = new HalfHall();
        TabelTennisCourt ttc = new TabelTennisCourt();
        TennisCourt tc = new TennisCourt();
        BadmintonCourt bc = new BadmintonCourt();

        if(this.facilities.equals("Swimming Pool")){
            if(Integer.parseInt(this.members.getAge())<18){
                this.Price= sp.getAdultPrice();
            }else {
                this.Price= sp.getChildPrice();
            }
        }

        else if(this.facilities.equals("Half Hall")) {
            if(Integer.parseInt(this.members.getAge())<18){
                this.Price= hh.getAdultPrice();
            }else {
                this.Price= hh.getChildPrice();
            }
        }

        else if(this.facilities.equals("Tabel Tennis Court")){
            if(Integer.parseInt(this.members.getAge())<18){
                this.Price= ttc.getAdultPrice();
            }else {
                this.Price= ttc.getChildPrice();
            }
        }

        else if(this.facilities.equals("Tennis Court")){
            if(Integer.parseInt(this.members.getAge())<18){
                this.Price= tc.getAdultPrice();
            }else {
                this.Price= tc.getChildPrice();
            }
        }

        else if(this.facilities.equals("Badminton Court")){
            if(Integer.parseInt(this.members.getAge())<18){
                this.Price= bc.getAdultPrice();
            }else {
                this.Price= bc.getChildPrice();
            }
        }else {
            JOptionPane.showMessageDialog(null,"Error");
        }

    }

    /**
     * Setters and Getters
     * */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfacilities() {
        return facilities;
    }

    public void setFacilitis(String facilitis) {
        this.facilities = facilitis;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPriceman(Double price) {
        Price = price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }
    
}
