
public class Ordonareanumerelor {

	public static void main(String[] args) {
		// ordonearea numerelor crescator
int a[]= {1,5,3,1,7,4,9};
int temp;//variabila temporara

for(int i=0;i<7;i++)
{
	for(int j=i+1;j<7;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];//punem valoarea a[i] in variabila temporara
			a[i]=a[j];//punem valoarea a[j] in valoarea a[i]
			a[j]=temp;//dam valoarea din temp la a[j]
			
		}
	}
}

for(int i=0;i<7;i++)
{
	System.out.println(a[i]);
}

	}

}
