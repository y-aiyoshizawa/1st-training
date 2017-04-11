import java.io.*;

class Sample5{
	public static void main(String[] args)throws IOException{

		int a = 0;
		int b = 0;

		//++a++;はできない

		b = a++;
		//b = ++a;

		System.out.println("b = a++;を実行");
		System.out.println("b = " + b);


	}
}
