import com.nero.logback.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("-------------info------------");
        logger.debug("-------------debug------------");
        User user = new User(1, "nero");
    }
}
