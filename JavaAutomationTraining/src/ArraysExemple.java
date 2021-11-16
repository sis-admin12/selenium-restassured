
public class ArraysExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
int a[]=new int[5];//declara array si aloca memorie necesara
a[0]=20;
a[1]=399;
a[2]=5;
a[3]=33;
a[4]=21;

for(int i=0; i<a.length;i++)
{
	System.out.println(a[i]);
}


int b[]= {8,9,4,54,45,85};


for(int j=0;j<b.length;j++)
{
	System.out.println(b[j]);
}
*/
//multidimensional array
int c[][]= {{2,5,8},{9,8,7}};

for (int i=0; i<2; i++) //rind
{
	for (int j=0; j<3; j++) //coloana
	{
System.out.println(c[i][j]);
	}
}
	}

}
