class Solution {
    public static int solution(int N) {
        
      System.out.println(Integer.toBinaryString(N));
        
        int binaryGap = 0;
        
        while(N % 2 == 0){
            N /= 2;
        }
        
        for(int j = 0; N > 0; N/=2){
            if(N % 2 == 0){
                j++;
            }else{
                binaryGap = Math.max(binaryGap, j);
                j = 0;
            }
        }
    
        return binaryGap;
    }
}
