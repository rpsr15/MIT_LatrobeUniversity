/*
 * Class Name:    CarClubMember
 *
 * Author:        Your Name
 * Creation Date: Thursday, January 04 2018, 15:08 
 * Last Modified: Thursday, January 04 2018, 15:30
 * 
 * Class Description:
 *
 */

public class CarClubMember
{
  private String name;
  private String phone;

  private VintageCar car1;
  private VintageCar car2;

  public CarClubMember(String name, String phone)
  {
     this.name = name;
     this.phone = phone;
  }

  public String getName()
   {
      return this.name;

   }

   public String getPhone()
   {
      return this.phone;
   }

   public String getCar1Details()
   {
      return this.car1 == null ? "none" : car1.toString();
   }


   public String getCar2Details()
   {
      return this.car2 == null ? "none" : car2.toString();
   }

   public void setPhoneNumber(String phone)
   {
      this.phone = phone;
   }

   public boolean addCar(VintageCar car)
   {
   if(car1 != null)
    {
       car1 = car;
       return true;
    }

    if(car2 != null)
    {
       car2 = car;
       return true;
     }

     return false;
   }

   public boolean changeOriginalBody(int car,boolean isOriginal)
   {
   if( car == 1 && car1 != null)
   {
      this.car1.setOriginalBody(isOriginal);
      return true;
   }
   else if(car == 2 && car2 != null)
   {
      this.car2.setOriginalBody(isOriginal);
      return true;
   }
   else
   {
      return false;
   }

   }

   public boolean canVote()
   {
   if(this.car1 != null && this.car1.isEligibleCar())
   {
      return true;
   }
   else if(this.car2 != null && this.car2.isEligibleCar())
   {
      return true;
    }
    else

    {
       return false;
    }

   }

   public String toString()
   {
      return "CarClubMember[Name: "+this.name+", phone: "+this.phone+", car1: "+ (this.car1 == null ? "None": car1.toString()) +", car2: "+ (this.car2 == null ? "None" : this.car2.toString()) +"]";
   }
}

