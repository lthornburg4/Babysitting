package model;

/**
 * @author lthor - lthornburg1
 * CIS175 - Fall 2022
 * Sept 8, 2022
 */
public class BabysittingEmployees {
	private String babysitterName;
	private int babysitterAge;
	private double rate;
	
	public BabysittingEmployees() {
		
	}
	
	public BabysittingEmployees(double rate) {
		setRate(12.00);
	}
	
	public BabysittingEmployees(String bname, int bage, double rate) {
		setBabysitterName(bname);
		setBabysitterAge(bage);
		setRate(rate);
	}
	
	public String getBabysitterName() {
		return babysitterName;
	}
	public void setBabysitterName(String babysitterName) {
		this.babysitterName = babysitterName;
	}
	public int getBabysitterAge() {
		return babysitterAge;
	}
	public void setBabysitterAge(int babysitterAge) {
		this.babysitterAge = babysitterAge;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
}
