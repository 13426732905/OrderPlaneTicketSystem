package cn.edu.hcnu.ui;


    import sun.misc.BASE64Encoder;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

  public class Md5 {
        /**利用MD5进行加密
         * @param str  待加密的字符串
         * @return  加密后的字符串
         * @throws NoSuchAlgorithmException  没有这种产生消息摘要的算法
         * @throws UnsupportedEncodingException
         */
        public static String encoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
            //确定计算方法
            MessageDigest md5= MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
            return newstr;
        }

      public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
          System.out.println(encoderByMd5("zgl1234"));
      }
        /**判断用户密码是否正确
         * @param newpasswd  用户输入的密码
         * @param oldpasswd  数据库中存储的密码－－用户密码的摘要
         * @return
         * @throws NoSuchAlgorithmException
         * @throws UnsupportedEncodingException
         */
        public static boolean checkpassword(String newpasswd,String oldpasswd) throws NoSuchAlgorithmException, UnsupportedEncodingException{
            if(encoderByMd5(newpasswd).equals(oldpasswd))
                return true;
            else
                return false;
        }
    }

