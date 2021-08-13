/**
 * Employee Test Case
 * */
package ManagementSystem;
import static org.junit.Assert.*;

public class LifeguardListTest {
    LifeguardList lList=new LifeguardList();


    // test the find by id method
    @org.junit.Test
    public void findById() {
        lList.ReadCSV();
        assertEquals(lList.findById("L0").getId(),"L0");
    }

    /**
     * test list Details method and add hours
     * */
    @org.junit.Test
    public void listDetails() {
        lList.ReadCSV();
        System.out.println(lList.listDetails());
        lList.findById("L0").addHours(10);
        System.out.println(lList.listDetails());
    }

    /**
     * test get final salary method
     * */
    @org.junit.Test
    public void getFinalSalary() {
        lList.ReadCSV();
        //System.out.println(rList.getFinalSalary());
        assertEquals(lList.getFinalSalary(),1853,1853);
    }

}