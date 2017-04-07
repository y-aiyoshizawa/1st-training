import java.io.*;

class Sample6
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("2つの整数を入力してください");

		String str1 = br.readLine();
		String str2 = br.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		System.out.println("最初に入力された数値"+num1);
		System.out.println("２回目に入力された数値"+num2);
	}
}
