import java.util.Scanner;

public class Main {
    public static CheckNumber checkNumber;
    public static void main(String[] args) {
        checkNumber = new CheckNumber();
        System.out.println("Nhap vao 1 day de kiem tra : ");
        Scanner sc = new Scanner(System.in);
        String acc = sc.nextLine();
        boolean isvalid = checkNumber.validate(acc);
        if(isvalid){
            System.out.println("Dung Dinh Dang !");
        }else {
            System.out.println("Sai Dinh Dang !");
        }
    }
}