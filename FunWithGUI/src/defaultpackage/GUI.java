package defaultpackage;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class GUI extends JFrame implements ActionListener{
	
	private JLabel totalAssignmentPoints;
	private JLabel earnedPoints;
	private JLabel percentagePoints;
	private JButton calculate;
	private JLabel weightedGrade;
	private JTextField totalweightedGrade;
	private JTextField totalEarnedPoints;
	private JTextField totalPercentage; 
	private JTextField totalPoints;
		
	  public GUI(){
	   JFrame f = new JFrame("Weighted Grade");
	   
	   // set size and location of frame
	   f.setSize(650, 500);
	   f.setLocation(100, 150);
	   
	   // quit the window when x is clicked
	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	   // Label totalAssignmentPoints and set its size and position
	   totalAssignmentPoints = new JLabel("Total Assignment Points");
	   totalAssignmentPoints.setBounds(50, 50, 200, 30);
	   totalAssignmentPoints.setForeground(Color.BLUE);
	   
	   // Text Field totalPoints and set its size and position
	   totalPoints = new JTextField();
	   totalPoints.setBounds(50, 100, 200, 30);
	   totalPoints.setForeground(Color.BLUE);
	   
	   // Label earnedPoints and set its size and position
	   earnedPoints = new JLabel("Earned Points");
	   earnedPoints.setBounds(340, 50, 200, 30);
	   earnedPoints.setForeground(Color.BLUE);
	   
	   // Text Field totalEarnedPoints and set its size and position
	   totalEarnedPoints = new JTextField();
	   totalEarnedPoints.setBounds(340, 100, 200, 30);
	   totalEarnedPoints.setForeground(Color.BLUE);
	   
	   // Label percentagePoints and set its size and position
	   percentagePoints = new JLabel("Percentage Of Class");
	   percentagePoints.setBounds(50, 130,  200, 80);
	   percentagePoints.setForeground(Color.BLUE);
	   
	   // Text Field totalPercentage and set its size and position
	   totalPercentage = new JTextField();
	   totalPercentage.setBounds(50, 200, 200, 30);
	   totalPercentage.setForeground(Color.BLUE);
	   
	   // Button calculate and set its size and position
	   calculate = new JButton("Click to Calculate score");
	   calculate.setBounds(200, 300, 200, 30);
	   calculate.setForeground(Color.BLUE);
	   calculate.setBackground(Color.RED);
	   calculate.setOpaque(true);
	   
	   // Call to Action Listener
	   calculate.addActionListener(this);
	   
	   // Label weightedGrade and set its size and position
	   weightedGrade = new JLabel("Weighted Score");
	   weightedGrade.setBounds(250, 330, 200, 30);
	   weightedGrade.setForeground(Color.BLUE);
	   weightedGrade.setVisible(false);
	   
	   // Text Field totalweightedGrade and set its size and position
	   totalweightedGrade = new JTextField();
	   totalweightedGrade.setBounds(200, 360, 200, 30);
	   totalweightedGrade.setForeground(Color.BLUE);
	   totalweightedGrade.setVisible(false);

	   // add elements to the frame
	   f.setLayout(null);
	   f.setVisible(true);
	   f.add(totalAssignmentPoints);
	   f.add(totalPoints);
	   f.add(earnedPoints);
	   f.add(totalEarnedPoints);
	   f.add(percentagePoints);
	   f.add(totalPercentage);
	   f.add(calculate);
	   f.add(weightedGrade);
	   f.add(totalweightedGrade);
	  }
	  
	  WeightedGrade w = new WeightedGrade();
	  
	@Override
	    // On-click action
		public void actionPerformed(ActionEvent e) {
	    	weightedGrade.setVisible(true);
	    	totalweightedGrade.setVisible(true);
	    	w.setTotalMarks(Integer.parseInt(totalPoints.getText()));
	    	w.setEarnedPoints(Integer.parseInt(totalEarnedPoints.getText()));
	    	w.setAssignmentPercentage(Integer.parseInt(totalPercentage.getText()));
	    	totalweightedGrade.setText((w.calculatePercentage()));
		}
}
