public int solution(int X, int Y, int D){
    int a = 0;
    Y = Y - X; //setting the initial value test

    if (Y >= 1){ //evaluating the Y value
        a = Y/D; //setting the initial return value
        if (Y % D > 0){ //evaluating the possible number of jump to add additional value
            a++;
        }
    }
    if ( a == 0 && (Y%D==0) && Y > X ){ //final check
        a = 1;
    }
    return a;
};
