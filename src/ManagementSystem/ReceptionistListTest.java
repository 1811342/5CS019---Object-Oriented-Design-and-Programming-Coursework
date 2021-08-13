/**
 * Test Cases
 * */
package ManagementSystem;
import static org.junit.Assert.*;
public class ReceptionistListTest {

    ReceptionistList rList=new ReceptionistList();


    // test the find by id method
    @org.junit.Test
    public void findById() {
        rList.ReadCSV();
        assertEquals(rList.findById("R0").getId(),"R0");
    }

    /**
     * test list Details method
     * */
    @org.junit.Test
    public void listDetails() {
        rList.ReadCSV();
        System.out.println(rList.listDetails());
    }

    /**
     * test get final method
     * */
    @org.junit.Test
    public void getFinalSalary() {
        rList.ReadCSV();
      //System.out.println(rList.getFinalSalary());
        assertEquals(rList.getFinalSalary(),833,833);
    }
}