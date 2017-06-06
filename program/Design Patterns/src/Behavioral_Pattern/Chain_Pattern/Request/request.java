package Behavioral_Pattern.Chain_Pattern.Request;

/**
 * @author µËÏé
 *
 */
public class request {

	
	private double amount;
	private int number;
	private String purpose;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public request(double amount, int number, String purpose) {
		super();
		this.amount = amount;
		this.number = number;
		this.purpose = purpose;
	}
	public request()
	{
		
	}
	
	
}
