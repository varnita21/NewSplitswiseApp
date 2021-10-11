
public class Transaction {
	private int transId;
	private int brrowedFrom;
	private int amountOwes;
	
	Transaction(int b, int a){
//		transId = t;
		brrowedFrom = b;
		amountOwes = a;
	}
	
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public int getBrrowedFrom() {
		return brrowedFrom;
	}
	public void setBrrowedFrom(int brrowedFrom) {
		this.brrowedFrom = brrowedFrom;
	}
	public int getAmountOwes() {
		return amountOwes;
	}
	public void setAmountOwes(int amountOwes) {
		this.amountOwes = amountOwes;
	}
}
