import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            byte buffer[]=new byte[1024];
            fileInputStream=new FileInputStream("F:\\Teacher.PNG");
            fileOutputStream=new FileOutputStream("E:\\Teacher.PNG");
            int a=0;
            while ((a=fileInputStream.read(buffer))!=-1){
               fileOutputStream.write(buffer,0,a);
            }
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
