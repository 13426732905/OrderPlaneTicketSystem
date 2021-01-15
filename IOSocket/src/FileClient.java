import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("192.168.1.21",9999);
            FileOutputStream fos=new FileOutputStream("E:\\PLSQL_Developer1064.zip");
            InputStream is=socket.getInputStream();
            byte buff[]=new byte[1024];
            int a=0;
            while((a=is.read(buff))!=-1){
                fos.write(buff,0,a);
            }
            fos.flush();
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }
}
