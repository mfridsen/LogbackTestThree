import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Mattias Fridsén
 * @project LogbackTestThree
 * @package PACKAGE_NAME
 * @contact matfir-1@student.ltu.se
 * @date 5/4/2023
 * <p>
 * We plan as much as we can (based on the knowledge available),
 * When we can (based on the time and resources available),
 * But not before.
 */
public class LogbackTestThree {

    private static final Logger logger;

    static {
        logger = LoggerFactory.getLogger(LogbackTestThree.class);
    }

    public static void main(String[] args) {
        logger.trace("Trace message.");
        logger.debug("Debug message.");
        logger.info("Info message.");
        logger.warn("Warning message.");
        logger.error("Error message.");
    }

}