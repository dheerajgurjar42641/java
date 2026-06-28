public class Lc66 {
    public int[] plusOne(int[] digits) {
        int i =digits.length-1;
        while(i>=0){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            i--;
        }
        int ans[] = new int[digits.length+1];
        ans[0]=1;
        return ans;
        
    }
}
