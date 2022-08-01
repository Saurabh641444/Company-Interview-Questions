import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
       
        
        String S="boolean";
        HashSet<Character> set=new HashSet<>();
        boolean dp[][]=new boolean[S.length()][S.length()];
        for(int i=0;i<S.length();i++){
             set.add(S.charAt(i));
             dp[i][i]=true;
           }
    int count=0;
    int flag=1;
       for(int i=S.length()-1;i>=0;i--){
             for(int j=S.length()-1;j>i;j--){
              if(S.charAt(i)==S.charAt(j) && flag==1){
                  flag--;
                    dp[i][j]=true;
                    count++;
              }
              else  if(S.charAt(i)==S.charAt(j) && dp[i+1][j-1]==true){
                   dp[i][j]=true;
                    count++;
                    System.out.println("Euu");
                  }
                  
                  System.out.println("i= "+i +"j= "+ j+ dp[i][j]);
              }
            }

   for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
           System.out.print(dp[i][j]+" ");
         }
        System.out.println();
       }

      System.out.println(count+set.size());
    }
}
