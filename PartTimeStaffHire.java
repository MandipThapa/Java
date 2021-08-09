// creating child class(PartTimeStaffHire) of a parent class(StaffHire).
public class PartTimeStaffHire extends StaffHire
//Using private as an Access Modifier so other class can't access these instance variables.
{
    private int workingHour;      // declaring 9 different Instance Variable
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour,
    int wagesPerHour,String shifts) 
 // creating constructor which will take 6 parameters.
    {
 // "this" word is used for setting values to the current object.
    super(vacancyNumber,designation,jobType);
    // "super"is used for accessing instance variables and methods from the parent class.
    this.workingHour=workingHour;
    this.wagesPerHour=wagesPerHour;
    this.shifts=shifts;
    this.staffName="";
    this.joiningDate="";
    this.qualification="";
    this.appointedBy="";
    this.joined=false;
    this.terminated=false;
    }
// creating different accessor methods which returns initialized value of instance variables.
    
    public void setworkingHour(int workingHour)     //setter variable
    {
        this.workingHour=workingHour;
    }
    public int getworkingHour()            //getter method
    {
        return this.workingHour;
    }
    public void setwagesPerHour(int wagesPerHour)
    {
        this.wagesPerHour=wagesPerHour;
    }
    public int getwagesPerHour()
    {
        return this.wagesPerHour;
    }
    public void setstaffName(String staffName)
    {
        this.staffName=staffName;
    }
    public String getstaffName()
    {
        return this.staffName;
    }
    public void setsjoiningDate(String joiningDate)
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
    public void setshifts(String shifts)
    {
        this.shifts=shifts;  
    }
    public String getshifts()
    {
        return this.shifts;
    }
    public void setjoined(boolean joined)
    {
        this.joined=joined;
    }
    public boolean getjoined()
    {
        return this.joined;
    }
    public void setterminated(boolean terminated)
    {
        this.terminated=terminated;
    }
    public boolean getterminated()
    {
        return this.terminated;
    }
//This method is used to check the working shift of the staffs.   
    public void checkWorkingShiftsStatus(String shifts)
    {
        if(joined)
        {    // if already joined
            //nothing to be printed
        }
        else
        {    // if not joined
            this.shifts=shifts;
        }
    }
    
    public void PartTimeStaffHire(String staffName, String joiningDate,String qualification, String appointedBy)
 /* Creating method which checks whether the staff has already joined or not.
 * if staff has already joined it prompts out a message to the user.
 * otherwise, it sets parameter values to the instance variables.
 */
        {
            if(joined)
            {
                System.out.println("Staff has already joined. ");
                System.out.println("The name of the staff is "+getstaffName());
                System.out.println("The joining date is "+getjoiningDate());
            }
            else
            {
                this.staffName=staffName;
                this.joiningDate=joiningDate;
                this.qualification=qualification;
                this.appointedBy=appointedBy;
                this.joined=true;
                this.terminated=false;
            }
        }
            public void termination()
/* creating a method which checks whether the staff is terminated or not.
* if it has terminated, then a message is given to the user.
* otherwise, values to instance variables are set accordingly.
*/           
            {
                if(terminated)
                {
                    System.out.println("Staff has already been terminated.");
                }
                else
                {
                    this.staffName="";
                    this.joiningDate="";
                    this.qualification="";
                    this.appointedBy="";
                    this.joined=false;
                    this.terminated=true;
                }
             
            }
           public void display()                  
           {
// method overriding in order to print out information about Staff.
               super.display();
               if(joined)
               {
               System.out.println("The working hour of the staff is "+getworkingHour());
               System.out.println("The wages per hour for the staff is "+getwagesPerHour());
               System.out.println("The name of the staff is "+getstaffName());
               System.out.println("The joining date of the staff is "+getjoiningDate());
               System.out.println("The qualification of the staff is "+getqualification());
               System.out.println("The staff is appointed by "+getappointedBy());
               System.out.println("The shift of the staff is "+getshifts());
               System.out.println("The condition of the staff joining is "+getjoined());
               System.out.println("The condition of termination of the staff is "+getterminated());
               System.out.println("The income per day of the staff is "+getwagesPerHour()*getworkingHour());
              }
             
            }
    }
    
    
  
    
    
    

