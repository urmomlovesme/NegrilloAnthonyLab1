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
public class CloudDatabase implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Cloud Database";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.01);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
	}

	public void pullEHRData() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Cloud Database...");
		System.out.println("Connected to Cloud Database");
		
	}

	public void pushRecords() {
		// TODO Auto-generated method stub
		System.out.println("Records Recieved from EHR Database...");
		System.out.println("Show Records in WebPortal");
	}

}
