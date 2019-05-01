package threads;

public class FileProgram extends CopyDataThread {
	
	public FileProgram(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		CopyDataThread c=new CopyDataThread("s1");
		Thread t=new Thread(c);
		t.start();
	}

}
