import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemo {
    public static void main(String[] args) {
        try {
            //c创建一个ServerSocket对象,并指定端口号，并且指定端口号
            ServerSocket serverSocket=new ServerSocket(8888);
            //侦听并接受到此套接字的连接
            Socket socket=  serverSocket.accept();
            System.out.println("新用户进入系统");
            OutputStream outputStream=socket.getOutputStream();
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream);
            PrintWriter printWriter=new PrintWriter(outputStreamWriter);
            printWriter.println("欢迎你XXX");
            printWriter.flush();
            while (true){
                InputStream inputStream=socket.getInputStream();
                InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
                BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
                String serverMessage=bufferedReader.readLine();
                System.out.println("客户端说：" + serverMessage);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
