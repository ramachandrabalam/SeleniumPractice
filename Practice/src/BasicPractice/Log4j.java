package BasicPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j {

	public static void main(String[] args) {
		Logger log = LogManager.getLogger(Log4j.class.getName());
		log.error("This is an error");
		log.info("This is an info");
		log.debug("This is a debug message");
		log.fatal("This is Fatal message");
	}

}
