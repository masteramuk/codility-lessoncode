import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Haszeli Ahmad
 */
public class Solution {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Solution s = new Solution();
        int[] A = new int[]{};
        
        for (int i = 0; i < 10000; ++i){
            A = s.putNumberInSeries(generateRandomIntIntRange(0,100), A);
        }
        
        //the date and time is to check and ensure the solution is within limit of 0.1 seconds
        java.util.Date d1 = new java.util.Date();
        int x = s.solution (A);
        java.util.Date d2 = new java.util.Date();
        
        System.out.println("Time taken: " + ( (d2.getTime()-d1.getTime()) ) );
        
        System.err.println( x );
    }
    
    /*
    * The function below is to copy the created new element into existing array. 
    * This is for testing on multiple possible test before posted at codility
    */
    public int[] putNumberInSeries(int i, int[] series) {
        int[] localSeries = Arrays.copyOf(series, series.length+1);
        localSeries[series.length] = i;
        //System.out.println(localSeries);
        return localSeries;
    }
    
    /*
     * Just to generate random number for testing only
    */
    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /* Actual code posted to codility and Score 100% */
    public int solution (int[] A){
        int lowestDiff = 0;
        int currTotal = 0;
        int idx = 0;
        int currDiff = 0;
        
        //count the total sum of the array
        int totalSum = 0;
        
        for (int i = 0; i < A.length; ++i){
            totalSum += A[i];
        }
        
        //set the initial value
        currTotal += A[idx];
        lowestDiff = Math.abs(currTotal - (totalSum - currTotal) ) ;
        
        //start find the difference
        for(idx = 1; idx < A.length-1; ++idx){
            currTotal += A[idx];
            currDiff = Math.abs(currTotal - (totalSum - currTotal) );
            //compare the new value with stored value
            if ( currDiff < lowestDiff ){
                lowestDiff = currDiff;
            }
        }
        
        return lowestDiff; //return the lowest value
    };
    
    
}
