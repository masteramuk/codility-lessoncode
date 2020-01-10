public int solution (int[] A){
        int a = 0;
        //sort the array
        Arrays.sort(A);
        
        int[] sortA = A;
        int x = 0;
        int cnt = 1;
        int[] oddA = new int[]{};
        //int idxOdd = 0;
        
        while ( x < sortA.length ){
            if ( x != 0 ){
                if (a == sortA[x]){
                    cnt++;
                } else {
                    if (cnt % 2 > 0){
                        oddA = Arrays.copyOf(oddA, oddA.length + 1 ); //sortA[ x - 1];
                        oddA[oddA.length - 1] = sortA [x - 1];
                    } 
                    a = sortA[x];
                    cnt = 1;
                }
            } else {
                a = sortA[x];
            }
            x++;
        }
        if ( x == sortA.length && cnt == 1) {
            oddA = Arrays.copyOf(oddA, oddA.length + 1 ); //sortA[ x - 1];
            oddA[oddA.length - 1] = sortA[x - 1];
        }
        System.err.println("sortA: " + Arrays.toString(sortA) + System.lineSeparator() + "Result: " + Arrays.toString(oddA));
        return oddA[0];
    };
