package model;
import model.BabysittingCustomers;
import model.BabysittingEmployees;

/**
 * @author lthor - lthornburg1
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
public class BabysittingSchedule {
	
	public double calculateRate(BabysittingEmployees rate, BabysittingCustomers hours) {
		double dailyRate = 0;
		dailyRate = rate.getRate() * hours.getHoursNeeded();
		return dailyRate;
	}
	
	public double calculateRateChange(BabysittingEmployees rate, BabysittingCustomers numberOfKids) {
		double kidsRate = 0;
		kidsRate = rate.getRate() * numberOfKids.getNumberOfKids();
		return kidsRate;
	}
}
