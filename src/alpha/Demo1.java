package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {
	private static Logger logger=LogManager.getLogger(Demo1.class.getName());
	public static void main(String args[]) {
		logger.info("this is error msg");
		logger.error("this is error msg");
		logger.debug("This is debugger msg");
	
	}
	

}
