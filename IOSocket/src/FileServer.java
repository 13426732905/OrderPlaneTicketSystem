import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("192.168.1.21", 9999);
            FileOutputStream fos = new FileOutputStream("E:\\2021-01-15.rar");
            InputStream is = socket.getInputStream();
            byte buff[] = new byte[1024];
            int a = 0;
            while ((a = is.read(buff)) != -1) {
                fos.write(buff, 0, a);
            }
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
