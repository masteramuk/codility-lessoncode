import java.util.Arrays;

public int solution (int[] A){
        int a = 0;
        int expectedInt = 1;
        int missingInt = 0;
        
        //sort the array
        Arrays.sort(A);
        
        if( A.length > 0 ){
            for (int x : A){
                if (x == expectedInt){ //if found a value based on expected value
                    expectedInt++;
                } else { //if found a mising value 
                    missingInt = expectedInt;
                }
            }
        } else if (A.length == 0) {
            missingInt = 1;
        }
        if (missingInt == 0){ //if no missing value, just set to the last value + 1
            missingInt = A[A.length - 1] + 1;
        }
        
        return missingInt;
    };
    
