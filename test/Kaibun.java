public class Kaibun {
	public static void main(String[] args) {

		for(int i = 11;; i += 2){
			if(!hantei(String.valueOf(i)))continue;				//10進数の回文判定
			if(!hantei(Integer.toOctalString(i)))continue;		// 8進数の回文判定
			if(!hantei(Integer.toBinaryString(i)))continue;		// 2進数の回文判定
			System.out.println(i);
			break;
		}

	}

	//回文かどうかの判定
	static boolean hantei(String str){
		int min = 0;
		int max = str.length() - 1;
		while(min < max){
			if(str.charAt(min) != str.charAt(max)){
				return false;
			}
			min++;
			max--;
		}
		return true;
	}
}
