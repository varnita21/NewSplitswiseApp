import java.util.ArrayList;
import java.util.HashMap;

public class Expense {
	
	public void expenseType(UserInput input) {
		Util u = new Util();
		switch(input.type) {
		case EQUAL:
			int amt = input.totalAmount/input.divideNumber;
			for(Users user:input.usersList) {
				int namt = checkBalance(input, user, amt);
				equalDeduct(input.paidUser, user, namt);
			}
			break;
		case EXACT:
			
			u.validateTotalSumOfExact(input.divideAmount, input.totalAmount);
			for(int i=0;i<input.usersList.size();i++) {
				int amt1 = checkBalance(input,input.usersList.get(i),input.divideAmount.get(i));
				equalDeduct(input.paidUser, input.usersList.get(i), input.divideAmount.get(i));
			}
			break;
		case PERCENT:
			u.validatePercentage(input.divideAmount);
			for(int i=0;i<input.usersList.size();i++) {
				int amtPer = (input.totalAmount* input.divideAmount.get(i))/100;
				int amt1 = checkBalance(input, input.usersList.get(i), amtPer);
				equalDeduct(input.paidUser, input.usersList.get(i), amt1);
			}
		}
	}
	
	public void equalDeduct(Users paid, Users borrowed,int amount) {
		borrowed.setBalance(borrowed.getBalance()+amount);
		HashMap<Integer,Transaction> al= borrowed.getTransation();
		if(al == null) {
			al = new HashMap<Integer,Transaction>();
		}
		if(al.containsKey(paid.getUserID())) {
			Transaction t = al.get(paid.getUserID());
			t.setAmountOwes(t.getAmountOwes()+amount);
			al.put(paid.getUserID(), t);
		}else {
			al.put(paid.getUserID(), new Transaction(paid.getUserID(), amount));
		}
		borrowed.setTransation(al);
	}
	
	public int checkBalance(UserInput input, Users u1, int amt) {
		if(input.paidUser.getTransation() !=null && input.paidUser.getTransation().containsKey(u1.getUserID())) {
			int currentTransactionAmount = input.paidUser.getTransation().get(u1.getUserID()).getAmountOwes();
			
			if(currentTransactionAmount-amt <=0) {
				
				int res = amt-currentTransactionAmount;
				
				HashMap<Integer, Transaction> ht = input.paidUser.getTransation();
				ht.remove(u1.getUserID());
				input.paidUser.setTransation(ht);
				return res;
			}else {
				System.out.println("hhhvvvhhh");
				Transaction nt = input.paidUser.getTransation().get(u1.getUserID());
				int newAmt = amt-nt.getAmountOwes();
				if(nt != null) {
					nt.setAmountOwes(Math.abs(newAmt));
					HashMap<Integer, Transaction> ht = input.paidUser.getTransation();
					ht.put(u1.getUserID(), nt);
					input.paidUser.setTransation(ht);
				}
				return newAmt;
			}
		}else	return amt;
	}
}
