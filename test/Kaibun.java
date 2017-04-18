public class Kaibun {
	public static void main(String[] args) {



		long start = System.currentTimeMillis();
		for(int i = 11;i < 10000000; i+=2){
			if(!hantei(String.valueOf(i)))continue;		//10進数の回文判定
			if(!hantei(henkan(i,8)))continue;			// 8進数の回文判定
			if(!hantei(henkan(i,2)))continue;			// 2進数の回文判定
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}
	static boolean hantei(String str){
		int min = 0;
		int max = str.length() - 1;
		while(min < max){
			if(str.charAt(min) != str.charAt(max))return false;
			min++;
			max--;
		}
		return true;
	}
	static String henkan(int num,int kisuu){
		StringBuilder sb = new StringBuilder();

		while(num != 0){
			char ch = (char) ('0' + num % kisuu);
			sb.insert(0,ch);
			num = num / kisuu;
		}

		return sb.toString();
	}
}