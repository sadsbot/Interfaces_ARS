/**
* Represents a task to be completed.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Project #2
* Spring 2023
*/

public class Task implements Priority, Comparable<Priority>{
	//Enumerable type Status describes the execution status of a computer process.
	private enum Status{
		NOT_STARTED, IN_PROGRESS, COMPLETE;
	}//end Status
	
	private Status taskStatus;
	private String name;
	private int priority;
	
	/*
	 * Default empty-argument constructor.
	 * Default status and priority are set to lowest values.
	 */
	public Task() {
		taskStatus = Status.NOT_STARTED;
		name = "";
		priority = Priority.MIN_PRIORITY;
	}//end default constructor Task
	
	/**
	 * Preferred constructor with parameter for name as specified by UML.
	 * Default status and priority are set to lowest values.
	 * @param name
	 */
	public Task(String name) {
		taskStatus = Status.NOT_STARTED;
		this.name = name;
		priority = Priority.MIN_PRIORITY;
	}//end preferred constructor Task
	
	/**
	 * @return the taskStatus
	 */
	public Status getTaskStatus() {
		return taskStatus;
	}//end getTaskStatus

	/**
	 * @param taskStatus the taskStatus to set
	 */
	public void setTaskStatus(Status taskStatus) {
		this.taskStatus = taskStatus;
	}//end setTaskStatus

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}//end getName

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName

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
		return ("name= \"" + name + "\" priority= " + priority + " taskStatus= " + taskStatus);
	}//end toString
}//end Task.java
