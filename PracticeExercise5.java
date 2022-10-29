import java.util.ArrayList;

public class PracticeExercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			
			int count = 1;
			
			if (!al.contains(a[i])) {
                 al.add(a[i]);
                 
				for (int j = i + 1; j < a.length; j++) {
					
					if (a[i] == a[j]) {
						count++;
					}
				}
				
				System.out.println("element is "+a[i] + " and it's count =" + count);
				if(count==1) {
					System.out.println(a[i]+" is the unique number");
				}
			}

		}
	}

}
