class Bubble
{
	public static void main(String as[])
	{
		int i,j,swap;
		int a[]=new int[as.length];
		for(i=0;i<=as.length-1;i++)
		{
			a[i]=Integer.parseInt(as[i]);
		}
			
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<(a.length)-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
			}
		}
		for(i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
