package org.tbwork.roo.common.message.c_2_s;

import org.tbwork.roo.common.enums.MessageType; 

import lombok.Data;

@Data
public class UpdateResultMessage extends ResultMessage {

	
	public UpdateResultMessage(){
		super(MessageType.C2S_UPDATE_RESULT);
	}
	
	/**
	 * true means success
	 */
	private boolean success;
	
	private String message;
	
}
