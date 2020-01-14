public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = new int[]{2,3,1,4,5,6};//{1,2,3,4,5,6,7,8,9};
        int x = s.solution (A);
        System.err.println( x );
    }
    
    //This is the code posted in codility
    public int solution (int[] A){
        int expectedInt = 1;
        int missingInt = 0;
        
        //sort the array
        Arrays.sort(A);
        
        //Check if the length is zero
        if( A.length > 0 ){
            for (int x : A){ //loop to find the missing int
                if (x == expectedInt){
                    expectedInt++;
                } else {
                    missingInt = expectedInt;
                }
            }
        } else if (A.length == 0) {
            missingInt = 0;
        }
        //final check of the missing int
        missingInt = missingInt > 0 ? 0 : 1;
        
        return missingInt; //return the missing int
    };
