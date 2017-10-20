package aula20171017;

import java.net.InetAddress;

public class Client {
	
	
	private String nickName;
	private InetAddress tcp;
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public InetAddress getTcp() {
		return tcp;
	}
	public void setTcp(InetAddress tcp) {
		this.tcp = tcp;
	}
	
	
}
