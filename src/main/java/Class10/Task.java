package Class10;

public class Task {
    public static void main(String[] args) {
      String userName="user123";
      String password="pass1234";
      String confirmPassword="Pass1234";
      if(userName.isEmpty()||password.isEmpty()){
          System.out.println("username or password cannot be empty");
      }else if(password.length()<8){
          System.out.println("Password is too short");
      }else if(password.contains(userName)){
          System.out.println("password cannot contain username");
      }else if(!password.equals(confirmPassword)){
          System.out.println("password do  not match");
      }else{
          System.out.println("your username and password has been created ");
      }


    }
}
