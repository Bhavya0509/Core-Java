
public class PracticeExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* print minimum number of the given matrix
		 * 2 4 5
		 * 3 4 7
		 * 1 2 9
		 */
		
		int a[][] = {{2,4,5},{3,4,7},{1,2,9}};
		
		int small=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]<=small) {
					small=a[i][j];
				}
			}
			
		}

		System.out.println(small);
	
	
	// print the maximum number
	

	int ab[][] = {{2,4,5},{3,4,7},{1,2,9}};
	
	int big=Integer.MIN_VALUE;
	for(int i=0;i<ab.length;i++) {
		for(int j=0;j<ab[0].length;j++) {
			if(ab[i][j]>=big) {
				big=ab[i][j];
			}
		}
		
	}

	System.out.println(big);
}

}
