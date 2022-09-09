package model;

/**
 * @author lthor - lthornburg1
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
public class BabysittingCustomers {
	private String customerName;
	private int hoursNeeded;
	private int numberOfKids;
	
	public BabysittingCustomers() {
		
	}
	
	public BabysittingCustomers(int hoursNeed) {
		setHoursNeeded(hoursNeed);
	}
	
	public BabysittingCustomers(String cname, int hoursNeed, int nkids) {
		setCustomerName(cname);
		setHoursNeeded(hoursNeed);
		setNumberOfKids(nkids);
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getHoursNeeded() {
		return hoursNeeded;
	}
	public void setHoursNeeded(int hoursNeeded) {
		this.hoursNeeded = hoursNeeded;
	}
	public int getNumberOfKids() {
		return numberOfKids;
	}
	public void setNumberOfKids(int numberOfKids) {
		this.numberOfKids = numberOfKids;
	}
	
	

}
