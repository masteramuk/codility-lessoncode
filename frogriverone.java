public int solution (int X, int[] A){
        HashSet<Integer> list= new HashSet();
        
        try{
            //finding the exit data point
            for(int idx = 0; idx < A.length; idx++){
                if ( !list.contains(A[idx]) ){
                    list.add(A[idx]);
                }
                if ( list.size() == X ){
                    return idx;
                }
            }
        }catch(Exception e){
            return -1;
        }
        
        return -1;
    }
