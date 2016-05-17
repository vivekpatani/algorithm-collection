class Solution2{
    public static void main(String[] args){
        int n = 15;
        String input = "The quick brown fox jumped over the lazy dog";
        display(n,input);
    }
    
    public static void display(int n, String input){
        
    	int counter = 0;
        for (int i=0; i<input.length(); i++){
        	counter++;
            if (input.charAt(i) == ' '){
            	while(input.charAt(i)!= ' ' || i < input.length()){
            		counter++;
            		i++;
            	}
            	if(i % n == 0)
            		System.out.println(input.substring(i-counter, i));
            } else System.out.println(input.substring(i-counter,i));
        }
    }
}