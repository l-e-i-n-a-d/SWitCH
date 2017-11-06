package aula20171102;

import java.util.Arrays;

public class Vetor {
	private int[] v;

	public Vetor(int[] v) {
		this.v = v;
	}

	public int getV(int index) {
		return this.v[index];
	}

	public void setV(int index, int value) {
		this.v[index] = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(v);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vetor other = (Vetor) obj;
		if (!Arrays.equals(v, other.v))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Vetor [v=" + Arrays.toString(v) + "]";
	}
	
	
}
