/**
 * 
 */
package edu.fiu.slypad;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author Anthony
 *
 */
public class WebPortal implements SelfCheckCapable {

	UserAccount myaccount;
	Employee myemployee;
	med mymed;
	CloudDatabase myclouddatabase;
	EHRDatabase myEhrDatabase;
	
	public WebPortal() {
		myaccount = new UserAccount();
		myemployee = new Employee();
		mymed = new med();
		myclouddatabase = new CloudDatabase();
		myEhrDatabase = new EHRDatabase();
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Web Portal";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.01);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this,myaccount, myemployee, mymed, myclouddatabase, myEhrDatabase);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebPortal myportal = new WebPortal();
		myportal.runSelfCheck();
		myportal.AuthenticateAccess();
		myportal.requestRecords();
		myportal.connectCloudDatabase();
		myportal.connectEHRDatabase();
		myportal.pushRecords();
		myportal.showRecords();
	}

	private void showRecords() {
		// TODO Auto-generated method stub
		System.out.println("John Doe DOB: 01/01/1975 Sex: M Appt: 04/23/2021 9:00AM");
	}

	private void pushRecords() {
		// TODO Auto-generated method stub
		myclouddatabase.pushRecords();
	}

	private void connectEHRDatabase() {
		// TODO Auto-generated method stub
		myEhrDatabase.pullEHRdata();
	}

	private void connectCloudDatabase() {
		// TODO Auto-generated method stub
		myclouddatabase.pullEHRData();
	}

	private void requestRecords() {
		// TODO Auto-generated method stub
		mymed.requestRecords();
	}

	private void AuthenticateAccess() {
		// TODO Auto-generated method stub
		myaccount.accountCheck();
	}

}
