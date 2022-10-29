
public class PracticeExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* find minimum number of the given matrix and then print the maximum number in that column 
		 * here answer will be 10
		 * 2 4 5
		 * 3 2 10
		 * 1 2 0
		 */
		
		int a[][] = {{2,4,5},{3,2,10},{1,2,0}};
		
		int min=Integer.MAX_VALUE;
		int minColumn=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]<=min) {
					min=a[i][j];
					minColumn=j;
				}
			}
		}
		
		int k=0;
		int max=Integer.MIN_VALUE;
		while(k<3) {
			if(a[k][minColumn]>max) {
				max=a[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
	}

}
