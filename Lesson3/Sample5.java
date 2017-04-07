import java.io.*;

class Sample5
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println("数値に変換");
		System.out.println("入力された数値"+num);
	}
}
