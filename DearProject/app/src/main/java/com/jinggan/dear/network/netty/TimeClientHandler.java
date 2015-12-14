package com.jinggan.dear.network.netty;


import com.jinggan.dear.probufu.InformationPacket;
import com.jinggan.dear.utils.ILog;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;


public class TimeClientHandler extends ChannelHandlerAdapter{

//	private static final Logger logger = LoggerFactory.getLogger(TimeClientHandler.class.getName());

	private  final String TAG="TimeclientHandler";
	
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		
		MsgHandleService.channel = ctx;
//		logger.debug("channelActive() ...");
		ILog.d(TAG,"channelActive");
//		if(serverConnectEnum == InformationPacket.Group.ServerConnectEnum.Success){
//			ctx.writeAndFlush(InformationPacket.Group.ServerConnectEnum.Success);
//			System.out.println("发送心跳信息===> end!");
//		}else{
//			
//		}
		//此处应该是登录
		
	}
	
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		
		InformationPacket.Group group = (InformationPacket.Group) msg;
		
		MsgHandleService.doMsgForShunt(group);
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		super.exceptionCaught(ctx, cause);
	}
	
}
