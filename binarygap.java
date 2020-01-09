public int solution (int N){
  //Convert the value to binary and split the value between number 1
  String s2[] = Integer.toBinaryString(N).substring(0, Integer.toBinaryString(N).lastIndexOf('1') ).split("1");
  int x = 0;
  int a = 0;

  //find and count the longest zeros
  while(x < s2.length){
      a = a > s2[x].length() ? a : s2[x].length();
      x++;
  }

  System.out.println("Number: " + N + System.lineSeparator() + "Binary: " + Integer.toBinaryString(N) 
          + System.lineSeparator() + "Zero: " + a);
  return a;
};
