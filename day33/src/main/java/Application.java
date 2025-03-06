

import io.github.cdimascio.dotenv.Dotenv;

import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        Logger logger = Logger.getLogger(Application.class.getName());
        logger.info(dotenv.get("SEARCH_KEYWORD"));
    }
}
