
// creating child class(FullTimeStaffHire) of a parent class(StaffHire).
public class FullTimeStaffHire extends StaffHire
{
//Using private as an Access Modifier so other class can't access these instance variables.
    private int salary;      // declaring 7 different Instance Variable
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
   public FullTimeStaffHire( int vacancyNumber, String designation, String jobType,
   int salary, int workingHour) 
// creating constructor which will take 5 parameters.
   {
 // "this" word is used for setting values to the current object.
       super(vacancyNumber,designation,jobType);
 // "super"is used for accessing instance variables and methods from the parent class.
       this.salary=salary;
       this.workingHour=workingHour;
       this.staffName="";
       this.joiningDate="";
       this.qualification="";
       this.appointedBy="";
       this.joined=false;
          
       }
 // creating different accessor methods which returns initialized value of instance variables. 
       
     public void setsalary(int salary)          //setter variable
     {
         this.salary=salary;
        }
        public int getsalary()                       //getter method
        {
            return this.salary;
        }
        public void setworkingHour(int workingHour) 
        {
            this.workingHour=workingHour;
        }
        public int getworkingHour()
        {
            return this.workingHour;
        }
        public void setstaffName(String staffName)
        {
            this.staffName=staffName;
        }
        public String getstaffName()
        {
            return this.staffName;
        }
        public void setjoiningDate(String joiningDate)
        {
            this.joiningDate=joiningDate;
        }
        public String getjoiningDate()
        {
            return this.joiningDate;
        }
        public void setqualification(String qualification)
        {
            this.qualification=qualification;
        }
        public String getqualification()
        {
            return this.qualification;
        }
        public void setappointedBy(String appointedBy)
        {
            this.appointedBy=appointedBy;
        }
        public String getappointedBy()
        {
            return this.appointedBy;
        }
        public void  setjoined(boolean joined)
        {
            this.joined=joined;
        }
        public boolean getjoined()
        {
            return this.joined;
        }
        
        public void checkJoinedStatus(int salary)
 //Creating a method to check the joined status of the staff.
        {
            if(joined)
            {    //if already joined.
                System.out.println("It is not possible to change the salary");
            }
            else
            {   //if not joined
            this.salary=salary;
            }
        }
        public void workingHour(int workingHour) 
 //Creating a method that sets working hour.
        {
            this.workingHour=workingHour;
            
        }
        public void FullTimeStaffHire(String staffName, String joiningDate, String qualification, String appointedBy)
   /* Creating method which checks whether the staff has already joined or not.
   * if staff has already joined it prompts out a message to the user.
   * otherwise, it sets parameter values to the instance variables.
   */
        {
            if(joined)
            {
              System.out.println("you are already appointed");
              System.out.println("The name of the staff is "+ getstaffName());
              System.out.println("The joining date of the staff is " + getjoiningDate());
            }
            else
            {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
            }
        }
        public void display()        
        {
// method overriding in order to print out information about Staff.
            super.display();
            if(joined)
            {
            System.out.println("The salary of the staff is "+getsalary());
            System.out.println("The working hour of the staff is"+getworkingHour());
            System.out.println("The name of the staff is "+getstaffName());
            System.out.println("The joining date of the staff is "+getjoiningDate());
            System.out.println("The staff is appointed by "+getappointedBy());
            System.out.println("The qualification of the staff is "+getqualification());
            System.out.println("The condition of staff joining is "+getjoined());
             }

        }
 
}
