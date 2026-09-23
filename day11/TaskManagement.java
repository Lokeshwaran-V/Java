package day11;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TaskManagement {

	public static void main(String[] args) {
		// Normal task
		ArrayList <String> normalTask = new ArrayList<>();
		normalTask.addAll(List.of("Prepare Monthly Report", "Update Employee Database", "Complete Documentation"));

		System.out.println("Enter user defined task");
		Scanner scn = new Scanner(System.in);
		String userTask = scn.nextLine();
		
		normalTask.add(userTask);
				
		// Urgent task
		LinkedList <String> urgentTask = new LinkedList<>();
		urgentTask.addAll(List.of("Server Down", "Production Bug", "Payment Failure"));
		
		System.out.println("A new critical issue has arrived: ");
		urgentTask.addFirst("Security Alert");
		System.out.println(urgentTask.getFirst() + " task added");
		
		// Legacy tasks
		Vector <String> legacyTask = new Vector<>();
		legacyTask.addAll(List.of("Old Application Support", "Legacy Database Check", "Mainframe Monitoring"));
		
		legacyTask.addElement("Refactore old repo");
		
		System.out.println("legacyTask first element : " + legacyTask.firstElement());
		
		int legacySize = legacyTask.size();
		legacyTask.removeElementAt(legacySize-1);
		
		System.out.println("\n====================================");
		System.out.println("       CORPORATE TASK REPORT        ");
	    System.out.println("====================================");
		
	    System.out.println("\nNORMAL TASK");
		for(String i : normalTask) {
			System.out.println(i);
		}
		
		System.out.println("\nURGENT TASK");
		for(String i : urgentTask) {
			System.out.println(i);
		}
		
		System.out.println("\nLEGACY TASK");
		for(String i : legacyTask) {
			System.out.println(i);
		}
		
		System.out.println("\n====================================");
		System.out.println("Total Normal Tasks  : " + normalTask.size());
		System.out.println("Total Urgent Tasks  : " + urgentTask.size());
		System.out.println("Total Legacy Tasks  : " + legacyTask.size());

	}

}
