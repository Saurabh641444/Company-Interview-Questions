/**
 * I own a parking garage that provides valet parking service.
 * When a customer pulls up to the entrance they are either rejected
 * because the garage is full, or they are given a ticket they can
 * use to collect their car, and the car is parked for them.
 *
 * Given a set of different parking bays (Small, Medium, Large),
 * write a control program to accept/reject cars (also small, medium or large)
 * as they arrive, and issue/redeem tickets.
 *
 * Garage layout is 1 small bay, 1 medium bay, and 2 large bays: [1,1,2]
 *
 * First sequence Actions:
 * [(arrival, small),
 * (arrival, large),
 * (arrival, medium),
 * (arrival, large),
 * (arrival, medium)]
 *
 * Expected output: [1, 2, 3, 4, reject]
 *
 * Second sequence Actions:
 * [(arrival, small),
 * (arrival, large),
 * (arrival, medium),
 * (arrival, large),
 * (depart, 3),
 * (arrival, medium)]
 *
 * Expected output: [1, 2, 3, 4, 5]
 */

import java.io.*;
import java.util.*;
public class AmazonHomeScreenParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         Parking p=new Parking(1,1,2);
         System.out.println(p.arrival(0));
         System.out.println(p.arrival(1));
         System.out.println(p.arrival(2));
         p.departure(0);
         System.out.println(p.arrival(1));
         
	}

}

class Parking{
	 HashMap<Integer,Integer> layout;
 int cars[];
	 int tickets;
	public Parking(int small, int medium, int large) {
		// TODO Auto-generated constructor stub
		layout=new HashMap<>();
		 cars=new int[small+medium+large];
		Arrays.fill(cars,-1);
		layout.put(0,small);
		layout.put(1, medium);
		layout.put(2, large);
		
	}

	public  int arrival(int size) {
		if(layout.get(size)==0 || cars.length==tickets) {return -1;}
		layout.put(size, layout.get(size)-1);
		cars[tickets]=size;
		tickets++;
		return tickets;
	}
	
	public  void departure(int ticket) {
		
		if(tickets<0 || cars[tickets]==-1 || tickets>cars.length) return;
		int size=cars[tickets];
		cars[tickets]=-1;
		tickets--;
		layout.put(size, layout.get(size)-1);
		return;
	}
}
