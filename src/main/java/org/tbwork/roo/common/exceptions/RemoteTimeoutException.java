package org.tbwork.roo.common.exceptions;

public class RemoteTimeoutException extends RuntimeException{

	public RemoteTimeoutException(){
		super("Timeout when waiting for response from the remote server.");
	}
	
}
