import java.util.*;
public class Util {
	
	boolean validateTotalSumOfExact(List<Integer> amount, int totalAmt) {
		Integer total=0;
		if(amount== null)	return false;
		for(Integer i:amount) {
			total+= i;
		}
		return (total==totalAmt) ? true:false;
	}
	
	boolean validatePercentage(List<Integer> percent) {
		Integer total=0;
		if(percent == null)	return false;
		for(Integer i:percent) {
			total+= i;
		}
		return (total==100) ? true:false;
	}
}
