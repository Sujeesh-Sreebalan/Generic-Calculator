/* Importing the necessary libraries */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class JobScheduling {
/*		Calculating the Completion Time for each process and storing it*/
	private static ArrayList<Integer> calculateCompletionTime(ArrayList<ArrayList<Integer>> jobSchedule, int process) {	
		ArrayList<Integer> completionTime = new ArrayList<>();
		completionTime.add(jobSchedule.get(0).get(0) + jobSchedule.get(0).get(1));
		for(int i = 1; i < process; i++) {
			if (jobSchedule.get(i).get(0) > completionTime.get(i-1)) {
				completionTime.add(jobSchedule.get(i).get(0)+jobSchedule.get(i).get(1));
			}else {
				completionTime.add(completionTime.get(i-1) + jobSchedule.get(i).get(1));
			}
		}
		return completionTime;
	}
	
	
/*		Calculating the turn around time and storing it */
	private static ArrayList<Integer> calculateTurnAroundTime(ArrayList<ArrayList<Integer>> jobSchedule, int process, 
			ArrayList<Integer> completionTime){
		ArrayList<Integer> turnAroundTime = new ArrayList<>();
		for (int i = 0; i < process; i++) {
			turnAroundTime.add(completionTime.get(i) - jobSchedule.get(i).get(0));
		}
		return turnAroundTime;
	}
	
	private static ArrayList<Integer> calculateWaitingTime(ArrayList<ArrayList<Integer>> jobSchedule, int process,
			ArrayList<Integer> turnAroundTime){
		/*		Calculating the waiting time and Storing it */	
		ArrayList<Integer> waitingTime = new ArrayList<>();
		for(int i = 0; i < process; i++) {
			waitingTime.add(turnAroundTime.get(i) - jobSchedule.get(i).get(1));
		}
		return waitingTime;
	}
	
	

	public static void main(String[] args) {
		
/** 
 * Created a 2D ArrayList to store Arrival Time and Burst Time
 * Created a ArrayList to store the Completion Time
 * Created a ArrayList to store the turn around time
 * Created a ArrayList to store the waiting time
 * */		
		ArrayList<ArrayList<Integer>> jobSchedule = new ArrayList<ArrayList<Integer>>(); 
		ArrayList<Integer> completionTime = new ArrayList<>();
		ArrayList<Integer> turnAroundTime = new ArrayList<>();
		ArrayList<Integer> waitingTime = new ArrayList<>();
		
/*		Taking Input from the user, how many process are taking*/	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Process: ");
		int process = sc.nextInt();

/*		Iterating through for loop to store the arrival time and burst time*/	
		for(int i = 0; i < process; i++) {
			System.out.print("Enter the Arrival Time of Process "+(i+1)+": ");
			int arrivalTime = sc.nextInt();
			System.out.print("Enter the Burst TIme of Process "+(i+1)+": ");
			int burstTime = sc.nextInt();
			jobSchedule.add(new ArrayList<Integer>(Arrays.asList(arrivalTime, burstTime)));
		}
		
		
		completionTime = calculateCompletionTime(jobSchedule, process);
		turnAroundTime = calculateTurnAroundTime(jobSchedule, process, completionTime);
		waitingTime = calculateWaitingTime(jobSchedule, process, turnAroundTime);
		
		
		/*		Printing all the results */
		System.out.println("\nArrival_Time | Burst_Time | Completion_Time | Turn_Around_Time | Waiting_Time");
		for(int i = 0; i < 	process; i++) {
			System.out.println(jobSchedule.get(i).get(0)+"\t\t "+jobSchedule.get(i).get(1)
					+"\t\t"+completionTime.get(i)+"\t\t  "+turnAroundTime.get(i)+"\t\t   "+waitingTime.get(i));
		}
		
		
/*		Calculating the average waiting time of all the process */	
		int averageWaitingTime = 0;
		int sum = 0;
		for(int i = 0; i < process; i++) {
			sum += waitingTime.get(i);
		}
		
		averageWaitingTime = sum/process;
		System.out.println("\nAverage Waiting Time: "+averageWaitingTime);
		
/*		Printing the maximum waiting time of a process*/		
		System.out.println("\nMaximum Waiting Time: "+Collections.max(waitingTime));
		
		sc.close();
		
		
	}

}
