import java.io.*;

public class IO {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter=null;
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileReader = new FileReader("E:\\io.txt");//读取文件
             fileWriter=new FileWriter("E:\\ioInput.txt");//写入文件
             bufferedReader=new BufferedReader(fileReader);
             bufferedWriter=new BufferedWriter(fileWriter);
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
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
