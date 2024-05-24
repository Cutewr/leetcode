package AAAoffer.DigitOneInNumber_39;

public class solution {
    public int countDigitOne(int n) {
        int bit=1;
        int sum=0;
        while (bit<n) {
            int cur=(n/bit)%10;
            int low=n%bit;
            int high=n/bit/10;
            if (cur==1) {
                sum+= high*bit+low+1;
            }else if (cur>1) {
                sum+=(high+1)*bit;
            }else{
                sum+=high*bit;
            }
            bit =bit *10;
        }
        return sum;
    }
}
