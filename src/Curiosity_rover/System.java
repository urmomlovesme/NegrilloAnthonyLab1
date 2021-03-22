/**
 * 
 */
package Curiosity_rover;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is my System Class that is what the rover uses to control everything
 * @author Anthony
 *
 */
public class System implements SelfCheckCapable {
	
	String OS;
	String Software;
	
	/**
	 * 
	 * This method is what how the controller uses the system to control the rover
	 * @return
	 */
	
	Controller operate()
	{
		return null;
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My System";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.01);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
