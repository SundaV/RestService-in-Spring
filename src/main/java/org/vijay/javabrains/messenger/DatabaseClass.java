package org.vijay.javabrains.messenger;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
private static 	Map<Long, Message> message =new HashMap<>();
/*private static 	Map<Long, Profile>  profile = new HashMap<>();*/

public static Map<Long, Message> getAllmessage(){
	return message;
}

/*public static Map<Long, Profile> getAllprofile(){
	return profile;
}*/


}
