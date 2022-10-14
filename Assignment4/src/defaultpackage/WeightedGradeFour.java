package defaultpackage;

import java.util.LinkedList;

public class WeightedGradeFour{
        private LinkedList<Double> totalPoints;
        private LinkedList<Double> earnedPoints;
        private LinkedList<Double> assignmentPercentage;
		private double totalWeightedGrade;
		 
	    // Get method for totalMarks
		public LinkedList<Double> getTotalPoints() {
			return totalPoints;
		}
		
		// Get method for earnedPoints
		public LinkedList<Double> getEarnedPoints() {
			return earnedPoints;
		}

		// Get method for Assignment percentage
		public LinkedList<Double> getAssignmentPercentage() {
			return assignmentPercentage;
		}

		// Get method for TotalWeightedGrade
		public double getTotalWeightedGrade() {
			return totalWeightedGrade;
		}

		// Set method for Total points
		public void setTotalPoints(LinkedList<Double> totalPointsList) {
			this.totalPoints = totalPointsList;
		}

		// Set method for EarnedPoints
		public void setEarnedPoints(LinkedList<Double> earnedPointsList) {
			this.earnedPoints = earnedPointsList;
		}

		// Set method for AssignmentPercentage
		public void setAssignmentPercentage(LinkedList<Double> assignemntPercentageList) {
			this.assignmentPercentage = assignemntPercentageList;
		}


		// Set method for totalWeightedGrade
		public void setTotalWeightedGrade(double totalWeightedGrade) {
			this.totalWeightedGrade = totalWeightedGrade;
		}
		
		// percentage calculation for the marks
		public void calculatePercentage (){
			double totalWeightedGrade = 0;
		 	double currentWeightedGrade = 0;
			for (int i=0; i < totalPoints.size(); i++)
			{
				currentWeightedGrade = (earnedPoints.get(i) * assignmentPercentage.get(i))/(totalPoints.get(i));
				totalWeightedGrade += currentWeightedGrade;
			}		
			this.setTotalWeightedGrade(totalWeightedGrade);				
			}
		
		// Print the Letter grades for TotalWeightedGrade
		public void printGrades (double totalWeightedGrade){			
			if (totalWeightedGrade >= 90.0 &&  totalWeightedGrade <= 100.0)
			{
				System.out.println("A");
			}
			else if (totalWeightedGrade >= 80.0 &&  totalWeightedGrade <= 89.99999)
			{
				System.out.println("B");
			}
			else if (totalWeightedGrade >= 70.0 &&  totalWeightedGrade < 80.0)
			{
				System.out.println("C");
			}
			else if (totalWeightedGrade >= 60.0 &&  totalWeightedGrade < 70.0)
			{
				System.out.println("D");
			}
			else if ( totalWeightedGrade < 60.0)
			{
				System.out.println("F");
			}		
			
		}
		
}