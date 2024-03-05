package log4jj;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicGenerator {
static Logger log =Logger.getLogger(BasicGenerator.class);
	public static void main(String[] args) {
  BasicConfigurator.configure();
  log.debug("one");
  log.info("two");
  log.warn("three");
  log.error("four");
  log.fatal("five");
	}

}
