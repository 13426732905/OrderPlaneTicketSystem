import java.net.ServerSocket;

public class Sokect {
    public static void main(String[] args) {
        ServerSocket socket=new ServerSocket(8888);
        socket.accept();
    }
}
