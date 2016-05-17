package tk.vivekpatani.algorithm_collection.bloom;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
class Soltuion3{
    public static void main(String[] args){
        
        System.out.println("Last Man Standing Will be "+lastMan(Integer.parseInt(args[0]))+".");
    }
    
    public static int lastMan(int n){
        
    	Queue<Integer> person = new ConcurrentLinkedQueue<Integer>();
        for(int i=1;i<n+1;i++) {
        	person.add(i);
        }
        int count = n;
        while(count>1){
            System.out.println(count);
            int criminal_not_killed = person.remove();
            int criminal_actual = person.remove();
            count--;
            person.add(criminal_not_killed);
            }
            int finalCriminal = person.remove(); 
            return finalCriminal;
        }
}