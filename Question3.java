import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		Map<String, Integer> hashMap = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {

			
			Integer integer = hashMap.get(word);

			if (integer == null)
				hashMap.put(word, 1);

			else {
				hashMap.put(word, integer + 1);
			}
		}
		System.out.println(hashMap);
	}
}
