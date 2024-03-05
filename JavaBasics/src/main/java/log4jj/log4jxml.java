package log4jj;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class log4jxml {
	static Logger logger =Logger.getLogger(log4jxml.class);

	public static void main(String[] args) {
		DOMConfigurator.configure("Log4j.xml");
		logger.debug("one");
		  logger.info("two");
		  logger.warn("three");
		  logger.error("four");
		  logger.fatal("five");

	}

}
