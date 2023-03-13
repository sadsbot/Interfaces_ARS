/**
* The Priority interface provides final ints as boundaries
* for the priority range and requires two methods for getting
* and setting an int priority.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Project #2
* Spring 2023
*/

public interface Priority {
	public final int MED_PRIORITY = 5;
	public final int MIN_PRIORITY = 1;
	public final int MAX_PRIORITY = 10;
	
	public void setPriority(int priority);
	public int getPriority();
}//end Priority.java
