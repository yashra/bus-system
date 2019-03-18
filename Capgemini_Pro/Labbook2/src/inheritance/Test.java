package inheritance;

abstract class Item
{
	public abstract void checkin();
	public abstract void checkout();
	public abstract void additem();
}

class ItemRet extends Item
{
	private  int uid;
	private  String title;
	private  int number;
	public  ItemRet(int uid,String title,int number)
	{
		this.uid=uid;
		this.title=title;
		this.number=number;
	}
	public void SetId(int uid)
	{
		this.uid=uid;
	}
	public int getId()
	{
		return uid;
	}
	public void Settitle(String title)
	{
		this.title=title;
	}
	public String gettitle()
	{
		return title;
	}
	public void Setcopy(int number)
	{
		this.number=number;
	}
	public int getcopy()
	{
		return number;
	}
	public String toString()
	{
		return(uid+"\t"+title+"\t"+number+"\t");
	}
	public void checkin()
	{
		System.out.println("You are checked in");
	}
	public void checkout()
	{
		System.out.println("You are Checked out");
	}
	public void additem()
	{
		System.out.println("Item added");
	}
}
public class Test {

	public static void main(String[] args)
	{
		ItemRet i=new ItemRet(101,"ABC",5);
		i.checkin();
		i.checkout();
		i.additem();
		System.out.println(i);
		
		
	}
}
