package tk.vivekpatani.algorithm_collection.bloom;
class Solution{
    
    /*
     * This is the main method call, pass the value as argument[0]
     */
    public static void main(String[] args){
        
        int n = 43;
        
        //Method call to check whether if it is a prime number
        boolean result = checkPrime(n);
        System.out.println("Is it prime? "+result+".");
    }
    
    /*
     * The parameter here is the number
     * Makes n/2 computations
     * If prime then true, else false
     */
    public static boolean checkPrime(int n){
        
        //Go from 2 to n/2, since if it is not divisible by n/2, it wouldn't be from then on
        for(int i=2;i<n/2;i++){
            
            //If the number is divisible, then it ain't prime.
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}