import java.io.*;

public class IO {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("E:\\io.txt");//读取文件
            FileWriter fileWriter=new FileWriter("E:\\ioInput.txt");//写入文件
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String line="";
            while ( (line=bufferedReader.readLine())!=null){
//                System.out.println(line);
                fileWriter.write(line);
                fileWriter.write("\r");//先回车
                fileWriter.write("\n");//再换行
            }
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
