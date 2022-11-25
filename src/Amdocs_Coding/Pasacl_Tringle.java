package Goldman_Sachs;

public class Pasacl_Tringle {

			  public static void main(String[] args) {
			       getElementFromTriangle(5,2);
			  }


			  // time and space complx n^2
			  static void getElementFromTriangle(int row, int index){
			    int[][] triangleArray = new int[row][row];

			    for(int i = 0; i <= row-1; i++){
			      for(int j = 0; j<=i; j++){
			        triangleArray[i][j]   = fetchValue(triangleArray, i, j);
			        if(i == row-1 && j==index-1){
			          System.out.println("Got value for co-ordinates is - " + triangleArray[i][j]);
			          break;
			        }
			      }

			      }

			    }
			    
			  static int fetchValue(int[][] triangleArray, int i, int j){
			    if(j==0 || j==i){   // covers first and last element of each row
			      return 1;
			    }
			    else if(i<0 || j<0){    // covers when recursion looks for any element which doesn't exists.
			      return 0;
			    }

			    return fetchValue(triangleArray, i-1, j-1) + fetchValue(triangleArray, i-1, j);
			    
			  }
			
	}


