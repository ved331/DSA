class Solution {
    public boolean hasAlternatingBits(int n) {
    while(n>1){
     int bitmask=n & 1;
     int bitmask2=(n >> 1) & 1;

     if(bitmask==bitmask2){
        return false;
     }
      n=n >> 1;
    }
    return true;
    }
}