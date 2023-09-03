package Class12;

public class createEmail {
    String Email(String firstName,String lastName,String Emailtype){
        String result=(firstName+lastName+'a'+Emailtype);
        return result;
    }
}
