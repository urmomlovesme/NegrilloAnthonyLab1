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
public class EHRDatabase implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "EHR DataBase";
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

	public void pullEHRdata() {
		// TODO Auto-generated method stub
		System.out.println("Pulling EHR Data...");
		System.out.println("EHR Data Pull Successfull...");
		System.out.println("Sending EHR Data to Cloud Database...");
	}

}
