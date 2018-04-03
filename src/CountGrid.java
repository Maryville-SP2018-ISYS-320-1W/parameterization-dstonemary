/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-01-2018
*/

public class CountGrid {
	
	public static void main(String[] args) {
		
		printGrid(4, 6);
	}
	public static void printGrid( int col, int row ){
		for(int i = 1;i <= col ; i++){
			System.out.print(i+"  ");
			int count  = i;
			for(int j =1; j <=(row-1) ; j++){
				count =  count + col;
				System.out.print(count+"  ");
			}
			System.out.println();
		}
	}

}
