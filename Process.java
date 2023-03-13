/**
* Represents a process to be executed.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Project #2
* Spring 2023
*/

public class Process implements Priority, Comparable<Priority>{
	private String processID;
	private int priority;
	
	/**
	 * Default empty-argument constructor.
	 * Default priority is set to lowest value.
	 */
	public Process() {
		processID = "";
		priority = Priority.MIN_PRIORITY;
	}//end default constructor
	
	/**
	 * Preferred constructor with parameter for processID as specified by UML.
	 * Default priority is set to lowest value.
	 * @param processID
	 */
	public Process(String processID) {
		this.processID = processID;
		priority = Priority.MIN_PRIORITY;
	}//end preferred constructor
	
	/**
	 * @return the processID
	 */
	public String getProcessID() {
		return processID;
	}//end getProcessID
	
	/**
	 * @param processID the processID to set
	 */
	public void setProcessID(String processID) {
		this.processID = processID;
	}//end setProcessID
	
	/**
	 * @param priority the priority to be set
	 */
	@Override
	public void setPriority(int priority) {
		if(priority > Priority.MIN_PRIORITY && priority < Priority.MAX_PRIORITY)this.priority = priority;
	}//end setPriority
	
	/**
	 * @return the priority
	 */
	@Override
	public int getPriority() {
		return priority;
	}//end getPriority
	
	/**
	 * Compares the numeric difference between this priority and
	 * the priority of the object passed in through the parameter.
	 * @param p the priority to compare
	 * @return the comparison
	 */
	@Override
	public int compareTo(Priority p) {
		if(priority == p.getPriority())return 0;
		else if(priority > p.getPriority())return 1;
		else return -1;
	}//end compareTo
	
	/**
	 * @return the toString representation
	 */
	public String toString() {
		return ("processID= \"" + processID + "\" priority= " + priority);
	}//end toString

}
