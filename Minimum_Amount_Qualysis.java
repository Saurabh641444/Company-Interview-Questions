import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int prices[]={4,9,2,3};
        
        int min=prices[0];
        int ans=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>=min){
                ans+=prices[i]-min;
            }
            
            min=Math.min(min,prices[i]);
        }
        
        System.out.println(ans);
    }
}
