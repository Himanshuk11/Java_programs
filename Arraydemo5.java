package Array;

public class Arraydemo5
{
	public static void main(String[] args)
	{
		int [] a=new int[] {12,2,1,1,2,4,5,6,7,12,1};
int fr[]=new int[a.length];
int visit=-1;
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					fr[j]=visit;
				}
			}
			if(fr[i]!=visit)
				fr[i]=cnt;
		}
			System.out.println("Frequency of elements is as follows: ");
			for(int i=0;i<fr.length;i++)
			{
			if(fr[i]!=visit)
			System.out.println(a[i]+"="+fr[i]);
			}
		}
	}
