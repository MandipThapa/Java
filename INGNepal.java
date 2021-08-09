import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class INGNepal implements ActionListener
{
    JFrame frame;
    JLabel label1;
    // For full time staff hire
    JPanel panel1;
    //label, TextField, button name for full time staff hire
    JLabel title,vacancyNumber,designation,jobType,salary,workingHour,staffName,joiningDate,qualification,appointedBy;
    JTextField tvacancyNumber,tdesignation,tjobType,tsalary,tworkingHour,tvacancyNumberA,tvacancyNumberB;
    JTextField tstaffName,tjoiningDate,tqualification,tappointedBy;
    JButton add,appoint,display,clear;
    
    // For part time staff hire
    
    JPanel panel2;
    //label, TextField, button name for part time staff hire
    JLabel title1,vacancyNumber2,designation2,jobType2,shifts,wagesPerHour,workingHour2,staffName2,joiningDate2,qualification2,appointedBy2;
    JTextField tvacancyNumber2,tdesignation2,tjobType2,tshifts,twagesPerHour,tworkingHour2,tvacancyNumberC,tvacancyNumberD,tvacancyNumberE;
    JTextField tstaffName2,tjoiningDate2,tqualification2,tappointedBy2;
    JButton add2,appoint2,display2,clear2,terminate;
    
    //arraylist is created here
    ArrayList<StaffHire> staffList = new ArrayList<StaffHire>();
    
    public void staffHireForm()
    {
        frame = new JFrame("INGNepal");
        Container container=frame.getContentPane();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1900,800);
        
        //For full time staff hire
        
        //creating panel for full time staff hire
        panel1 = new JPanel(); 
        container.add(panel1);
        panel1.setLayout(null);
        panel1.setBounds(10,10,675,680);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBackground(Color.LIGHT_GRAY);
        
        //Creating title for panel1
        title = new JLabel("Full Time Staff Hire");
        title.setBounds(240,30,250,30);
        title.setFont(new Font("Arial", Font.BOLD,25));
        panel1.add(title);
        
        //label, text field, bounds for vacancy of full time staff hire
        vacancyNumber = new JLabel("VacancyNumber:");
        panel1.add(vacancyNumber);
        vacancyNumber.setBounds(30,80,100,30);
        
        tvacancyNumber = new JTextField();
        panel1.add(tvacancyNumber);
        tvacancyNumber.setBounds(150,85,150,20);
        
        designation = new JLabel("Designation:");
        panel1.add(designation);
        designation.setBounds(30,120,100,30);
        
        tdesignation = new JTextField();
        panel1.add(tdesignation);
        tdesignation.setBounds(150,125,150,20);
        
        jobType = new JLabel("Job Type:");
        panel1.add(jobType);
        jobType.setBounds(30,160,100,30);
        
        tjobType = new JTextField();
        panel1.add(tjobType);
        tjobType.setBounds(150,165,150,20);
        
        
        salary = new JLabel("Salary:");
        panel1.add(salary);
        salary.setBounds(380,120,100,30);
                                   
        tsalary = new JTextField();
        panel1.add(tsalary);
        tsalary.setBounds(500,125,150,20);
                                       
        
        workingHour = new JLabel("Working Hour:");
        panel1.add(workingHour);
        workingHour.setBounds(380,80,100,30);
        
        tworkingHour = new JTextField();
        panel1.add(tworkingHour);
        tworkingHour.setBounds(500,85,150,20);
        
        //label, text field, bounds for appoint of full time staff hire
        
        staffName = new JLabel("Staff Name:");
        panel1.add(staffName);
        staffName.setBounds(30,290,100,30);
        
        tstaffName = new JTextField();
        panel1.add(tstaffName);
        tstaffName.setBounds(150,295,150,20);
        
        joiningDate = new JLabel("Joining Date:");
        panel1.add(joiningDate);
        joiningDate.setBounds(380,290,100,30);
        
        tjoiningDate = new JTextField();
        panel1.add(tjoiningDate);
        tjoiningDate.setBounds(500,295,150,20);
        
        qualification = new JLabel("Qualification:");
        panel1.add(qualification);
        qualification.setBounds(30,335,100,30);
        
        tqualification = new JTextField();
        panel1.add(tqualification);
        tqualification.setBounds(150,335,150,20);
        
        appointedBy = new JLabel("Appointed By:");
        panel1.add(appointedBy);
        appointedBy.setBounds(30,375,100,30);
        
        tappointedBy= new JTextField();
        panel1.add(tappointedBy);
        tappointedBy.setBounds(150,375,150,20);
        
        vacancyNumber = new JLabel("VacancyNumber:");
        panel1.add(vacancyNumber);
        vacancyNumber.setBounds(380,335,100,30);
        
        tvacancyNumberA = new JTextField();
        panel1.add(tvacancyNumberA);
        tvacancyNumberA.setBounds(500,340,150,20);
        
        //label, text field, bounds for display of information of full time staff
        
        label1 = new JLabel("Information Display");
        label1.setBounds(70,530,200,30);
        panel1.add(label1);
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        
        vacancyNumber = new JLabel("VacancyNumber:");
        panel1.add(vacancyNumber);
        vacancyNumber.setBounds(30,565,100,30);
        
        tvacancyNumberB = new JTextField();
        panel1.add(tvacancyNumberB);
        tvacancyNumberB.setBounds(150,575,150,20);
        
        //buttons for vacancy of full time staff hire
        
        add = new JButton("Add Vacancy For Full Time");
        panel1.add(add);
        add.setBounds(30,210,260,50);
        add.setFont(new Font("Arial", Font.BOLD, 16));
        add.addActionListener(this);
          
        appoint = new JButton("Appoint Full Time Staff");
        panel1.add(appoint);
        appoint.setBounds(30,420,260,50);
        appoint.setFont(new Font("Arial", Font.BOLD, 16));
        appoint.addActionListener(this);
        
        display = new JButton("Display");
        panel1.add(display);
        display.setBounds(40,620,260,50);
        display.setFont(new Font("Arial", Font.BOLD, 16));
        display.addActionListener(this);
        
        clear = new JButton("Clear");
        panel1.add(clear);
        clear.setBounds(400,620,260,50);
        clear.setFont(new Font("Arial", Font.BOLD, 16));
        clear.addActionListener(this);
        
        


        // For Part time staff hire




        //creating panel for part time staff hire
        panel2 = new JPanel();
        container.add(panel2);
        panel2.setLayout(null);
        panel2.setBounds(680,10,680,680);
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.setBackground(Color.GRAY);
        
        //creating title for panel1
        title1 = new JLabel("Part Time Staff Hire");
        title1.setBounds(240,30,250,30);
        title1.setFont(new Font("Arial", Font.BOLD,25));
        panel2.add(title1);
        
        //label, text field, bounds for vacancy of part time staff hire
        vacancyNumber2 = new JLabel("VacancyNumber:");
        panel2.add(vacancyNumber2);
        vacancyNumber2.setBounds(30,80,100,30);
        
        tvacancyNumber2 = new JTextField();
        panel2.add(tvacancyNumber2);
        tvacancyNumber2.setBounds(150,85,150,20);
        
        designation2 = new JLabel("Designation:");
        panel2.add(designation2);
        designation2.setBounds(30,120,100,30);
        
        tdesignation2 = new JTextField();
        panel2.add(tdesignation2);
        tdesignation2.setBounds(150,125,150,20);
        
        jobType2 = new JLabel("Job Type:");
        panel2.add(jobType2);
        jobType2.setBounds(30,160,100,30);
        
        tjobType2 = new JTextField();
        panel2.add(tjobType2);
        tjobType2.setBounds(150,165,150,20);
        
        shifts = new JLabel("Shift:");
        panel2.add(shifts);
        shifts.setBounds(380,120,100,30);
                                   
        tshifts = new JTextField();
        panel2.add(tshifts);
        tshifts.setBounds(500,125,150,20);
        
        wagesPerHour = new JLabel("Wages Per Hour:");
        panel2.add(wagesPerHour);
        wagesPerHour.setBounds(380,160,100,30);
                                   
        twagesPerHour = new JTextField();
        panel2.add(twagesPerHour);
        twagesPerHour.setBounds(500,165,150,20);
 
        workingHour2 = new JLabel("Working Hour:");
        panel2.add(workingHour2);
        workingHour2.setBounds(380,80,100,30);
        
        tworkingHour2 = new JTextField();
        panel2.add(tworkingHour2);
        tworkingHour2.setBounds(500,85,150,20);
        
        //label, text field, bounds for appoint of part time staff hire
        
        staffName2 = new JLabel("Staff Name:");
        panel2.add(staffName2);
        staffName2.setBounds(30,290,100,30);
        
        tstaffName2 = new JTextField();
        panel2.add(tstaffName2);
        tstaffName2.setBounds(150,295,150,20);
        
        joiningDate2 = new JLabel("Joining Date:");
        panel2.add(joiningDate2);
        joiningDate2.setBounds(30,380,100,30);
        
        tjoiningDate2 = new JTextField();
        panel2.add(tjoiningDate2);
        tjoiningDate2.setBounds(150,385,150,20);
        
        qualification2 = new JLabel("Qualification:");
        panel2.add(qualification2);
        qualification2.setBounds(380,335,100,30);
        
        tqualification2 = new JTextField();
        panel2.add(tqualification2);
        tqualification2.setBounds(500,340,150,20);
        
        appointedBy2 = new JLabel("Appointed By:");
        panel2.add(appointedBy2);
        appointedBy2.setBounds(380,290,100,30);
        
        tappointedBy2= new JTextField();
        panel2.add(tappointedBy2);
        tappointedBy2.setBounds(500,295,150,20);
        
        vacancyNumber2 = new JLabel("VacancyNumber:");
        panel2.add(vacancyNumber2);
        vacancyNumber2.setBounds(30,335,100,30);
        
        tvacancyNumberC = new JTextField();
        panel2.add(tvacancyNumberC);
        tvacancyNumberC.setBounds(150,340,150,20);
        
        //label, text field, bounds for display of information of part time staff
        
        label1 = new JLabel("Information Display");
        panel2.add(label1);
        label1.setBounds(70,530,200,30);
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        
        vacancyNumber2 = new JLabel("VacancyNumber:");
        panel2.add(vacancyNumber2);
        vacancyNumber2.setBounds(30,570,100,30);
        
        tvacancyNumberE = new JTextField();
        panel2.add(tvacancyNumberE);
        tvacancyNumberE.setBounds(150,575,150,20);
        
        //label, text field, bounds for termination of part time staff
        
        label1 = new JLabel("Termination of Staff");
        panel2.add(label1);
        label1.setBounds(385,415,260,50);
        label1.setFont(new Font("Arial", Font.BOLD, 22));
        
        vacancyNumber2 = new JLabel("VacancyNumber:");
        panel2.add(vacancyNumber2);
        vacancyNumber2.setBounds(380,465,260,50);
        
        tvacancyNumberD = new JTextField();
        panel2.add(tvacancyNumberD);
        tvacancyNumberD.setBounds(500,475,150,20);
       
        //buttons for vacancy of part time staff hire
        
        add2 = new JButton("Add Vacancy For Part Time");
        panel2.add(add2);
        add2.setBounds(30,210,260,50);
        add2.setFont(new Font("Arial", Font.BOLD, 16));
        add2.addActionListener(this);
          
        appoint2 = new JButton("Appoint Part Time Staff");
        panel2.add(appoint2);
        appoint2.setBounds(30,425,260,50);
        appoint2.setFont(new Font("Arial", Font.BOLD, 16));
        appoint2.addActionListener(this);
        
        clear2 = new JButton("Clear");
        panel2.add(clear2);
        clear2.setBounds(385,620,260,50);
        clear2.setFont(new Font("Arial", Font.BOLD, 16));
        clear2.addActionListener(this);
        
        display2= new JButton("Display");
        panel2.add(display2);
        display2.setBounds(40,620,260,50);
        display2.setFont(new Font("Arial", Font.BOLD, 16));
        display2.addActionListener(this);
                
        terminate= new JButton("Terminate");
        panel2.add(terminate);
        terminate.setBounds(385,515,260,50);
        terminate.setFont(new Font("Arial", Font.BOLD, 15));
        terminate.addActionListener(this);
        
    }
    
    
    public void actionPerformed(ActionEvent p)  // method to handle multiple action events
    {        
     if(p.getSource()==add)  //action event for adding full time staff
        {
            try{  //checking for Exception Handling
            
                if (tvacancyNumber.getText().isEmpty() || tdesignation.getText().isEmpty() || tjobType.getText().isEmpty() || tsalary.getText().isEmpty() || tworkingHour.getText().isEmpty())
                {
                   throw new Exception("TextField Cannot be Empty!");
               
                } //checking empty text field
                
                if(Integer.parseInt(tsalary.getText())<= 0)
                {
                    throw new Exception("Salary cannot be negative or null.");
                } //checking salary
                
                if(Integer.parseInt(tsalary.getText())> 200000)
                {
                    throw new Exception("we dont provide salary more than 2 lakhs.");
                } //checking maximum salary
                
                if(Integer.parseInt(tworkingHour.getText())>10)
                {
                    throw new Exception("we don't accept working hour more than 10.");
                
                } //checking maximum working hour
                
                if(Integer.parseInt(tworkingHour.getText())<= 0)
                {
                    throw new Exception("working hour cannot be null or negative");
                } //checking working hour
                
                
                int vacancyNumber = Integer.parseInt(tvacancyNumber.getText());
                String designation = tdesignation.getText();
                String jobType = tjobType.getText();
                int salary = Integer.parseInt(tsalary.getText());
                int workingHour =Integer.parseInt(tworkingHour.getText());
                
                for(StaffHire staff:staffList) //iterating objects of arraylist staffList
                {
                      if(staff instanceof FullTimeStaffHire) // object casting to child from parent
                      {                               
                          FullTimeStaffHire fullTime=(FullTimeStaffHire)staff; 
                          
                          if (fullTime.getvacancyNumber()==vacancyNumber )
                          {
                              throw new Exception("Error: Vacancy Number "+ vacancyNumber + " is already on the list.");
                            } // checking  duplicate vacancy number
                        }
                    }
                
                
                
                FullTimeStaffHire fullTimeStaff= new FullTimeStaffHire(vacancyNumber,designation,jobType,salary,workingHour);
                staffList.add(fullTimeStaff);
                JOptionPane.showMessageDialog(frame,"Vacancy has been added Successfully.");
            } 
            
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(frame,"Invalid Input! Please fill up correctly"); 
            
            } //catching excetion
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(frame,e.getMessage());
            
            }  //displaying the error message
            
        }
         
       if(p.getSource()==add2)
        {
            try
            {
            
                if (tvacancyNumber2.getText().isEmpty() || tdesignation2.getText().isEmpty() || tjobType2.getText().isEmpty() || tworkingHour2.getText().isEmpty() || twagesPerHour.getText().isEmpty() || tshifts.getText().isEmpty())
                {
                   throw new Exception("TextField Cannot be Empty!");
                
                }
                
                if(Integer.parseInt(twagesPerHour.getText())<= 0)
                {
                    throw new Exception("Salary cannot be negative or null.");
                }
                
                if(Integer.parseInt(twagesPerHour.getText())> 5000)
                {
                    throw new Exception("we dont provide wages per hour more than 5 thousands.");
                }
                
                if(Integer.parseInt(tworkingHour2.getText())>6)
                {
                    throw new Exception("we don't accept working hour more than 6.");
                
                }
                
                if(Integer.parseInt(tworkingHour2.getText())<= 0)
                {
                    throw new Exception("working hour cannot be null or negative.");
                }
                
                
                
                int vacancyNumber = Integer.parseInt(tvacancyNumber2.getText());
                String designation = tdesignation2.getText();
                String jobType = tjobType2.getText();
                String shifts = tshifts.getText();
                int wagesPerHour = Integer.parseInt(twagesPerHour.getText());
                int workingHour =Integer.parseInt(tworkingHour2.getText());
                
                for(StaffHire staff:staffList)
                {
                      if(staff instanceof PartTimeStaffHire) // object casting to child from parent
                      {
                          PartTimeStaffHire partTime=(PartTimeStaffHire)staff;
                        
                          if (partTime.getvacancyNumber()==vacancyNumber )
                          {
                              throw new Exception("Error: Vacancy Number "+ vacancyNumber + " is already on the lsit.");
                            }
                        }
                    }
                
                PartTimeStaffHire partTimeStaff= new PartTimeStaffHire(vacancyNumber,designation,jobType,workingHour,wagesPerHour,shifts);
                staffList.add(partTimeStaff);
                JOptionPane.showMessageDialog(frame,"Vacancy has been added Successfully.");
                
            } 
            
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(frame,"Invalid Input! Please fill up correctly");
            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(frame,e.getMessage());
            
            }
            
        }
        
       if(p.getSource()==appoint)
        {
           try
           {
                 if(tvacancyNumberA.getText().isEmpty() || tstaffName.getText().isEmpty() || tjoiningDate.getText().isEmpty() || tqualification.getText().isEmpty() || tappointedBy.getText().isEmpty())
                    {
                     throw new Exception("Text Field cannot be empty!");
                    
                    }
            
                 int vacancyNumber = Integer.parseInt(tvacancyNumberA.getText());
                 String staffName = tstaffName.getText();
                 String joiningDate = tjoiningDate.getText();
                 String qualification = tqualification.getText();
                 String appointedBy = tappointedBy.getText();
                 boolean found = false;
            
                 char name[] = staffName.toCharArray();
            
                 for(int i=0;i<name.length;i++)
                 { 
                  if(Character.isDigit(name[i]))
                  {
                    throw new Exception("Input error: Numbers cannot be used in name!");
                    
                   }
                 }
            
                 for(StaffHire staff:staffList)
                 {
                      if(staff instanceof FullTimeStaffHire) // object casting to child from parent
                         {
                          FullTimeStaffHire fullTime=(FullTimeStaffHire)staff;
                          
                          if (fullTime.getvacancyNumber()==vacancyNumber && fullTime.getjoined()==true)
                          {
                              JOptionPane.showMessageDialog(frame,"The vacancy number "+vacancyNumber+"already belongs to "+fullTime.getstaffName());
                              found = true;
                            }
                            
                          else if (fullTime.getvacancyNumber()==vacancyNumber && fullTime.getjoined()==false)
                          {
                              fullTime.FullTimeStaffHire(staffName,joiningDate,qualification,appointedBy);
                              JOptionPane.showMessageDialog(frame,"Full Time Staff appointed Successfully");
                              found = true;
                          }

                        
                      }

                 }
                 if(found == false)
                 {
                  JOptionPane.showMessageDialog(frame,"Error:Vacancy Number "+vacancyNumber+" is not registered yet.");  
                  }
               }
               catch(NumberFormatException ex)
                  {
                   JOptionPane.showMessageDialog(frame,"Error:Invalid input detected!");
            
                  }    
               catch(Exception e)
               {
                JOptionPane.showMessageDialog(frame,e.getMessage());
                
                }
        }
        
       if (p.getSource()==appoint2)
        {
            try
            {
                 if(tvacancyNumberC.getText().isEmpty() || tstaffName2.getText().isEmpty() || tjoiningDate2.getText().isEmpty() || tqualification2.getText().isEmpty() || tappointedBy2.getText().isEmpty())
                 {
                    throw new Exception("TextField cannot be empty!") ;
                    
                 }
                 
                 int vacancyNumber = Integer.parseInt(tvacancyNumberC.getText());
                 String staffName = tstaffName2.getText();
                 String joiningDate = tjoiningDate2.getText();
                 String qualification = tqualification2.getText();
                 String appointedBy = tappointedBy2.getText();
                 boolean found = false;
                 char name[] = staffName.toCharArray();
                 
                 for(int i=0;i<name.length;i++)
                 {
                     if (Character.isDigit(name[i]))
                     {
                        throw new Exception("Input error: Numbers cannot be used in name!");
                        
                     }
                     
                 }
                 
                 for(StaffHire staff:staffList)
                 {
                     if(staff instanceof PartTimeStaffHire) // object casting to child from parent
                         {
                            PartTimeStaffHire partTime=(PartTimeStaffHire)staff;
                          
                          if (partTime.getvacancyNumber()==vacancyNumber && partTime.getjoined()==true)
                          {
                              JOptionPane.showMessageDialog(frame,"Error: The vacancy number "+vacancyNumber+" belongs to "+partTime.getstaffName());
                              found = true;
                            }
                            
                          if (partTime.getvacancyNumber()==vacancyNumber && partTime.getjoined()==false)
                          {
                              partTime.PartTimeStaffHire(staffName,joiningDate,qualification,appointedBy);
                              JOptionPane.showMessageDialog(frame,"Part Time Staff appointed Successfully");
                              found = true;
                          }

                        
                      }

                    }
                 if(found == false)
                 {
                              JOptionPane.showMessageDialog(frame,"Error:Vacancy Number "+vacancyNumber+"is not registered yet.");  
                    }
             }
             
              catch(NumberFormatException ex)
              {
                JOptionPane.showMessageDialog(frame,"Error:Invalid input detected!");
            
             } 
             
              catch(Exception e)
              {
                 JOptionPane.showMessageDialog(frame,e.getMessage());
            
                }
            
          }
          
        if (p.getSource()==terminate)
          {
             try
             { 
                if (tvacancyNumberD.getText().isEmpty())
                {
                  throw new Exception ("TextField cannot be empty!");
                
                }
                
                int vacancyNumber = Integer.parseInt(tvacancyNumberD.getText());
                boolean found = false;
                boolean join = false;
                
                for(StaffHire staff:staffList)
                {
                    if (staff instanceof PartTimeStaffHire) // object casting to child from parent
                    {
                        PartTimeStaffHire partTime = (PartTimeStaffHire)staff;
                        join = partTime.getjoined();
                        
                        if(partTime.getvacancyNumber()==vacancyNumber && partTime.getterminated()==true)
                        {
                            JOptionPane.showMessageDialog(frame,"Staff whose vacancy number "+vacancyNumber+" was already terminated.");
                            found = true;
                            
                        }
                        else if(partTime.getvacancyNumber()==vacancyNumber && partTime.getterminated()==false && join == true)
                        {
                            partTime.termination();
                            JOptionPane.showMessageDialog(frame,"Staff has been terminated successfully.");
                            found = true;
                        
                        }
                    
                    
                    }
                
                }
                
                if(found == false && join ==true)
                {
                    JOptionPane.showMessageDialog(frame,"Error: The Vacancy Number "+vacancyNumber+" not found.");  
                
                }
                else if(found == false && join ==false)
                {
                    JOptionPane.showMessageDialog(frame,"Staff whose vacancy number "+ vacancyNumber+" has not been appointed yet.");  
                
                }

            
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(frame,"Invalid input detected!!");
            }
            
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(frame,e.getMessage());
            
            }
           
         }
        
       
        
        if (p.getSource()==display)
        { 
                try
                { 
                  if (tvacancyNumberB.getText().isEmpty())
                   {
                      throw new Exception ("TextField cannot be empty!");
                    
                    }
                    
                    int vacancyNumber = Integer.parseInt(tvacancyNumberB.getText());
                    boolean found = false;
                   
                    
                    for(StaffHire staff:staffList)
                    {
                        if (staff instanceof FullTimeStaffHire)
                        {
                            FullTimeStaffHire fullTime = (FullTimeStaffHire)staff;
                            
                            if(fullTime.getvacancyNumber()==vacancyNumber)
                            {
                                fullTime.display();
                                JOptionPane.showMessageDialog(frame,"Information is being displayed on terminal window."); 
                             
                                found = true;
                            
                            }
    
                            
                        }
             
                    }
                    
                    if (found==false)
                    {
                        JOptionPane.showMessageDialog(frame,"Error:Vacancy Number "+vacancyNumber+" is not found in the list."); 
                    
                    }
                
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame,"Invalid input detected!");
                }
                
                catch(Exception e){
                    JOptionPane.showMessageDialog(frame,e.getMessage());
                
                }
          }
         
          if (p.getSource()==display2)
          {
               
             try{ 
                if (tvacancyNumberE.getText().isEmpty())
                {
                  throw new Exception ("TextField cannot be empty!");
                
                }
                
                int vacancyNumber = Integer.parseInt(tvacancyNumberE.getText());
                boolean found = false;
               
                
                for(StaffHire staff:staffList)
                {
                    if (staff instanceof PartTimeStaffHire)
                    {
                        PartTimeStaffHire partTime = (PartTimeStaffHire)staff;
                        
                        if(partTime.getvacancyNumber()==vacancyNumber)
                        {
                            partTime.display();
                            JOptionPane.showMessageDialog(frame,"Information is being displayed on terminal window."); 
                         
                            found = true;
                        
                        }

                        
                    }
         
                }
                
                if (found==false){
                    JOptionPane.showMessageDialog(frame,"Error:The Vacancy Number "+vacancyNumber+" is not found in the list."); 
                
                
                }
                
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid input detected!");
            }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(frame,e.getMessage());
            
            }
   
         }
          
         if(p.getSource()==clear)
           {
            tvacancyNumber.setText("");
            tdesignation.setText("");
            tjobType.setText("");
            tsalary.setText("");
            tworkingHour.setText("");
            
            tstaffName.setText("");
            tjoiningDate.setText("");
            tqualification.setText("");
            tappointedBy.setText("");
            
            tvacancyNumberA.setText("");
            tvacancyNumberB.setText("");
        
          }
        
         if(p.getSource()==clear2)
          {
            tvacancyNumber2.setText("");
            tdesignation2.setText("");
            tjobType2.setText("");
            tshifts.setText("");
            twagesPerHour.setText("");
            tworkingHour2.setText("");
            
            tstaffName2.setText("");
            tjoiningDate2.setText("");
            tqualification2.setText("");
            tappointedBy2.setText("");
            
            tvacancyNumberC.setText("");
            tvacancyNumberD.setText("");
            tvacancyNumberE.setText("");
            
          }
         
        
        
    }
    
    public static void main(String[]args) // main method
    {
        new INGNepal().staffHireForm(); // creating new object
    }
}
