
public class CountGrid {

	
	public static void main(String[] args) {
		for(int i = 1;i <= 4 ; i++){
			System.out.print(i+"  ");
			int count  = i;
			for(int j =1; j <=6 ; j++){
				count =  count + 4;
				System.out.print(count+"  ");
			}
			System.out.println();
		}
	}

}
