import java.util.Scanner;

public class Main {
    public static ClassExample classExample;

    public static void main(String[] args) {
       classExample = new ClassExample();
        System.out.println("Nhap vao 1 day de kiem tra : ");
        Scanner sc = new Scanner(System.in);
        String acc = sc.nextLine();
        boolean isvalid = classExample.validate(acc);
        if(isvalid){
            System.out.println("Dung Dinh Dang !");
        }else {
            System.out.println("Sai Dinh Dang !");
        }
    }
}