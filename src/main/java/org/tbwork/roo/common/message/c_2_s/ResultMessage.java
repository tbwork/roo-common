package org.tbwork.roo.common.message.c_2_s;

import org.tbwork.roo.common.enums.MessageType;
import org.tbwork.roo.common.message.C2SMessage;

public abstract class ResultMessage extends C2SMessage{

	public ResultMessage(MessageType msgType){
		 super(msgType);
	} 
	
	private boolean success;
	
	private String message;
	
}
