package Class12;

public class HW4 {
  //Create a method that will say Hello in different language based on the country
  // that will be passed when method is executed
   String DifferentLanguages(String country){
     if(country.equals("canada")){
       return "Hello";
     } else if (country.equals("Pakistan")){
       return "Salam";
     } else if (country.equals("spain")) {
       return "Hola";
     }else{
       return "wrong language";
     }
   }

    }
