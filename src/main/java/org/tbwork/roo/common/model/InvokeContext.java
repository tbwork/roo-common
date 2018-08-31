package org.tbwork.roo.common.model;

import java.util.concurrent.locks.ReentrantLock;

import lombok.Data;

@Data
public class InvokeContext extends ReentrantLock{

	/**
	 * ID of the call, which is a global unique string.
	 */
	private String invokeId;

	/**
	 * Check whether this context is finished.
	 */
	private volatile boolean tackled;

	
	public InvokeContext(){
		super(true);// fair lock
	}
}
