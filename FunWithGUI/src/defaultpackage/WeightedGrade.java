package defaultpackage;

public class WeightedGrade {

			private int totalMarks;
			private int earnedPoints;
			private int assignmentPercentage;
			private String totalWeightedGrade;
			 
		    // Get method for totalMarks
			public int getTotalMarks() {
				return totalMarks;
			}

			// Set method for totalMarks
			public void setTotalMarks(int totalMarks) {
				this.totalMarks = totalMarks;
			}

			// Get method for earnedPoints
			public int getEarnedPoints() {
				return earnedPoints;
			}

			// Set method for earnedPoints
			public void setEarnedPoints(int earnedPoints) {
				this.earnedPoints = earnedPoints;
			}

			// Get method for assignmentPercentage
			public int getAssignmentPercentage() {
				return assignmentPercentage;
			}

			// Set method for assignmentPercentage
			public void setAssignmentPercentage(int assignmentPercentage) {
				this.assignmentPercentage = assignmentPercentage;
			}
			
			// percentage calculation for the marks
			public String calculatePercentage (){
				return totalWeightedGrade = String.valueOf((earnedPoints * assignmentPercentage)/totalMarks);
			}
		}


