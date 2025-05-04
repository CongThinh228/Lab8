import java.util.Scanner;
//Bai cua NMinh
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Xin chào, " + name + "!");
        scanner.close();
        System.out.println("Exit");
    }
}