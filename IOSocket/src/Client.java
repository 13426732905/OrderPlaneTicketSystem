import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        //
        try {
            Socket socket=new Socket("localhost",8888);
            InputStream inputStream=socket.getInputStream();
            InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            String serverMessage=bufferedReader.readLine();
            Scanner sc=new Scanner(System.in);
            while (true){
                System.out.println("请输入你要发送的信息");
                String message=sc.next();
                OutputStream outputStream=socket.getOutputStream();
                OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream);
                PrintWriter printWriter=new PrintWriter(outputStream);
                printWriter.println(message);
                printWriter.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
