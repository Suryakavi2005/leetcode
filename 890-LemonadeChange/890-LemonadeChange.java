// Last updated: 8/11/2026, 11:26:30 AM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bill_5 =0;
        int bill_10 =0;
        int bill_20 =0;
        int n= bills.length;
        for(int i=0;i< n;i++){
            if( bills[i] == 5){
                  bill_5++;
            }
            else if(bills[i] == 10){
                if(bill_5>= 1)
                {
                    bill_5--;
                    bill_10++;
                }
                else{
                    return false;
                }
            }
            else if(bills[i] == 20){
                if( bill_10>=1 && bill_5>=1)
                {
                     bill_5--;
                     bill_10--;
                     bill_20++;
                }
                 else if(bill_5 >=3)
                {
                    bill_5-=3;
                    bill_20++;

                }
                
                else
                {
                    return false;
                }
            }
        }
       return true;
        
    }
}