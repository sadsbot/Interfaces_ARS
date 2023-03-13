/**
* This Application class test cases for all methods and constructors
* of Task, Process, and Priority as well as testers for the compareTo
* method of RationalNumber.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Project #2
* Spring 2023
*/

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Rational Number Testing Section
		RationalNumber n1 = new RationalNumber(2, 3);
		RationalNumber n2 = new RationalNumber(2, 3);
		RationalNumber n3 = new RationalNumber(3, 4);
		RationalNumber n4 = new RationalNumber(9, 1000000);
		RationalNumber n5 = new RationalNumber(1, 1000000);
		
		StringBuilder sb = new StringBuilder("###=================================================###");
		sb.append("\nDeclaration:");
		sb.append("\nn1 = " + n1.toString() + " or " + (double)n1.getNumerator()/n1.getDenominator());
		sb.append("\nn2 = " + n2.toString() + " or " + (double)n2.getNumerator()/n2.getDenominator());
		sb.append("\nn3 = " + n3.toString() + " or " + (double)n3.getNumerator()/n3.getDenominator());
		sb.append("\nn4 = " + n4.toString() + " or " + (double)n4.getNumerator()/n4.getDenominator());
		sb.append("\nn5 = " + n5.toString() + " or " + (double)n5.getNumerator()/n5.getDenominator());
		sb.append("\n\nCompare Section:");
		sb.append("\nn1.compareTo(n2) = " + n1.compareTo(n2));
		sb.append("\nn1.compareTo(n4) = " + n1.compareTo(n4));
		sb.append("\nn3.compareTo(n2) = " + n3.compareTo(n2));
		sb.append("\nn2.compareTo(n3) = " + n2.compareTo(n3));
		sb.append("\nn4.compareTo(n5) = " + n4.compareTo(n5));
		sb.append("\n###=================================================###");
		//System.out.print(sb.toString());
		
		//Priority Testing Section
		Task t1 = new Task();
		Task t2 = new Task("Run");
		Process p1 = new Process();
		Process p2 = new Process("Watch");
		
		sb.delete(0, sb.length());//Empty sb
		sb.append("###=================================================###");
		sb.append("\nDeclaration:");
		sb.append("\nTask t1 = new Task();\nTask t2 = new Task(\"Run\");");
		sb.append("\nProcess p1 = new Process();\nProcess p2 = new Process(\"Watch\");");
		sb.append("\n\nSetting:");
		sb.append("\nt1.setName(\"Walk\")\nt1.setPriority(5)");
		t1.setName("Walk");
		t1.setPriority(5);
		sb.append("\nt2 is declared with Task(\"Run\")\nt2.setPriority(2)");
		t2.setPriority(2);
		sb.append("\np1.setProcessID(\"Sleep\")\np1.setPriority(8)");
		p1.setProcessID("Sleep"); p1.setPriority(8);
		sb.append("\np2 is declared with Process(\"Watch\")\np2.setPriority(5)");
		p2.setPriority(5);
		sb.append("\n\nGetting:");
		sb.append("\nt1.getName() returns: " + t1.getName() + "\nt1.getPriority() returns: " + t1.getPriority());
		sb.append("\nt2.toString() returns: " + t2.toString());
		sb.append("\np1.getProcessID() returns: " + p1.getProcessID() + "\np1.getPriority() returns: " + p1.getPriority());
		sb.append("\np2.toString() returns: " + p2.toString());
		sb.append("\n\nComparing:");
		sb.append("\nt1.compareTo(t2) returns: " + t1.compareTo(t2));
		sb.append("\nt2.compareTo(t1) returns: " + t2.compareTo(t1));
		sb.append("\nt1.compareTo(p2) returns: " + t1.compareTo(p2));
		sb.append("\nt2.compareTo(p1) returns: " + t2.compareTo(p1));
		sb.append("\np1.compareTo(p2) returns: " + p1.compareTo(p2));
		sb.append("\np2.compareTo(p1) returns: " + p2.compareTo(p1));
		sb.append("\np1.compareTo(t1) returns: " + p1.compareTo(t1));
		sb.append("\np2.compareTo(t1) returns: " + p2.compareTo(t1));
		sb.append("\n###=================================================###");
		System.out.print(sb.toString());
	}//end main
}//end Application.java
