public class People
{
  private String lastName;
  private String firstName;
  private int idNum;
  private int age;


  public  People( int id, String last, String first, int a)

  {
   lastName = last;
   firstName = first;
   idNum = id;
   age = a;
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

   
   public void setAge( int a )
   {
    age = a;
   }


   public int getAge()
   {
    return age;
   }



    public String toString()
    {
      return String.format("%s %s %d %d \n", lastName, firstName, idNum, age);
    }
}