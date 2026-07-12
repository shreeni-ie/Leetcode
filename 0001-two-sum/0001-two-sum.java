class Solution {
    public int[] twoSum(int[] A, int t) {
        for(int i=0; i<A.length; i++){
            for ( int j=i+1; j<A.length;j++ ){
                if((A[i]+A[j])==t) return new int[] {i,j};
            }
        }
        return new int[] {};
    }
}