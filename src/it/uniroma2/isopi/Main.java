package it.uniroma2.isopi;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main (String[] args){
        if(args.length > 0){
            String[] list = new String[args.length];

            System.arraycopy(args, 0, list, 0, args.length);

            Arrays.sort(list, Collections.reverseOrder());

            Logger logger = Logger.getLogger(Main.class.getName());

            logger.log(Level.INFO, Arrays.toString(args));
            logger.log(Level.INFO, Arrays.toString(list));
        }
    }
}
