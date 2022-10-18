import java.util.Locale;
import java.util.Scanner;

public class email {
    private String fn;
    private String ln;
    private String email;
    private String password;
    private int mailBoxCapacity = 10;
    private String altMail;
    private String departament;
    private int pasuordiLength = 10;
    private String suffixi = "gjergjcanco.com";


    // Konstruktori per emer mbiemer

public email (String fn, String ln) {
    this.fn = fn;
    this.ln = ln;

    //krijo metod per te pyeteur departamentin - return departamentin
this.departament = departamenti();

    //Metod per pasuordin
this.password = pasuordi(pasuordiLength);
System.out.println("Your password is:" + this.password);

    //Kombino elementet dhe gjenero emailin
    email = fn.toLowerCase() + "." + ln.toLowerCase() + "@" + departament + suffixi;
    }

    //Pyet per departamentin

    private String departamenti() {
        System.out.println("KODET E DEPARTAMENTIT \n 1 for Sales \n 2 for Accountin \n 3 for accounting \n 0 for none \n VENDOS KODIN E DEPARTAMENTIT:");
        Scanner in = new Scanner(System.in);
        int zgjidhjaDep = in.nextInt();
        if (zgjidhjaDep == 1) { return "sales";}

        else if (zgjidhjaDep == 2) {
            return "dev";
    }
        else if (zgjidhjaDep == 3) {
            return "acct";
        }

        else {
        return "";}
    }
    // Gjenero nje pasuord
private String pasuordi(int length) {
    String vendosPassowrdin = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*" ;
    char [] password = new char[length];
    for (int i =0; i<length; i++) {
       int rand = (int) (Math.random() * vendosPassowrdin.length());
       password[i] = vendosPassowrdin.charAt(rand);
    }
    return new String (password);

}
    //Vendo limitin e mailbox-it
public void setMailBoxCapacity(int capacity) {
    this.mailBoxCapacity = capacity;
}
    //Vendos altEmail

    public void setAltMail(String altMail) {
    this.altMail= altMail;
    }

    //Ndrysho pasuordin

    public void changePassowrd (String password) {
    this.password = password;
    }

    public int getMailBoxCapacity() {return mailBoxCapacity;}
    public String getAltMail() {return altMail;}
    public String getPassword() { return password;}
    public String showInfo() {
        return "\nDISPLAY NAME:" + fn + " " + ln +
                "\nCOMPANY EMAIL:" + email +
                "\nMAILBOX CAPACITY:" + mailBoxCapacity + "mb";

    }

}


