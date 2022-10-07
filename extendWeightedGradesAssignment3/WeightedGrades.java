package extendWeightedGradesAssignment3;

public class WeightedGrades {
        private double [] totalPoints;
        private double [] earnedPoints;
        private double [] assignmentPercentage;
		private double totalWeightedGrade;
		 
	    // Get method for totalMarks
		public double[] getTotalPoints() {
			return totalPoints;
		}
		
		// Get method for earnedPoints
		public double[] getEarnedPoints() {
			return earnedPoints;
		}

		// Get method for Assignment percentage
		public double[] getAssignmentPercentage() {
			return assignmentPercentage;
		}

		// Get method for TotalWeightedGrade
		public double getTotalWeightedGrade() {
			return totalWeightedGrade;
		}

		// Set method for Total points
		public void setTotalPoints(double[] totalPoints) {
			this.totalPoints = totalPoints;
		}

		// Set method for EarnedPoints
		public void setEarnedPoints(double[] earnedPoints) {
			this.earnedPoints = earnedPoints;
		}

		// Set method for AssignmentPercentage
		public void setAssignmentPercentage(double[] assignmentPercentage) {
			this.assignmentPercentage = assignmentPercentage;
		}


		// Set method for totalWeightedGrade
		public void setTotalWeightedGrade(double totalWeightedGrade) {
			this.totalWeightedGrade = totalWeightedGrade;
		}
		
		// percentage calculation for the marks
		public void calculatePercentage (){
				double totalWeightedGrade = 0;
				double currentWeightedGrade = 0;
				for (int i  =0; i < totalPoints.length; i ++)
				{
					System.out.println("epoints" + this.earnedPoints[i] + "assingPer" + this.assignmentPercentage[i] +" totalPoints"+ this.totalPoints[i]);
					currentWeightedGrade = (this.earnedPoints[i] * this.assignmentPercentage[i])/this.totalPoints[i];
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