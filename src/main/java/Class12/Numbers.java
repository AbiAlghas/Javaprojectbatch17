package Class12;

public class Numbers {
    int getLarger(int num1, int num2) {

        int res;
        if (num1 > num2) {
            res = num1;
        } else {
            res = num2;
        }
        return res;
    }
}