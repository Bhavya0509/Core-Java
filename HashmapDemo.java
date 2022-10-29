import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "hello");
		hm.put(2, "bye");
		hm.put(3, "morning");
		hm.put(4, "evening");
		hm.put(5, "night");
		
		System.out.println(hm.get(5));
		hm.remove(5);
		System.out.println(hm.get(5));
		
		Set sn= hm.entrySet();
		Iterator it =sn.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry mp =(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		

	}

}
