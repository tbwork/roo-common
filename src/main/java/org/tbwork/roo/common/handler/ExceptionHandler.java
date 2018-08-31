package org.tbwork.roo.common.handler;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext; 
public class ExceptionHandler extends ChannelHandlerAdapter {

	static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);  
	
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { 
    	if(cause instanceof IOException) { 
    		logger.warn("The roo server (address = {}) disconnected initiatively! ", ctx.channel().remoteAddress());
    	}
    	else {
    		logger.warn("Exceptions caught, more details: ");
    		cause.printStackTrace();
    	} 
        ctx.close();
    }
     
}