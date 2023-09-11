package Class18;

public class userClass {
    String name;
    int mobileNumber;

    public userClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;

    }
}
    class userInfo extends userClass {
        private String userAddress;

        public userInfo(String name,int mobileNumber,String userAddress) {
            super(name,mobileNumber);
            this.userAddress=userAddress;
        }

        public void printInfo() {
            System.out.println(name + " " + mobileNumber + " " + userAddress);
        }
    }


