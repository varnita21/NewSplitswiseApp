import java.util.*;
import java.util.Map.Entry;
public class Operations {
	HashMap<Integer, Users> hm = new HashMap<>();
	Show s = new Show();
	
	void showAll() {
		
		for(Entry<Integer, Users> e: hm.entrySet()) {
			s.showUser(e.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations op = new Operations();
		op.hm.put(1,new Users(1,0));
		op.hm.put(2,new Users(2,0));
		op.hm.put(3,new Users(3,0));
		op.hm.put(4,new Users(4,0));
		op.s.showUser(op.hm.get(1));
		Expense e = new Expense();
		e.expenseType(new UserInput(op.hm.get(1), 1000,4, Arrays.asList(op.hm.get(2), op.hm.get(3), op.hm.get(4)),divideTye.EQUAL, new ArrayList<>()));
		op.s.showUser(op.hm.get(4));
		System.out.println("break");
		e.expenseType(new UserInput(op.hm.get(1), 1250,4, Arrays.asList(op.hm.get(2), op.hm.get(3)),divideTye.EXACT, Arrays.asList(370, 880)));
		op.showAll();
		System.out.println("break");

		e.expenseType(new UserInput(op.hm.get(4), 1200,4, Arrays.asList(op.hm.get(1),op.hm.get(2), op.hm.get(3)),divideTye.PERCENT, Arrays.asList(40, 20, 20,	 20)));
		op.showAll();
		System.out.println("break");

		e.expenseType(new UserInput(op.hm.get(1), 230,4, Arrays.asList(op.hm.get(4)),divideTye.EXACT, Arrays.asList(230)));
		op.showAll();
	}

}
