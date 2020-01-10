public int[] solution (int[] A, int K){

        int a = 0;

        int[] sortA = A;

        int x = 0;

        

        while (x < K && x < A.length){

            a = sortA[sortA.length - 1];

            

            Arrays.copyOfRange(sortA, 0, sortA.length);

            sortA = Arrays.copyOf(sortA, sortA.length);

            System.arraycopy(sortA, 0, sortA, 1, sortA.length - 1);

            sortA[0] = a;

            

            System.err.println( x + " : " + Arrays.toString(sortA) + " - " + a);

            

            x++;

        }

        return sortA;

    };
