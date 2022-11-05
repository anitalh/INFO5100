package defaultpackage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.io.File;
import java.util.ArrayList;

public class GUI extends JFrame implements ActionListener{
		
		private JLabel readingFile;
		private JLabel fileNameToWrite;
		private JTextField fileName;
		private JTextField writeFileName;
		private JButton clickToRead;
		private JButton clickToWrite;
		private JLabel readFirstFiveLines;
		private JTextArea firstFiveLines;
		private JLabel writeFirstFiveLines;
		private JTextArea newFirstFiveLines;
		private String readStr ="";
		private ArrayList<String> fileContent = new ArrayList<String>();
			
		  public GUI(){
		   JFrame f = new JFrame("Weighted Grade");
		   
		   // set size and location of frame
		   f.setSize(1200, 1200);
		   f.setLocation(100, 150);
		   
		   // quit the window when x is clicked
		   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		   // Label readingFile and set its size and position
		   readingFile = new JLabel("Reading File Name");
		   readingFile.setBounds(50, 50, 250, 30);
		   readingFile.setForeground(Color.BLUE);
		   
		   // Text Field fileName and set its size and position
		   fileName = new JTextField("annual.csv");
		   fileName.setBounds(50, 80, 250, 30);
		   fileName.setForeground(Color.BLACK);
		   fileName.setEditable(true);
		   
		   // Label fileNameToWrite and set its size and position
		   fileNameToWrite = new JLabel("File Name To Write");
		   fileNameToWrite.setBounds(650, 50, 250, 30);
		   fileNameToWrite.setForeground(Color.BLUE);
		   
		   // Text Field writeFileName and set its size and position
		   writeFileName = new JTextField();
		   writeFileName.setBounds(650, 80, 250, 30);
		   writeFileName.setForeground(Color.BLUE);
		   
		   // Button clickToRead and set its size and position
		   clickToRead = new JButton("Click to Read From File");
		   clickToRead.setBounds(70, 130, 200, 30);
		   clickToRead.setForeground(Color.BLUE);
		   clickToRead.setOpaque(true);
		   clickToRead.addActionListener(this);
		   clickToRead.setBackground(Color.red);
		   
		   // Button clickToWrite and set its size and position
		   clickToWrite = new JButton("Click to Write To File");
		   clickToWrite.setBounds(670, 130, 200, 30);
		   clickToWrite.setForeground(Color.BLUE);
		   clickToWrite.setOpaque(true);
		   clickToWrite.addActionListener(this);
		   clickToWrite.setBackground(Color.red);
		   
		   // Label readFirstFiveLines and set its size and position
		   readFirstFiveLines = new JLabel("First Five Lines of The File");
		   readFirstFiveLines.setBounds(50, 180, 250, 30);
		   readFirstFiveLines.setForeground(Color.BLUE);
		   readFirstFiveLines.setVisible(false);
		   
		   // Text Area firstFiveLines and set its size and position
		   firstFiveLines = new JTextArea();
		   firstFiveLines.setBounds(50, 210, 400, 200);
		   firstFiveLines.setForeground(Color.BLUE);
		   firstFiveLines.setLineWrap(true);
		   
		   // Label writeFirstFiveLines and set its size and position
		   writeFirstFiveLines = new JLabel("First Five Lines of The New File");
		   writeFirstFiveLines.setBounds(650, 180, 250, 30);
		   writeFirstFiveLines.setForeground(Color.BLUE);
		   
		   // Text Area newFirstFiveLines and set its size and position
		   newFirstFiveLines = new JTextArea();
		   newFirstFiveLines.setBounds(650, 210, 400, 200);
		   newFirstFiveLines.setForeground(Color.BLUE);
		   newFirstFiveLines.setLineWrap(true);

		   // add elements to the frame
		   f.setLayout(null);
		   f.setVisible(true);
		   f.add(readingFile);
		   f.add(fileName);
		   f.add(fileNameToWrite);
		   f.add(writeFileName);
		   f.add(clickToRead);
		   f.add(clickToWrite);
		   f.add(readFirstFiveLines);
		   f.add(firstFiveLines);
		   f.add(writeFirstFiveLines);
		   f.add(newFirstFiveLines);
		  }
		  
		  Object obj = new Object();
		  
		  
		@Override
		    // On-click action
			public void actionPerformed(ActionEvent e) {		
			if(e.getSource() == clickToRead) {
				// Fetch file input name
				String readFileName = obj.setReadFileName(fileName.getText());
				try {
				      //csv file containing data				  
					  String filePath = new File("").getAbsolutePath();
				      String nextLine;
				      BufferedReader  reader = new BufferedReader(new FileReader(filePath +"/src/defaultpackage/"+readFileName));
				      
				      int lineNumber = 0;
				      while ((nextLine = reader.readLine()) != null) 
				      {
				        lineNumber++;
				        fileContent.add(nextLine +"\r\n");
				        //fileContent += nextLine;
				        if (lineNumber <= 6)
				        {
				        	// Split the column with ","
				        	String[] cols = nextLine.split(",");
				        	int colCount = 0;
				        	String colStr="";
				        	while (colCount <3 && cols.length >= 3)
				        	{		
				        		// remove the delimeter if greater then 2 else add
				        		String delimeter = colCount >= 2 ? "\n" : ","; 
				        		colStr += cols[colCount] + delimeter;
				        		colCount += 1;
				        	}
				        	readStr += colStr;
				        }
				      
				      }
				      reader.close();
				      
				      // Display the output
				      firstFiveLines.setText(readStr);				      
				      } 
				    catch (Exception ioExc)
					{
				    	ioExc.getMessage();
				
					} 
				
			}
			
			if(e.getSource() == clickToWrite) {
				// Fetch file input name
				String fileName = obj.setFileName(writeFileName.getText());
				try {
					File outStream = new File(fileName);
					BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
					
					// Create new file
					if (outStream.createNewFile()) {
						outStream.getName();
				
					}
					
					// write the data 
					for ( String content: fileContent)
					{
						writer.write(content);
					}
					
					// Display the output
					newFirstFiveLines.setText(readStr);
					writer.close();
					}
					catch (IOException ioEx) {
						ioEx.printStackTrace();
					}
				}
			}

	}
	

