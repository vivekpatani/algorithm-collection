package interviews;

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String INPUT = sc.nextLine();
        
        String[] words = INPUT.split(" ");
        int M = sc.nextInt();
        
        String dump = sc.nextLine();
        System.out.println(dump);
        Map<Integer,Map<String, Integer>> hotelReviews = new HashMap<>();
        
        for (int i = 0; i < M; i++) {
            int ID = sc.nextInt();
            if (!hotelReviews.containsKey(ID)) hotelReviews.put(ID, new HashMap<String, Integer>());
            String REVIEW = sc.next();
            String[] review = REVIEW.split(" ");
            
            for (int j = 0; j < review.length; j++) {
                Map<String, Integer> hotel = hotelReviews.get(ID);
                if (hotel.containsKey(review[j])) {
                    hotel.put(review[j], hotel.get(review[j]) + 1);
                } else {
                    hotel.put(review[j], 1);
                }
            }
        }
        
        System.out.println(hotelReviews);
    }
}