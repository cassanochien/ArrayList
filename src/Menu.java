public class Menu  {
    public static int getUserChoice () {
        int choice;
        System.out.println("Press1 : Create ");
        System.out.println("Press2 : Display ");
        System.out.println("Press3 : Updates ");
        System.out.println("Press4 : Delete ");
        System.out.println("Press5 : Exits");
        System.out.println("Enter the choice");

        choice = Main.in.nextInt();
        return  choice;
    }
}