package queue;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DownToZero {

	static int downToZero(int n) {
	       String s;
	       int r , max;
	       int steps = 0;
	       while(n!=0){
	           s = getMultiples(n);
	           if(s == "even"){
	                r = n % 2;
	                max = Math.max(r,2); 
	                steps++;
	                n = max;
	               
	           }
	           if(s == "odd"){
	                r = n % 3;
	                max = Math.max(r,3); 
	                steps++;
	                n = max;
	                
	           }
	           if(s == "prime"){
	                n--; 
	                steps++;
	           }
	       }
	        return steps;
	    }
	    
	    static String getMultiples(int n){
	        
	        if(n<=3) return  "prime";
	                 
	        if(n%2 == 0){
	            return "even";
	        }else if(n%3 == 0){
	            return "odd";
	        }else{
	            return "prime";
	        }
	                
	    }
	    
	    

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args){
	        
	        int q = Integer.parseInt(scanner.nextLine().trim());

	        for (int qItr = 0; qItr < q; qItr++) {
	            int n = Integer.parseInt(scanner.nextLine().trim());

	            int result = downToZero(n);
	            System.out.println(result);
	           
	        }

	        
	    }

}
