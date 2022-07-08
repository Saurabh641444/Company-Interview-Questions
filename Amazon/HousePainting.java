import java.util.*;
import java.io.*;
public class HousePainting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int T=Integer.parseInt(br.readLine().trim());
      
      while(T-->0) {
    	  int n=Integer.parseInt(br.readLine().trim());
    	  if(n<0&&n<=3) {
    		  System.out.println("Invalid input");
    	  }
    	  
    	  String str[]=br.readLine().trim().split(" ");
    	  int costs[][]=new int[n][3];
    	  int k=0;
    	  for(int i=0;i<n;i++) {
    		  for(int j=0;j<3;j++) {
    			  costs[i][j]=Integer.parseInt(str[k++]);
    		  }
    	  }
      Solution_y obj=new Solution_y();
      
      System.out.println(obj.minCost(costs));
	    }
      }

}
 class Solution_y {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] costs) {
        // write your code here
       if(costs.length==0 || costs==null) return 0;
     int n=costs.length;
      for(int i=1;i<costs.length;i++){
           costs[i][0]+=Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1]+=Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2]+=Math.min(costs[i-1][1],costs[i-1][0]);
        }

       return Math.min(costs[n-1][0],Math.min(costs[n-1][1],costs[n-1][2]));
    }
}

/*
 1
2
1 2 3 1 4 5

==>3

2
3
14 2 11 11 14 5 14 3 10

==>10

 * */
 