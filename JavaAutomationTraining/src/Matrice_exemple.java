
public class Matrice_exemple {

	public static void main(String[] args) {
		// 
		
		
		int mat[][]= {{1, 7, 9, 19, 12},
				      {5, 6, 2, 4, 11},
					  {3, 5, 3, 11, 3},
					  {23, 8, 13, 6, 2},
					  {10, 2, 3, 4, 18}};

        // take length of matrix
        int n = mat.length;

 
        // declare and initialis variables with appropriate value
        
        int principalMin = mat[0][0];
        int principalMax = mat[0][0];
        
        int secondaryMin = mat[n-1][0];
        int secondaryMax = mat[n-1][0];
 
        for (int i = 0; i < n; i++) 
        {
            // Condition for principal
            // diagonal mat[i][i]
 
            // take new smallest value
            if (mat[i][i] < principalMin)
            {
                principalMin = mat[i][i];
            }
            // take new largest value
            if (mat[i][i] > principalMax)
            {
                principalMax = mat[i][i];
            }
 
            // Condition for secondary
            // diagonal is mat[n-1-i][i]
            
            // take new smallest value
            if (mat[n - 1 - i][i] < secondaryMin)
            {
                secondaryMin = mat[n - 1 - i][i];
            }
            // take new largest value
            if (mat[n - 1 - i][i] > secondaryMax)
            {
                secondaryMax = mat[n - 1 - i][i];
            }
        }
 System.out.println("Principal Diagonal Smallest Element:  " + principalMin);
 System.out.println("Principal Diagonal Greatest Element : "+ principalMax);

 System.out.println("Secondary Diagonal Smallest Element: "+ secondaryMin);
 System.out.println("Secondary Diagonal Greatest Element: "+ secondaryMax);


		

	

	}
}
