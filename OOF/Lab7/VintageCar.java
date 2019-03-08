public class VintageCar
{
      private String make;
      private String model;
      private int year;
      private boolean originalBody;
      private String category;
      
      
      
      public VintageCar(String make,String model, int year, boolean originalBody)
      {
       this.make = make;
       this.model = model;
       this.year = year;
       this.originalBody = originalBody;  
       setCategory();
      }


      private void setCategory()
      {
        if(this.year < 1919)
         {
            this.category = "Historic";
         }
         else if(this.year < 1931)
         {
            this.category = "Vintage";
         }

         else if(this.year < 1940)
         {
            this.category = "PostVintage";
         }
         else 
         {
            this.category = "Other";
          }
   
      }

      public String getCategory()
      {
         return this.category;
      }

      public String getMake()
      {
         return this.make;

      }
         
      public String getModel()
      {
         return this.model;
      }

      public int getYear()
      {
         return this.year;

      }

      public boolean getOriginalBody()
      {
         return this.originalBody;
      }


      public void setOriginalBody(boolean isOriginal)
      {
         this.originalBody = isOriginal;

      }


      public boolean isEligibleCar()
      {
         if(this.year < 1940)
         {
            return true;
         }
         else
         {
            return false;
         }
      }

      public int compareAge(VintageCar  car)
      {
         int result = this.year - car.getYear();
         return result;
      }

      public boolean sameType(VintageCar car)
      {
         if(this.make.equalsIgnoreCase(car.getMake()) && this.model.equalsIgnoreCase(car.getModel()))
         {
            return true;
         }
         else{
         return false;
         }
      }

      public String toString()
      {
         return "VintageCar[make: "+this.make+", model: "+this.model+", year: "+this.year+", originalBody: "+this.originalBody+", category: "+this.category+"]";
      }

  



}
