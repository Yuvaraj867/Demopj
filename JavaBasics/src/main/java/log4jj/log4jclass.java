package log4jj;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log4jclass {
	static Logger logger =Logger.getLogger(log4jclass.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("File1.properties");
		logger.debug("one");
		  logger.info("two");
		  logger.warn("three");
		  logger.error("four");
		  logger.fatal("five");
	}

}
