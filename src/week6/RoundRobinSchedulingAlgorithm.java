package week6;

public class RoundRobinSchedulingAlgorithm {

	public static void schedular(int[] burstTime,int noOfProcess,int quantum) {
		Queue queue = new Queue();
		for(int i=0; i<noOfProcess; i++) {
			queue.enqueue(burstTime[i]);
		}
		
		while(!queue.isEmpty()) {
			queue.printQueue();
			int curr = queue.dequeue();
			int rem = curr - quantum;
			if(rem > 0) {
				queue.enqueue(rem);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfProcess = 4;
		int[] burstTime = new int[] {15,10,18,5};
		int quantum = 5;
		
		schedular(burstTime,noOfProcess,quantum);
	}

}
