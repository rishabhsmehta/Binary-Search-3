//Time: O(logn)
//Space: O(logn)
class Solution {
    public double myPow(double x, int n) {
        
        return helper(x,n);
    }
    
    public double helper(double x, int n){
        if(n==0){return 1;}
        
        if(n%2==0){
            
            double ans =helper(x,n/2);
          
             return ans * ans ;
                
            
        }else{
            
            double ans =helper(x,n/2);
             if(n<0){
              return ans*ans*(1/x);
              
           }else{
               return ans * ans *(x);
               
           }
            
        }
        
        
    }
}
