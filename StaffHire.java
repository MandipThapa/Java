
// creating a parent class named "StaffHire" which has 3 attributes.
public class StaffHire
{
// accessModifier "protected" allows other sub class to access these instance variables.
   protected int vacancyNumber;    // instance variable
   protected String designation;      
   protected String jobType;
   
   public StaffHire(int vacancyNumber, String designation, String jobType) 
// creating constructor which will take three parameters.
   {
       // "this" word is used for setting values to the current object.
       this.vacancyNumber= vacancyNumber;
       this.designation=designation;
       this.jobType=jobType;
       
    }
// creating different accessor methods which returns initialized value of instance variables.
 
    public void setvacencyNumber(int vacancyNumber)     //setter variable 
    {
        this.vacancyNumber=vacancyNumber;
        
    }
    
    public int getvacancyNumber()                       //getter method
    {
        return this.vacancyNumber;
        
    }
    
    public void setdesignation(String designation)
    {
        this.designation=designation;
        
    }
    public String getdesignation()
    {
        return this.designation;
        
    }
    public void setjobType(String jobType)
    {
        this.jobType=jobType;
        
    }
    public String getjobType()
    {
        return this.jobType;
        
    }
    public void display()
   // creating a method named display for printing out the values.
    {
        System.out.println("The vacancy number is "+getvacancyNumber());
        System.out.println("The designation is "+getdesignation());
        System.out.println("The job type is "+getjobType());
        
    }
   
}
