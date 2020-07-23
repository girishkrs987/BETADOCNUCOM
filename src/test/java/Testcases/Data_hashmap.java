package Testcases;

import java.util.HashMap;

public class Data_hashmap {

	
	public static HashMap<String, String> getuserlogin(){
	
	HashMap<String, String> usermap= new HashMap<String, String>();
		
	usermap.put("9916808043", "KRs117743");  // Lab Technician
	usermap.put("9480029104", "KRs117743"); // Front Office	
	usermap.put("9999988888", "KRs117743"); // nurse
	usermap.put("9972921986", "KRs117743"); // admin 
	return usermap;
	
	
	}
	
	public static HashMap<Integer, String> getusertypes(){
		
		HashMap<Integer, String> usermaptype= new HashMap<Integer, String>();
			
		usermaptype.put(1, "Lab Technician");  // Lab Technician
		usermaptype.put(2, "Front office"); // Front Office	
		usermaptype.put(3, "Nurse"); // nurse
		usermaptype.put(4, "Doctor"); // admin 
		return usermaptype;
		
		
		}
}
