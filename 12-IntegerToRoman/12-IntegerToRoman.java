// Last updated: 8/11/2026, 11:29:29 AM
class Solution {
    public String intToRoman(int num) {
        
        int []value= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[]str ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<value.length;i++){
            if(num == 0)
            {
                break;
            }
            while(num>=value[i])
            {
                num=num-value[i];
                sb.append(str[i]);
            }


        }
        return sb.toString();
        
    }
}