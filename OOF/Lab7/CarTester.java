public class CarTester
{
   public static void main(String[] args)
   {
      VintageCar car1 = new VintageCar("Ford", "Model T", 1907, true); 
      String car1make = car1.getMake();
      System.out.println("Category test: make");
      System.out.println("   make should be set to Ford");
      System.out.println("   make is set to " + car1make);
      System.out.println("   Test: " + 
         (car1make.equals("Ford") ? "SUCCESSFUL" : "FAILED"));

      String car1model = car1.getModel();
      System.out.println("Category test: model");
      System.out.println("   model should be set to Model T");
      System.out.println("   model is set to " + car1model);
      System.out.println("   Test: " + 
         (car1model.equals("Model T") ? "SUCCESSFUL" : "FAILED"));

      int car1year = car1.getYear();
      System.out.println("Category test: year");
      System.out.println("   year should be set to 1907");
      System.out.println("   year is set to " + car1year);
      System.out.println("   Test: " + 
         (car1year == 1907 ? "SUCCESSFUL" : "FAILED"));

      boolean car1originalBody = car1.getOriginalBody();
      System.out.println("Category test: originalBody - true");
      System.out.println("   originalBody should be set to true");
      System.out.println("   originalBody is set to " + car1originalBody);
      System.out.println("   Test: " + 
         (car1originalBody == true ? "SUCCESSFUL" : "FAILED"));

      VintageCar car2 = new VintageCar("Chevrolet", "Master", 1937, false);
      boolean car2originalBody = car2.getOriginalBody();
      System.out.println("Category test: originalBody - false");
      System.out.println("   originalBody should be set to false");
      System.out.println("   originalBody is set to " + car2originalBody);
      System.out.println("   Test: " + 
         (car2originalBody == false ? "SUCCESSFUL" : "FAILED"));

      String car1category = car1.getCategory();
      System.out.println("Category test: category - Historic Category");
      System.out.println("   category should be set to Historic");
      System.out.println("   category is set to " + car1category);
      System.out.println("   Test: " + 
         (car1category.equals("Historic") ? "SUCCESSFUL" : "FAILED"));

      VintageCar car3 = new VintageCar("Chrysler", "Roadster", 1925, true);
      String car3category = car3.getCategory();
      System.out.println("Category test: category - Vintage Category");
      System.out.println("   category should be set to Vintage");
      System.out.println("   category is set to " + car3category);
      System.out.println("   Test: " + 
         (car3category.equals("Vintage") ? "SUCCESSFUL" : "FAILED"));

      String car2category = car2.getCategory();
      System.out.println("Category test: category - Post Vintage Category");
      System.out.println("   category should be set to Postvintage");
      System.out.println("   category is set to " + car2category);
      System.out.println("   Test: " + 
         (car2category.equals("Postvintage") ? "SUCCESSFUL" : "FAILED"));

      VintageCar car4 = new VintageCar("Austin", "Sheerline", 1949, true);
      String car4category = car4.getCategory();
      System.out.println("Category test: category - Other Category");
      System.out.println("   category should be set to Other");
      System.out.println("   category is set to " + car4category);
      System.out.println("   Test: " + 
         (car4category.equals("Other") ? "SUCCESSFUL" : "FAILED"));

      VintageCar car5 = new VintageCar("Ford", "Model T", 1918, true); 
      String car5category = car5.getCategory();
      System.out.println("Boundary test: category - 1918/1919 boundary");
      System.out.println("   category should be set to Historic");
      System.out.println("   category is set to " + car5category);
      System.out.println("   Test: " + 
         (car5category.equals("Historic") ? "SUCCESSFUL" : "FAILED"));

      VintageCar car6 = new VintageCar("Ford", "Model T", 1919, true); 
      String car6category = car6.getCategory();
      System.out.println("Boundary test: category - 1918/1919 boundary");
      System.out.println("   category should be set to Vintage");
      System.out.println("   category is set to " + car6category);
      System.out.println("   Test: " + 
         (car6category.equals("Vintage") ? "SUCCESSFUL" : "FAILED"));

      VintageCar car7 = new VintageCar("Ford", "Model T", 1930, true); 
      String car7category = car7.getCategory();
      System.out.println("Boundary test: category - 1930/1931 boundary");
      System.out.println("   category should be set to Vintage");
      System.out.println("   category is set to " + car7category);
      System.out.println("   Test: " + 
         (car7category.equals("Vintage") ? "SUCCESSFUL" : "FAILED"));

      VintageCar car8 = new VintageCar("Ford", "Model T", 1931, true); 
      String car8category = car8.getCategory();
      System.out.println("Boundary test: category - 1930/1931 boundary");
      System.out.println("   category should be set to Postvintage");
      System.out.println("   category is set to " + car8category);
      System.out.println("   Test: " + 
         (car8category.equals("Postvintage") ? "SUCCESSFUL" : "FAILED"));

      VintageCar car9 = new VintageCar("Ford", "Model T", 1939, true); 
      String car9category = car9.getCategory();
      System.out.println("Boundary test: category - 1939/1940 boundary");
      System.out.println("   category should be set to Postvintage");
      System.out.println("   category is set to " + car9category);
      System.out.println("   Test: " + 
         (car9category.equals("Postvintage") ? "SUCCESSFUL" : "FAILED"));

      VintageCar car10 = new VintageCar("Ford", "Model T", 1940, true); 
      String car10category = car10.getCategory();
      System.out.println("Boundary test: category - 1939/1940 boundary");
      System.out.println("   category should be set to Other");
      System.out.println("   category is set to " + car10category);
      System.out.println("   Test: " + 
         (car10category.equals("Other") ? "SUCCESSFUL" : "FAILED"));

      car1.setOriginalBody(false);
      car1originalBody = car1.getOriginalBody();
      System.out.println("Category test: setOriginalBody - true -> false");
      System.out.println("   originalBody should be set to false"); 
      System.out.println("   originalBody is set to " + car1originalBody);
      System.out.println("   Test: " + 
         (car1originalBody == false ? "SUCCESSFUL" : "FAILED"));
      
      car3.setOriginalBody(true);
      boolean car3originalBody = car3.getOriginalBody();
      System.out.println("Category test: setOriginalBody - true -> true");
      System.out.println("   originalBody should be set to true"); 
      System.out.println("   originalBody is set to " + car3originalBody);
      System.out.println("   Test: " + 
         (car3originalBody == true ? "SUCCESSFUL" : "FAILED"));

      car2.setOriginalBody(true);
      car2originalBody = car2.getOriginalBody();
      System.out.println("Category test: setOriginalBody - false -> true");
      System.out.println("   originalBody should be set to true"); 
      System.out.println("   originalBody is set to " + car2originalBody);
      System.out.println("   Test: " + 
         (car2originalBody == true ? "SUCCESSFUL" : "FAILED"));

      VintageCar car11 = new VintageCar("Chrysler", "Roadster", 1928, false);
      car11.setOriginalBody(false);
      boolean car11originalBody = car11.getOriginalBody();
      System.out.println("Category test: setOriginalBody - false -> false");
      System.out.println("   originalBody should be set to false"); 
      System.out.println("   originalBody is set to " + car11originalBody);
      System.out.println("   Test: " + 
         (car11originalBody == false ? "SUCCESSFUL" : "FAILED"));

      boolean car1isEligibleCar = car1.isEligibleCar();
      System.out.println("Category test: isEligibleCar");
      System.out.println("   isEligibleCar should be true");
      System.out.println("   isEligibleCar is " + car1isEligibleCar);
      System.out.println("   Test: " + 
         (car1isEligibleCar == true ? "SUCCESSFUL" : "FAILED"));

      boolean car4isEligibleCar = car4.isEligibleCar();
      System.out.println("Category test: isEligibleCar");
      System.out.println("   isEligibleCar should be false");
      System.out.println("   isEligibleCar is " + car4isEligibleCar);
      System.out.println("   Test: " + 
         (car4isEligibleCar == false ? "SUCCESSFUL" : "FAILED"));

      boolean car9isEligibleCar = car9.isEligibleCar();
      System.out.println("Boundary test: isEligibleCar - 1939/1940 boundary");
      System.out.println("   isEligibleCar should be true");
      System.out.println("   isEligibleCar is " + car9isEligibleCar);
      System.out.println("   Test: " + 
         (car9isEligibleCar == true ? "SUCCESSFUL" : "FAILED"));

      boolean car10isEligibleCar = car10.isEligibleCar();
      System.out.println("Boundary test: isEligibleCar - 1939/1940 boundary");
      System.out.println("   isEligibleCar should be false");
      System.out.println("   isEligibleCar is " + car10isEligibleCar);
      System.out.println("   Test: " + 
         (car10isEligibleCar == false ? "SUCCESSFUL" : "FAILED"));

      int car1compareAge = car1.compareAge(car2);
      System.out.println("Category test: compareAge");
      System.out.println("   compareAge should be negative");
      System.out.println("   compareAge is " + car1compareAge);
      System.out.println("   Test: " + 
         (car1compareAge < 0 ? "SUCCESSFUL" : "FAILED"));

      int car4compareAge = car4.compareAge(car2);
      System.out.println("Category test: compareAge");
      System.out.println("   compareAge should be positive");
      System.out.println("   compareAge is " + car4compareAge);
      System.out.println("   Test: " + 
         (car4compareAge > 0 ? "SUCCESSFUL" : "FAILED"));

      VintageCar car12 = new VintageCar("Chrysler", "Roadster", 1928, true);
      int car12compareAge = car12.compareAge(car11);
      System.out.println("Category test: compareAge");
      System.out.println("   compareAge should be zero");
      System.out.println("   compareAge is " + car12compareAge);
      System.out.println("   Test: " + 
         (car12compareAge == 0 ? "SUCCESSFUL" : "FAILED"));

      VintageCar car13 = new VintageCar("Chrysler", "Roadster", 1927, true);
      int car13compareAge = car13.compareAge(car12);
      System.out.println("Boundary test: compareAge");
      System.out.println("   compareAge should be negative");
      System.out.println("   compareAge is " + car13compareAge);
      System.out.println("   Test: " + 
         (car13compareAge < 0 ? "SUCCESSFUL" : "FAILED"));

      VintageCar car14 = new VintageCar("Chrysler", "Roadster", 1929, true);
      int car14compareAge = car14.compareAge(car12);
      System.out.println("Boundary test: compareAge");
      System.out.println("   compareAge should be positive");
      System.out.println("   compareAge is " + car14compareAge);
      System.out.println("   Test: " + 
         (car14compareAge > 0 ? "SUCCESSFUL" : "FAILED"));

      boolean car1sameType = car1.sameType(car5);
      System.out.println("Category test: sameType - make same, model same");
      System.out.println("   sameType should be true");
      System.out.println("   sameType is " + car1sameType);
      System.out.println("   Test: " + 
         (car1sameType == true ? "SUCCESSFUL" : "FAILED"));

      VintageCar car15 = new VintageCar("Ford", "Model A", 1930, false);
      boolean car15sameType = car15.sameType(car1);
      System.out.println("Category test: sameType - make same, model diff");
      System.out.println("   sameType should be false");
      System.out.println("   sameType is " + car15sameType);
      System.out.println("   Test: " + 
         (car15sameType == false ? "SUCCESSFUL" : "FAILED"));

      VintageCar car16 = new VintageCar("Buick", "Roadster", 1939, true);
      boolean car16sameType = car16.sameType(car11);
      System.out.println("Category test: sameType - make diff, model same");
      System.out.println("   sameType should be false");
      System.out.println("   sameType is " + car16sameType);
      System.out.println("   Test: " + 
         (car16sameType == false ? "SUCCESSFUL" : "FAILED"));

      boolean car12sameType = car12.sameType(car1);
      System.out.println("Category test: sameType - make diff, model diff");
      System.out.println("   sameType should be false");
      System.out.println("   sameType is " + car12sameType);
      System.out.println("   Test: " + 
         (car12sameType == false ? "SUCCESSFUL" : "FAILED"));

      VintageCar car17 = new VintageCar("Ford", "Model T", 1907, true); 
      String car17state = car17.toString();
      String expectedState = "VintageCar[make: Ford, model: Model T, year: " +
                             "1907, originalBody: true, category: Historic]";
      System.out.println("Category test: toString - description of state");
      System.out.println("   string should be " + expectedState);
      System.out.println("   string is " + car17state);
      System.out.println("   Test: " + 
         (car17state.equals(expectedState) ?  "SUCCESSFUL" : "FAILED"));
   }
}
