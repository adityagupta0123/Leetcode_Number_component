class Solution {
    public int findComplement(int num) {
       String bin = Integer.toBinaryString(num);
         char[] ch = bin.toCharArray();
         String comp = "";
         for(char c : ch){
             if(c == '1')
                 comp += '0';
             else
                 comp += '1';
         }
         int dec = Integer.parseInt(comp,2);
         return dec;
        

   
   // int n = Integer.highestOneBit(num);
   // return ~num & ((n << 1)-1);
    }
}
