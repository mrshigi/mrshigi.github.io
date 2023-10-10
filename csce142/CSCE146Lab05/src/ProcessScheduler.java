/*
 *Sean Raudat for CSCE 146, Lab05
 */
public class ProcessScheduler 
{
	LinkedListQueue<Process> processes; //queue of processes
	Process currentProcess; 			//current process executing
	public ProcessScheduler()
	{
		processes = new LinkedListQueue<Process>();
		currentProcess = null;
	}
	public Process getCurrentProcess()
	{
		return currentProcess;
	}
	public void addProcess(Process p)
	{
		if(currentProcess == null)
			currentProcess = p;
		else 							//add to queue
			processes.enqueue(p);
	}
	public void runNextProcess()
	{
		currentProcess = processes.deque();
	}
	public void cancelCurrentProcess()
	{
		currentProcess = processes.deque();
	}
	public void printProcessQueue()
	{
		processes.print();
	}
}