import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }

            String out_ = solve(N, A);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }


    static String solve(int N, int[] A){
       // Write your code here
       
       int ans=0;

       for(int i=0;i<N;i++){
           if(A[i]<i) ans++;
       }
      if(ans==0) return "Yes";
      return "No";
    }
}
