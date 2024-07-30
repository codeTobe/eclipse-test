
public class ScoreAverage {
	public static void main(String []args) {
		int intArray[][] = new int[2][];
		intArray[0] = new int[3];
		intArray[1] = new int[4];
		
		for(int i = 0; i < intArray.length; i++) { // 행에 대한 반복
			for(int j = 0; j < intArray[i].length; j++) { //열에 대한 반복
				intArray[i][j] = (i+1)*10 + j;
				
			}
		}
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j=0; j < intArray[i].length; j++)
				System.out.print(intArray[i][j]+ " ");
			System.out.println();
		}
		
	}
}