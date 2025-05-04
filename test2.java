import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Xin chào, " + name + "!");       
        System.out.println("Exit");
        System.out.print("Nhập tuổi của bạn: ");
        String age = scanner.nextLine();
        System.out.println("Xin chào, " + name + "!");
        scanner.close();
    }
}
