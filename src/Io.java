import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Io {
    private static final String COMA = ",";
    public static void writer (String file ,Danhba danhba){
        File file1 = new File(file);
        FileWriter fileWriter = null;
        try {
            if (!file1.exists()){
                System.out.println("chua co file");
                file1.createNewFile();
            }
            fileWriter = new FileWriter(file1 , true);
            fileWriter.append(String.valueOf(danhba.getSoDienThoai()));
            fileWriter.append(COMA);
            fileWriter.append(danhba.getTen());
            fileWriter.append(COMA);
            fileWriter.append(String.valueOf(danhba.getTuoi()));
            fileWriter.append(COMA);
            fileWriter.append(danhba.getGioiTinh());
            fileWriter.append(COMA);
            fileWriter.append(danhba.getDiaChi()+"\n");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fileWriter!=null){
                try {
                    System.out.println("da viet vao file");
                }catch (Exception e){
                    System.out.println();
                }
            }
        }
    }
    public void read (){

    }
}
