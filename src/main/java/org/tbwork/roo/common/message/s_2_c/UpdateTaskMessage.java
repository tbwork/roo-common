package org.tbwork.roo.common.message.s_2_c;

import org.tbwork.roo.common.enums.MessageType;
import org.tbwork.roo.common.message.Message;
import org.tbwork.roo.common.model.RooBaby;

import lombok.Data;

@Data
public class UpdateTaskMessage extends Message{

	public UpdateTaskMessage(){
		super(MessageType.S2C_CALL_TASK);
	}
	
	private RooBaby rooBaby;  
	
}
