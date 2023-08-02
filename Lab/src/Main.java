class Account  {
   public String name;
    protected String mail;
    private String password;

    Account(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    // Setter
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter
    public void getPassword() {
        System.out.println("Your account password: " + this.password);
    }

    public void accountInfo() {
        System.out.println("Account holder name & mail address: " + this.name + ", " + this.mail);
    }
}


public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Nasir Uddin", "nasir578@gmail.com");
        account1.setPassword("nasir#455");
        account1.getPassword();
        account1.accountInfo();

        Account account2 = new Account("Juwel rana", "juwel794@gmail.com");
        account2.setPassword("juwel@746#");
        account2.getPassword();
        account2.accountInfo();
    }
}




