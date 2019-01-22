import java.util.Scanner;
  public class App {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Cipher!");
        System.out.println("choice\n 1.Encrypt\n 2.Decrypt");
        int choice=sc.nextInt();
        Cipher caeser=new Cipher();
        if(choice ==1){
            System.out.println("Enter the String for Encryption: ");
            String message = new String();
            message = sc.next();
            System.out.println("Enter Key");
            int shiftKey=sc.nextInt();
            System.out.println(caeser.encrypt(message,shiftKey));

        }