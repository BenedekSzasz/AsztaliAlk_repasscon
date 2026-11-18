public class Password {
    public static void startApplication() {
        PasswordDto pass = inputPassdata();
        if( Store.saveContent(pass)) { 
         System.out.println("Ok. A kiírás sikeres.");  
        }
    }

    private static PasswordDto inputPassdata() {
        PasswordDto pass = new PasswordDto();
        pass.username = Console.input("Felhasználónév: ");
        pass.password = Console.input("Jelszó: ");
        pass.place = Console.input("Hely: ");
        return pass;

    }
}
