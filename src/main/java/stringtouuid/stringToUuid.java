package src.main.java.stringtouuid;
import java.util.*;

import java.util.regex.Pattern;

// This is a little helper class to correctly format the uuids we get from minecraft-api.com
public class stringToUuid {  
  public static void main(String[] args) {
    if (args.length == 0) {
      throw new IllegalArgumentException("invalid input string!");
    }
        
    // Use compiled pattern to improve performance of bulk operations
    Pattern pattern = Pattern.compile("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})");

    for (int i = 0; i < args.length; i++)
    {
        String uuid = pattern.matcher(args[i]).replaceAll("$1-$2-$3-$4-$5");
        // creating UUID      
        UUID uid = UUID.fromString(uuid);
        System.out.println(uid);
    }

  }    
} 
