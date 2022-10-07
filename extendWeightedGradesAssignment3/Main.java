package extendWeightedGradesAssignment3;

import java.util.Scanner;

public class Main {
	
    private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		WeightedGrades grades = gradeDetails();
		grades.calculatePercentage();
		System.out.println("Total Weighted Grade is :: " + grades.getTotalWeightedGrade());	
		System.out.print("Letter Grade is :: ");
		grades.printGrades(grades.getTotalWeightedGrade());	
		
	}
	
	// Gets the details of a points from user
	public static WeightedGrades gradeDetails() {
	    WeightedGrades w = new WeightedGrades();
	    double[] totalMarksArray = new double[8];
	    
        // take User input for totalMarks 
        System.out.println("Enter total Points :: ");
	    for (int i = 0; i < totalMarksArray.length; i++)
	    {
	    	totalMarksArray[i] = scanner.nextDouble();
	    }
	    w.setTotalPoints(totalMarksArray);
	    
	    double[] totalassignmentPercentageArray = new double[8];
	    
	    // Take user input for assignment points
        System.out.println("Enter your assignment points :: ");
	    for (int i = 0; i < totalassignmentPercentageArray.length; i++)
	    {
	        totalassignmentPercentageArray[i] = scanner.nextDouble();
	    }
	    w.setAssignmentPercentage(totalassignmentPercentageArray);
	    
	    double[] totalEarnedPointArray = new double[8];
	    
	    // Take user input for earned Points
        System.out.println("Enter earned points :: ");
	    for (int i = 0; i < totalEarnedPointArray.length; i++)
	    {
	        totalEarnedPointArray[i] = scanner.nextDouble();   
	    }
	    w.setEarnedPoints(totalEarnedPointArray);
	    
	  return w;
	}
}

