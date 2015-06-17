
import java.security.*;
 
public class cryptotest {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md;
        String message = "password";
        try {
              md= MessageDigest.getInstance("SHA-512"); // 128
            
//            md= MessageDigest.getInstance("SHA-256"); //64
                  
//            md= MessageDigest.getInstance("MD5");  //32
//            md= MessageDigest.getInstance("SHA"); //40
//            md= MessageDigest.getInstance("SHA-1");  //40
//            md= MessageDigest.getInstance("SHA-384"); //96

            
           //Crypto TEst 12345 
 
            md.update(message.getBytes());
            byte[] mb = md.digest();
            String out = "";
            for (int i = 0; i < mb.length; i++) {
                byte temp = mb[i];
                String s = Integer.toHexString(new Byte(temp));
                while (s.length() < 2) {
                    s = "0" + s;
                }
                s = s.substring(s.length() - 2);
                out += s;
            }
            System.out.println(out.length());
            System.out.println("CRYPTO: " + out);
 
        } catch (NoSuchAlgorithmException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
