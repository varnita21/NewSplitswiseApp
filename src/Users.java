import java.util.*;
public class Users {
	private int userID;
	private int balance;
	
	Users(int id, int bal){
		userID = id;
		balance = bal;
		transation = null;
	}
	
	private HashMap<Integer,Transaction> transation;

	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public HashMap<Integer,Transaction> getTransation() {
		return transation;
	}
	public void setTransation(HashMap<Integer,Transaction> transation) {
		this.transation = transation;
	}
}
