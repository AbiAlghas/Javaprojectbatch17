package Class8;

public class taskarray {
    //count true values are present in array
    public static void main(String[] args) {
        boolean[] conds = {true, false, true, false, true, true};
        int count=0;
        for (int i = 0; i < conds.length; i++) {
            if(conds[i]){
                count++;


            }

        }
        System.out.println(count);




    }
}