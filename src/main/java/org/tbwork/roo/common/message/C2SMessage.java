package org.tbwork.roo.common.message;
 

import org.tbwork.roo.common.enums.MessageType;

import lombok.Data;

@Data
public abstract class C2SMessage extends Message{

	/**
	 * Global Id of Subscriber Client.
	 */
	private int clientId; 
	
    public C2SMessage(){};
	
	public C2SMessage(MessageType msgType){
		 super(msgType);
	}
	
}
