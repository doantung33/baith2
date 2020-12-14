import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tinhtoan {
    ArrayList<Danhba> arrayList1 = new ArrayList<Danhba>();
    Scanner sc = new Scanner(System.in);
    public void qlSDT() {
        Danhba danhba = new Danhba();
        while (true)
        try {
            System.out.println("them so dien thoai");
            int sdt = Integer.parseInt(sc.nextLine());
            danhba.setSoDienThoai(sdt);
            break;
        }catch (NumberFormatException e){
            System.out.println("moi nhap lai");
        }

        System.out.println("nhap ten");
        String ten = (sc.nextLine());
        danhba.setTen(ten);
        while (true)
            try {
                System.out.println("nhap tuoi");
                int tuoi = Integer.parseInt(sc.nextLine());
                danhba.setTuoi(tuoi);
                break;
            }catch (NumberFormatException e){
                System.out.println("moi nhap lai");
            }
        System.out.println("nhap gioi tinh");
        String gioiTinh = sc.nextLine();
        danhba.setGioiTinh(gioiTinh);
        System.out.println("nhap dia chi");
        String diaChi = sc.nextLine();
        danhba.setDiaChi(diaChi);
        boolean check7 = false;
        do {
            System.out.println("nhap email");
            String email = (sc.nextLine());
            String regex = "^[a-zA-Z0-9][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                danhba.setEmail(email);
                check7 = true;
            } else {
                System.out.println("Please enter");
            }
        } while (!check7);
        arrayList1.add(danhba);
        Io.writer("danhba.txt",danhba);
    }
    public void show (){
        for (Danhba danhba : arrayList1){
            if (danhba instanceof Danhba);
            System.out.println(danhba.toString());
        }
    }
    public void delete (){
        System.out.println("xoa danh ba");
        String danhBa = sc.nextLine();
        Danhba danhba = null;
        int size = arrayList1.size();
        for (int i = 0; i < size; i++) {
            if (danhBa.equals(arrayList1.get(i).getTen())){
                danhba= arrayList1.get(i);
            }

        }
        if (danhBa!= null){
            System.out.println("ten danh ba vua xoa la: "+ danhba.getTen());
            arrayList1.remove(danhba);
        }else {
            System.out.println("khong co ten trong danh ba");
        }
    }
    public void edit(){
        System.out.println("nhap ten muon chinh sua");
        String name = sc.nextLine();
        boolean check = false;
        int size = arrayList1.size();
        for (int i = 0; i < size; i++) {
            if (name.equals(arrayList1.get(i).getTen())){
                while (true)
                    try {
                        System.out.println("nhap lai so dien thoai");
                        int sdt = Integer.parseInt(sc.nextLine());
                        check= true;
                        arrayList1.get(i).setSoDienThoai(sdt);
                        break;
                    }catch (NumberFormatException e){
                        System.out.println("moi nhap lai");
                    }

                System.out.println("nhap lai ten");
                String ten = (sc.nextLine());
                while (true)
                    try {
                        System.out.println("nhap lai tuoi");
                        int tuoi = Integer.parseInt(sc.nextLine());
                        check = true;
                        arrayList1.get(i).setTuoi(tuoi);
                        break;
                    }catch (NumberFormatException e){
                        System.out.println("moi nhap lai");
                    }
                System.out.println("nhap lai gioi tinh ");
                String gioiTinh= sc.nextLine();
                System.out.println("nhap lai dia chi");
                String diaChi= sc.nextLine();
                check= true;
                arrayList1.get(i).setTen(ten);
                arrayList1.get(i).setGioiTinh(gioiTinh);
                arrayList1.get(i).setDiaChi(diaChi);
                boolean check7 = false;
                do {
                    System.out.println("nhap lai email ");
                    String editEmail =(sc.nextLine());
                    String regex = "^[a-zA-Z0-9][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(editEmail);
                    if (matcher.find()) {
                        arrayList1.get(i).setEmail(editEmail);
                        check7 = true;
                    } else {
                        System.out.println("Please enter");
                    }
                } while (!check7);

            }

        }
    }
    public void search(){
        boolean check = false;
        System.out.println("nhap ten muon tim kiem");
        String name = sc.nextLine();
        int size = arrayList1.size();
        for (int i = 0; i < size; i++) {
            if (name.equals(arrayList1.get(i).getTen())) {
                check=true;
                System.out.println("ten danh ba ban tim kiem là: "+ arrayList1.get(i));
            }
            break;
        }
        if (!check){
            System.out.println("ten danh ba khong co.");
        }
    }
}
