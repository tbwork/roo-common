package org.tbwork.roo.common.message.c_2_s;
 

import org.tbwork.roo.common.enums.MessageType;
import org.tbwork.roo.common.message.C2SMessage;

import lombok.Data;

@Data
public class PingMessage extends C2SMessage {

	public PingMessage(){
		super(MessageType.C2S_PING);
	}
	
}
