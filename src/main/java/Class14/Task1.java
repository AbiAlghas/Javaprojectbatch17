package Class14;

public class Task1 {
    //Create a method that will accept an array as parameters and will return a sum of all elements
    //from that array.Method should be visibly only within sama package and accessible by the creating an instance/object
    //of the class.

    public static void main(String[] args) {
        Task1 t2=new Task1();
        int[]array={10,25,15};
        System.out.println(t2.getArrSum(array));
    }
    int getArrSum(int[]arr){
        int sum=0;
        for(int n:arr){
            sum=sum+n;
        }
        return sum;
    }
}
