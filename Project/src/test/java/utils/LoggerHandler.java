package utils;
import org.apache.log4j.Logger;
public class LoggerHandler {
    private static final Logger logger=Logger.getLogger(LoggerHandler.class);


    /*Method Name:trace
     * Author Name:Vipul Saxena
     * Description: This methods helps to log detailed information.
     * Parameters:Message
     * return type:void
     */
    
    public static void trace(String message)
    {
        try {
            logger.trace(message);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
       
    }
    /*Method Name:debug
     * Author Name:Vipul Saxena
     * Description: This methods logs information that is useful for debugging.
     * Parameters:Message
     * return type:void
     */
    public static void debug(String message)
    {
        try {
            logger.debug(message);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     /*Method Name:info
     * Author Name:Vipul Saxena
     * Description: This methods is used to write information in detail.
     * Parameters:Message
     * return type:void
     */
    public static void info(String message)
    {
        try {
            logger.info(message);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     /*Method Name:warn
     * Author Name:Vipul Saxena
     * Description: This methods is used to warn.
     * Parameters:Message
     * return type:void
     */
    public static void warn(String message)
    {
        try {
            logger.warn(message);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
  
    /*Method Name:error
     * Author Name:Vipul Saxena
     * Description: This methods write log of the error.
     * Parameters:Message
     * return type:void
     */
    public static void error(String message)
    {
        try {
            logger.error(message);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /*Method Name:fatal
     * Author Name:Vipul Saxena
     * Description: This methods is used to log severe error events.
     * Parameters:Message
     * return type:void
     */
    public static void fatal(String message)
    {
        try {
            logger.fatal(message);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
    

