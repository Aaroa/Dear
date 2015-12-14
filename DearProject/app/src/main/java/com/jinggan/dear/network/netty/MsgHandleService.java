package com.jinggan.dear.network.netty;



import com.jinggan.dear.probufu.InformationPacket;

import java.util.List;

import io.netty.channel.ChannelHandlerContext;


public class MsgHandleService {
	
	public static ChannelHandlerContext channel;
	private static MsgAgreement msgAgree = new MsgAgreement(true);
	
	static public void doMsgForShunt(InformationPacket.Group group){
		
		switch (group.getMsgEnum().getNumber()) {
		
		case InformationPacket.MsgEnum.HeartBeat_VALUE:
			NoticeHeartBeatMsgInfo(group.getServerConnectEnum());
			break;
		
		//连接服务端反馈
		case InformationPacket.MsgEnum.ReuqestToConnect_VALUE:
			
			NoticeConnectState(group.getServerConnectEnum());
			
			break;
		case InformationPacket.MsgEnum.CheckToLogin_VALUE:
			
			NoticeLoginState(group.getLogin().getLoginState(),group.getLogin());
			
			break;
		case InformationPacket.MsgEnum.ChatOneToOne_VALUE:
			
			break;
		case InformationPacket.MsgEnum.ChatOneToAll_VALUE:
			NoticeReceivedMsgInfo(group.getMsgInfo());
			
			System.out.println("InformationPacket.MsgEnum.ChatToFriend_VALUE ==> 收到全部消息");
			
			break;
		case InformationPacket.MsgEnum.ChatToFriend_VALUE:
			
			NoticeRefreshFriendsList(group.getUserListList());
			
			System.out.println("InformationPacket.MsgEnum.ChatToFriend_VALUE ==> 收到朋友群消息");
			
			break;
		default:
			break;
		}
		
	}
	
	private static void NoticeHeartBeatMsgInfo(InformationPacket.Group.ServerConnectEnum serverConnectEnum){
		
		if(serverConnectEnum == InformationPacket.Group.ServerConnectEnum.Success){
			doHeartBeat();
			System.out.println("发送心跳信息====> "+ serverConnectEnum + channel.channel().id());
		}else{
			
		}
	}
	
	/**
	 * 
	 * @param msgInfo
	 */
	private static void NoticeReceivedMsgInfo(InformationPacket.MsgInfo msgInfo) {
		
		//coreBusinessControl.doReceivedMsgInfo(msgInfo);
		
	}

	/**
	 * 
	 * @param userListList
	 */
	private static void NoticeRefreshFriendsList(List<InformationPacket.Group.User> userListList) {
		//coreBusinessControl.doRefreshFriendList(userListList);
	}

	/**
	 * 通知登录状态
	 * @param loginState
	 * @param login
	 */
	private static void NoticeLoginState(InformationPacket.Login.LoinEnum loginState, InformationPacket.Login login) {
		
		if(loginState == InformationPacket.Login.LoinEnum.Success){
			//coreBusinessControl.doChangeGroupChatView(login);
		}else{
			
		}
		
	}

	/**
	 * 通知连接状态
	 * @param serverConnectEnum
	 */
	private static void NoticeConnectState(InformationPacket.Group.ServerConnectEnum serverConnectEnum) {
		
		if(serverConnectEnum == InformationPacket.Group.ServerConnectEnum.Success){
			//coreBusinessControl.doCheckLogin();
			UserBean userBean = new UserBean();
			userBean.setUserName("001");
			userBean.setUserPwd("001");
			doCheckLogin(userBean);
			System.out.println("发送登录信息"+serverConnectEnum);
		}else{

		}
	}

	static public void doCheckLogin(UserBean user){
		channel.writeAndFlush(msgAgree.doGetLoginInfoPacket(user.getUserName(), user.getUserPwd()));
	}
	
	
	static public void doSendMsgStr(String userName,String msgStr){
		channel.writeAndFlush(msgAgree.doGetGroupSendInfoPacket(userName, msgStr));
	}
	
	static public void doHeartBeat(){
		channel.writeAndFlush(msgAgree.doGetHeartBeatServerInfoPacket(InformationPacket.Group.ServerConnectEnum.Success));
	}
}
