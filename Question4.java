import java.util.Scanner;
public class Question4 {  
     public static void main(String[] args) {  
 		Scanner sc=new Scanner(System.in);
 		String str = sc.nextLine();
        int count;   
        char str1[] = str.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        for(int i = 0; i <str1.length; i++) {  
            count = 1;  
            for(int j = i+1; j <str1.length; j++) {  
                if(str1[i] == str1[j] && str1[i] != ' ') {  
                    count++;   
                    str1[j] = '0';  
                }  
            }   
            if(count > 1 && str1[i] != '0')  
                System.out.print(str1[i]+" ");  
        }  
    }  
}  