package aula20171017;

import java.io.DataOutputStream;

public class Client {

	private DataOutputStream outS;

	public Client(DataOutputStream outS) {
		this.outS = outS;
	}

	public DataOutputStream getOutS() {
		return outS;
	}
}
