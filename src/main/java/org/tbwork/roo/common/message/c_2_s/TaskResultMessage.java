package org.tbwork.roo.common.message.c_2_s;

import org.tbwork.roo.common.enums.MessageType; 
import lombok.Data;

@Data
public class TaskResultMessage<T>  extends ResultMessage {
	
	public TaskResultMessage(){
		super(MessageType.C2S_TASK_RESULT);
	} 
	private String invokeId;
	private T result;
}
