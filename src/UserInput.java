import java.util.*;
public class UserInput {
	Users paidUser;
	int totalAmount;
	int divideNumber;
	List<Users> usersList;
	divideTye type;
	List<Integer> divideAmount; 
	
	UserInput(Users p, int t, int d, List<Users> u,divideTye type,List<Integer> div){
		paidUser = p;
		totalAmount =t;
		divideNumber =d;
		usersList =u;
		this.type = type;
		divideAmount = div;
	}
	
}
