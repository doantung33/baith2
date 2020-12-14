import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tinhtoan tinhtoan = new Tinhtoan();
        boolean check = false;
        int n =0;
        do {
            try {
                System.out.println("---Menu---");
                System.out.println("1. them danh ba");
                System.out.println("2. hien thi danh ba");
                System.out.println("3. sua danh ba");
                System.out.println("4. tim kiem ten danh ba");
                System.out.println("5. xoa danh ba");
                System.out.println("0. thoat");
                n= Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("moi chon lai");
            }
            switch (n){
                case 1:
                    tinhtoan.qlSDT();
                    break;
                case 2:
                    tinhtoan.show();
                    break;
                case 3:
                    tinhtoan.edit();
                    break;
                case 4:
                    tinhtoan.search();
                    break;
                case 5:
                    tinhtoan.delete();
                    break;
                case 0:
                    check = true;
                    continue;
            }
        }while (!check);
    }
}
