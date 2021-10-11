import java.util.*;
public class Show {
	public void showUser(Users u1){
		HashMap<Integer,Transaction> al = u1.getTransation();
		if(al!= null) {
			for(Transaction t: al.values()) {
				System.out.println(u1.getUserID() +" owes "+t.getBrrowedFrom()+": "+t.getAmountOwes());
			}
		}
	}
}
