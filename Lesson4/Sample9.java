import java.io.*;

class Sample9{
	public static void main(String[] args)throws IOException{
		double dnum = 160.5;
		System.out.println("dnum="+dnum);
		System.out.println("dnumを明示的にintに代入");

		int inum = (int)dnum;
		System.out.println("inum="+inum);

	}
}
