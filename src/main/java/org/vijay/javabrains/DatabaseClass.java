package org.vijay.javabrains;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
private static 	Map<Long, Student> student =new HashMap<Long, Student>();
private static 	Map<Long, Profile>  profile = new HashMap<>();

public static Map<Long, Student> getAllstudent(){
	return student;
}

public static Map<Long, Profile> getAllprofile(){
	return profile;
}


}
