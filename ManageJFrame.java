package sms.pkg22rp01832;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageJFrame extends javax.swing.JFrame {

    
       // List to store marks of students
    ArrayList<Integer> marks = new ArrayList<Integer>(); 


    public ManageJFrame() {
        initComponents(); // Initialize the GUI components
    }
    // Function to determine if a string is a valid integer

    public static boolean isNumber(String num) {

        try {
            // Attempt to parse the string as an integer
            Integer.parseInt(num);
            return true;  // If no exception is thrown, it's a valid
        } catch (NumberFormatException e) {
            return false;// If an exception is caught, it's not a valid integer
        }

    }

 


    
   // Function to check if all marks are in the range of 0 to 100
    
    public static boolean CheckRange(ArrayList<Integer> marks) {
        int i;

        boolean flag = true;

        int value;

        for (i = 0; i < marks.size(); i++) {
            value = marks.get(i);

            // If any mark is not in the range of 0 to 100, set flag to false and break the loop
            if (!((value >= 0 && value <= 100))) {
                flag = false;
                break;
            }

        }

        return flag;
    }
    
        // Function to get the student with the highest average marks
    
    // Initializing GUI components
    
    public static ArrayList<String> getMaxStudent(ArrayList<ArrayList<String>> studentList, int max){
        
        
        ArrayList<String> StudentWithHighAvg = null;
        
        for(ArrayList<String> currentRow : studentList){
            
            if(Integer.parseInt(currentRow.get(2))== max){
                    StudentWithHighAvg = currentRow;
//                StudentWithHighAvg = new Student(currentRow.get(0),currentRow.get(1),currentRow.get(2) );
             
            } 
            

            
        }
        
        return StudentWithHighAvg;
        
    }

    // Initializing GUI components
    // Setting properties for jPanel1,JTextfield,JButton
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        s_name = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        reg_no = new javax.swing.JTextField();
        phps = new javax.swing.JTextField();
        maths = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Reg Number:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("PHP Marks:");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Java Marks:");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Name: ");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Math Marks:");

        s_name.setBackground(new java.awt.Color(255, 255, 255));
        s_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        reg_no.setBackground(new java.awt.Color(255, 255, 255));
        reg_no.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        reg_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_noActionPerformed(evt);
            }
        });

        phps.setBackground(new java.awt.Color(255, 255, 255));
        phps.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        maths.setBackground(new java.awt.Color(255, 255, 255));
        maths.setToolTipText("");
        maths.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        add.setBackground(new java.awt.Color(0, 204, 51));
        add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD STUDENT");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 0, 0));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.setActionCommand("");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Reg Number", "Average Marks"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(reg_no)
                    .addComponent(maths)
                    .addComponent(phps)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s_name, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(23, 23, 23))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(s_name, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_no, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maths, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phps, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
// When add button is pressed, this method is called
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:

    // TODO add your handling code here:

    // Retrieve values from text fields
    String Name = s_name.getText();
    String regno = reg_no.getText();
    String math = maths.getText();
    String java = phps.getText();
    String php = jTextField3.getText();
    
    
        // Validate that the name and registration number fields are not empty

    if (math.isEmpty() || java.isEmpty() || php.isEmpty() || Name.isEmpty() || regno.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please Fill in all inputs");

    } 
    
   
    
    else if (!isNumber(maths.getText()) || !isNumber(phps.getText()) || !isNumber(jTextField3.getText())) {
        JOptionPane.showMessageDialog(null, "Please enter valid numeric values for marks.");
    } else if (!CheckRange(marks)) {
        JOptionPane.showMessageDialog(null, "Marks should be between 0 and 100");
    } 
    
  
    
    else if (!((Pattern.matches("[0-9]{2}RP[0-9]{5}", regno) == true) || (Pattern.matches("[0-9]{2}rp[0-9]{5}", regno) == true)) ) {
    JOptionPane.showMessageDialog(null,"INVALID REGNO");
}
        // Check if the name contains only letters
    
else if(!Pattern.matches("[a-zA-Z]+",Name) == true){
    JOptionPane.showMessageDialog(null,"LETTERS ALLOWED IN NAMES");
}
// checking if the marsk consisting of numerical values only
else if( (!(Pattern.matches("[0-9]+", math) == true)) || (!(Pattern.matches("[0-9]+", php) == true)) || (!(Pattern.matches("[0-9]+", java) == true)) ) {
    JOptionPane.showMessageDialog(null,"NUMBERS ONLY ALLOWED IN MARKS");
}

//checking if the length name of student is btn 2-15 
else if( ! (Name.length()>1 && Name.length()<=15) ){
    JOptionPane.showMessageDialog(null,"NAME MUST BE BETWEEN 2-15 LETTERS");
}
    
    
    else {

        // Parse the marks from strings to integers
        int mathInt = Integer.parseInt(math);
        int phpInt = Integer.parseInt(php);
        int javaInt = Integer.parseInt(java);
        int avg;

        ArrayList<Integer> marks = new ArrayList<Integer>();
        // adding marks values in the marks arrayList

        marks.add(mathInt);
        marks.add(phpInt);
        marks.add(javaInt);
        
        if (!CheckRange(marks)) {
        JOptionPane.showMessageDialog(null, "Marks should be between 0 and 100");
    
    }
        else{
            
            
              
//           System.out.println("size of 1d array now : "+marks.size());
        System.out.println("Raw marks: "+marks.toString());

        avg = Student.getAverageMarks(marks);

        // Create a new student object    
        Student student = new Student(Name, regno, avg);

        // Add the new student to the table
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        Object[] newRow = {student.name, student.regno, student.averageMarks};
        tableModel.addRow(newRow);

        // Add the new student to the allStudents ArrayList
        
        
        
     
        


    ArrayList<String> list;

ArrayList<ArrayList<String>> stList = new ArrayList<>();
ArrayList<Integer> stMarks =  new ArrayList<Integer>();

int i;
for(i=0;i<jTable2.getRowCount();i++){

   list = new  ArrayList<String>(); // to avoid to expand the existing ArrayList so that it can stand as a new ArrayList.
   
   stMarks.add((Integer)jTable2.getValueAt(i, 2));
    
    list.add(jTable2.getValueAt(i, 0).toString());
        list.add(jTable2.getValueAt(i, 1).toString() );
        list.add(jTable2.getValueAt(i, 2).toString() );
        stList.add(list);
}

//System.out.println("Display list 1-d : "+list.toString());
System.out.println("Display list 2-d : "+stList.toString());

         int max = Collections.max(stMarks);
         System.out.println("The max values is : "+max);

         
 ArrayList<String> st = getMaxStudent(stList,max);
 
 
// JOptionPane.showMessageDialog(null,"Student with High avg is : "+st.get(0)+" avg : "+st.get(2));

// get numbers of  rows in the table
int rowsNum = tableModel.getRowCount();
int counterRow;
int HighestIndexRow=0;

int highestAvg = Integer.parseInt(tableModel.getValueAt(0, 2).toString());


for(counterRow=0;counterRow<rowsNum;counterRow++){
    
    int currentAvg = Integer.parseInt(tableModel.getValueAt(counterRow, 2).toString());
    System.out.println("Current Index row!!!: "+counterRow);
    if(currentAvg > highestAvg){
        
       highestAvg = currentAvg;

       HighestIndexRow = counterRow;
       
    }
    
    
}

System.out.println("Current Highest row index : "+HighestIndexRow);
selectHighStudent(HighestIndexRow);


 
      System.out.println("FINAL RAW marks: "+marks.toString());
            
            
        }
      

    }


    }//GEN-LAST:event_addActionPerformed
    // Action performed when the "EXIT" button is clicked
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0); //Exit the application
        
        
    }//GEN-LAST:event_exitActionPerformed

    private void reg_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_noActionPerformed
 // When add button is hovered, set background color to yellow
    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        // TODO add your handling code here:
        
        add.setBackground(Color.yellow);
        add.setForeground(Color.black);
        
        
    }//GEN-LAST:event_addMouseEntered
  // When exit button is hovered, set background color to yellow
    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
     
        
        
        
        
     
    }//GEN-LAST:event_exitMouseEntered

    // When add button hover is removed, set background color to original green
    
    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        // TODO add your handling code here:
        add.setBackground(Color.GREEN);
        add.setForeground(Color.white);
    }//GEN-LAST:event_addMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageJFrame().setVisible(true);
            }
        });
    }
    
    public  void selectHighStudent(int HighrowIndex){
        
       
      jTable2.clearSelection();
      jTable2.setRowSelectionInterval(HighrowIndex, HighrowIndex);
      jTable2.setSelectionBackground(Color.green);

      
        
        
        
        
    }

    // illustration of encapsulation
    public class Student {

        private static String name;
        private static String regno;
        public static int averageMarks;
        // Constructor for the Student class

        public Student(String name, String regno, int averageMarks) {
            this.name = name;
            this.regno = regno;
            this.averageMarks = averageMarks;
        }
        // Getter for the name

        public String getName() {
            return name;
        }
        // Getter for the registration number

        public String getRegNo() {

            return regno;
        }
        // Method to calculate the average marks

        public static int getAverageMarks(ArrayList<Integer> marks) {
            
           averageMarks  = 0;
           
            for (int num : marks) {
                averageMarks += num;
            }

            return averageMarks / marks.size();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField maths;
    private javax.swing.JTextField phps;
    private javax.swing.JTextField reg_no;
    private javax.swing.JTextField s_name;
    // End of variables declaration//GEN-END:variables
}
