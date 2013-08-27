public class People
{
  private String lastName;
  private String firstName;
  private int idNum;
  private double gpa;


  public  Student ( String last, String first, int id, double gpa1)

  {
   lastName = last;
   firstName = first;
   idNum = id;
   gpa = gpa1;
  }

   public void setLastName( String last)
   {
    lastName = last;
   }


   public String getLastName()
   {
    return lastName;
   }

   
   public void setFirstName( String first)
   {
    firstName = first;
   }


   public String getFirstName()
   {
    return firstName;
   }


   public void setIdNum( int id)
   {
    idNum = id;
   }


   public int getIdNum()
   {
    return idNum;
   }

   
   public void setGpa( double gpa1 )
   {
    gpa = gpa1;
   }


   public double getGpa()
   {
    return gpa;
   }



    public String toString()
    {
      return String.format("%s %s %d %f \n", lastName, firstName, idNum, gpa);
    }
}