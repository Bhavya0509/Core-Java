
public class PracticeExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//print
		//1 2 3 4
		//5 6 7
		//8 9
		//10
		
		int count =1;
		for(int i=0;i<4;i++) {
			
			for(int j=1;j<=4-i;j++) {
				
				System.out.print(count +" ");
				count++;
				
			}
			System.out.println();
		}

	}

}
