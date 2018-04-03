/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-01-2018
*/

public class P8_NumberPrinter {

	public static void main(String[] args) {
		printNumbers(5);
		System.out.println();
		printStepRange(5, 2);
	}
	public static void  printNumbers(int count){
		for(int i = 1; i <= count; i ++){
			System.out.print("["+i+"] ");
		}
	}
	
	public static void  printStepRange(int count, int interval){
		for(int i =1; i <= count; i = i + interval){
			System.out.print("["+i+"] ");
		}
	}
}
