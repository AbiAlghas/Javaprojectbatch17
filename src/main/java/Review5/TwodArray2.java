package Review5;

public class TwodArray2 {
    public static void main(String[] args) {

        String[][] countries={
                             {"Canada","USA"},  //0
                             {"Ecuador","Brazil","Chile","Argentina"},  //1
                             {"Romania","France","Italy"}}; //2

        System.out.println(countries.length); //give us number of 1D arrays

        for(String[]countryArray:countries){   //outer loop iterates over 1D arrays

            for(String country:countryArray){  //inner loop iterates over each element inside that 1DArray.
                System.out.print(country+" ");

            }
            System.out.println();

        }

    }
}
