package org.tbwork.roo.common.enums;

public enum MessageType {
 
	S2C_PING_ACK, // PING 确认
    S2C_CALL_TASK, // 服务端调用客户端的某个任务。
    S2C_UPDATE_TASK, // 要求客户端更新某个任务。
    
	
	
	C2S_PING,  // PING包
	C2S_TASK_RESULT, // 客户端把任务执行的结果返回给服务端
	C2S_UPDATE_RESULT, // 客户端把任务更新的结果返回给服务端
	;
	
}
