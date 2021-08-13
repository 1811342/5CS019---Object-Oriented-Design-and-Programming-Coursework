/**
 * Simple Class to find the fee type of an membership
 * */

package ManagementSystem;
import java.util.TreeMap;
public class FeeFinder {
    private TreeMap<String,Double> fees = new TreeMap<>();
    public FeeFinder(){
        fees.put("full",40.00);
        fees.put("family",75.00);
        fees.put("Exercise",25.00);
        fees.put("Swim",20.00);
        fees.put("Casual",10.00);
    }

    /**
     * "Return the fee according to membership
     * @param Membership membership
     * @return fee fee
     * */
    public double getFee(String Membership){
        double fee = 0.0;
        fee = fees.get(Membership);
        return fee;
    }
}
