package org.tbwork.roo.common.util;

import java.util.UUID;

public class IDGenerator {
 
	public static String getGuid(){
		
		return UUID.randomUUID().toString().toLowerCase();
		
	} 
	
}
