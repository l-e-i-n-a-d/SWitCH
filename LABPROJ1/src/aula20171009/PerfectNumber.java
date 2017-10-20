package aula20171009;

//Verificar se um número é perfeito - igual à soma do cubo dos seus algarismos

public class PerfectNumber {

	public static void main(String[] args) {
		
		for(int i = 0; i<2000; i++) {
			if(isPerfect(i)) {
			System.out.println(i);
			}
		}
	}

	public static boolean isPerfect(int num) {
		String str = new String();
		str = Integer.toString(num);
		boolean b = false;
		int[] arr = new int[str.length()];
		int[] arrCube = new int[str.length()];
		int a = 0;

		for (int i = 0; i < str.length(); i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		
		for (int i = 0; i < arr.length; i++) {
			arrCube[i] = arr[i] * arr[i] * arr[i];
			a += arrCube[i];
		}

		if(a == num) {
			b = true;
		}
		return b;
	}

}
