package javaselib;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Lernziel:  Log-Meldungen schreiben
 * - Log-Bibliotheken
 * - Handler, Log-Level
 */

public class Logging {
    public static void main(String[] args) throws IOException {

//        Logger logger = Logger.getLogger("");
//        FileHandler fileHandler = new FileHandler("output.log", true);
//        fileHandler.setFormatter(new SimpleFormatter());
//        logger.addHandler(fileHandler);
//        logger.setLevel(Level.ALL);

        Lines.printLine();
    }
}

class Lines {
    private final static Logger log = Logger.getLogger(Lines.class.getName());

    //    private final Logger log = Logger.getLogger(getClass().getName());
    static void printLine() {
        log.log(Level.INFO, "Print a line of length {0}", 6);
        System.out.println("------");
    }
}
