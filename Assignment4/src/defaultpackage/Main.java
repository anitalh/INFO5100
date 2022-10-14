package defaultpackage;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	  private static Scanner scanner = new Scanner(System.in);
        
	    // Main Method
		public static void main(String[] args) {
			WeightedGradeFour grades = gradeDetails();
			grades.calculatePercentage();
			System.out.println("Total Weighted Grade is :: " + grades.getTotalWeightedGrade());	
			System.out.print("Letter Grade is :: ");
			grades.printGrades(grades.getTotalWeightedGrade());	
			
		}
		
		// Instance of weightedGrdaeFour page and take user Input
		public static WeightedGradeFour gradeDetails() {
			WeightedGradeFour w = new WeightedGradeFour();
			
			LinkedList<Double> totalPointsList = new LinkedList<>();
			LinkedList<Double> earnedPointsList = new LinkedList<>();
			LinkedList<Double> assignemntPercentageList = new LinkedList<>();
			
			// Take the size of input element from the user
			System.out.print("Input the number of size :: ");
	        int size = scanner.nextInt();
		    
	        // Take user input for totalPoints 
	        System.out.println("Enter total Points :: ");
		    for (int i = 0; i < size; i++)
		    {
		    	
		    	totalPointsList.add(scanner.nextDouble());
		    }
		    w.setTotalPoints(totalPointsList);
		    		    
		    // Take user input for assignment points
	        System.out.println("Enter your assignment points :: ");
		    for (int i = 0; i < size; i++)
		    {
		    	assignemntPercentageList.add(scanner.nextDouble());
		    }
		    w.setAssignmentPercentage(assignemntPercentageList);
		   		 		    
		    // Take user input for earned Points
	        System.out.println("Enter earned points :: ");
		    for (int i = 0; i < size; i++)
		    {
		    	earnedPointsList.add(scanner.nextDouble());   
		    }
		    w.setEarnedPoints(earnedPointsList);
		    
		  return w;
		}
	}

