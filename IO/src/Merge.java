import java.io.*;

public class Merge {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\");//读取文件所在的位置
        //文本保存后缀为qmcflac的文件
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("E:\\qmcflac.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.getName().endsWith(".qmcflac")) {
                try {
                    fileWriter.write(f.getName());
                    fileWriter.write("\r");
                    fileWriter.write("\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

       byte buff[]=new byte[1024];
        FileOutputStream fileOutputStream=new FileOutputStream("E:\\zhou.qmcflac");
        FileReader fileReader=new FileReader("E:\\qmcflac.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String  qmcflac="";
        while ((qmcflac=bufferedReader.readLine())!=null){
            FileInputStream fileInputStream=new FileInputStream("E:\\"+qmcflac);
            int a=0;
            while ((a=fileInputStream.read(buff))!=-1){
                fileOutputStream.write(buff,0,a);
            }
        }

       fileOutputStream.flush();


    }
}
