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
public class UserAccount implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "User Account";
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

	public void accountCheck() {
		// TODO Auto-generated method stub
		return;
	}

}
