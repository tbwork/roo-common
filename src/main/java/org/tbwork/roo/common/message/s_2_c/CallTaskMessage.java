package org.tbwork.roo.common.message.s_2_c;

import org.tbwork.roo.common.enums.MessageType;
import org.tbwork.roo.common.message.Message;
import org.tbwork.roo.common.model.ITaskParameter;

import lombok.Data;

@Data
public class CallTaskMessage extends Message{

	public CallTaskMessage(){
		super(MessageType.S2C_CALL_TASK);
	}
	
	/**
	 * ID the invoke
	 */
	private String invokeId;
	
	private String taskName; 
	
	private ITaskParameter taskParameter;
	
}
