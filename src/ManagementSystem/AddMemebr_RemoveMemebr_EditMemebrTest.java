/**
 * Memebrs test cases
 * */
package ManagementSystem;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddMemebr_RemoveMemebr_EditMemebrTest {

    /**
     * test add Memebrs
     * **/
    @Test
    public void addMemebrtoCSV() {
        SchoolMembersList slist2 = new SchoolMembersList();
        slist2.AddMemebrtoCSV("S99","Nirmal Mudiyanselage","22","1234","email");
        slist2.readCSV();
        assertEquals(slist2.findById("S99").getId(),"S99");
    }

    /**
     * this will test the edit member and delete meber
     * */
    @Test
    public void EditMemebrTest() {
        SchoolMembersList slist2 = new SchoolMembersList();
        slist2.EditSchoolMembers("S1","Nirmal Mudiyanse","22","1111","mymail1");
    }
}