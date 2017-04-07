
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Des3 {
    private static byte[] keyiv = { 1, 2, 3, 4, 5, 6, 7, 8 };
    public static void main(String[] args) throws Exception {

        byte[] key=new BASE64Decoder().decodeBuffer("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4");
        byte[] data="中国ABCabc123".getBytes("UTF-8");

        System.out.println("调用一：");

        System.out.println("ECB加密解密");
        byte[] str3 = des3EncodeECB(key,data );
        byte[] str4 = des3DecodeECB(key, str3);
        System.out.println(new BASE64Encoder().encode(str3));
        System.out.println(new String(str4, "UTF-8"));

        System.out.println();

        System.out.println("CBC加密解密");
        byte[] str5 = des3EncodeCBC(key, keyiv, data);
        byte[] str6 = des3DecodeCBC(key, keyiv, str5);
        System.out.println(new BASE64Encoder().encode(str5));
        System.out.println(new String(str6, "UTF-8"));

        System.out.println();
        System.out.println("调用二：");

        System.out.println("ECB加密解密2");
        String d = des3EncodeECB("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4","中国ABCabc123");
        System.out.println(d);
        System.out.println(des3DecodeECB("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4",d));

        System.out.println();

        System.out.println("CBC加密解密2");
        String dd = des3EncodeCBC("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4","中国ABCabc123");
        System.out.println(dd);
        System.out.println(des3DecodeCBC("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4",dd));

    }

    /**
     * ECB加密,不要IV
     * @param key 密钥
     * @param data 明文
     * @return Base64编码的密文
     * @throws Exception
     */
    public static byte[] des3EncodeECB(byte[] key, byte[] data)
            throws Exception {

        Key deskey = null;
        DESedeKeySpec spec = new DESedeKeySpec(key);
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
        deskey = keyfactory.generateSecret(spec);

        Cipher cipher = Cipher.getInstance("desede" + "/ECB/PKCS5Padding");

        cipher.init(Cipher.ENCRYPT_MODE, deskey);
        byte[] bOut = cipher.doFinal(data);

        return bOut;
    }

    public static String des3EncodeECB(String key, String data)
    throws Exception {
        byte[] k = new BASE64Decoder().decodeBuffer(key);
        byte[] d = data.getBytes("UTF-8");

        return new BASE64Encoder().encode(des3EncodeECB(k,d));
    }

    /**
     * ECB解密,不要IV
     * @param key 密钥
     * @param data Base64编码的密文
     * @return 明文
     * @throws Exception
     */
    public static byte[] des3DecodeECB(byte[] key, byte[] data)
            throws Exception {

        Key deskey = null;
        DESedeKeySpec spec = new DESedeKeySpec(key);
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
        deskey = keyfactory.generateSecret(spec);

        Cipher cipher = Cipher.getInstance("desede" + "/ECB/PKCS5Padding");

        cipher.init(Cipher.DECRYPT_MODE, deskey);

        byte[] bOut = cipher.doFinal(data);

        return bOut;

    }

    public static String des3DecodeECB(String key, String data)
    throws Exception {

        byte[] k = new BASE64Decoder().decodeBuffer(key);
        byte[] d = new BASE64Decoder().decodeBuffer(data);

        return new String(des3DecodeECB(k, d),"UTF-8");
    }

    /**
     * CBC加密
     * @param key 密钥
     * @param keyiv IV
     * @param data 明文
     * @return Base64编码的密文
     * @throws Exception
     */
    public static byte[] des3EncodeCBC(byte[] key, byte[] keyiv, byte[] data)
            throws Exception {

        Key deskey = null;
        DESedeKeySpec spec = new DESedeKeySpec(key);
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
        deskey = keyfactory.generateSecret(spec);

        Cipher cipher = Cipher.getInstance("desede" + "/CBC/PKCS5Padding");
        IvParameterSpec ips = new IvParameterSpec(keyiv);
        cipher.init(Cipher.ENCRYPT_MODE, deskey, ips);
        byte[] bOut = cipher.doFinal(data);

        return bOut;
    }

    public static String des3EncodeCBC(String key, String data)
    throws Exception {
        byte[] k = new BASE64Decoder().decodeBuffer(key);
        byte[] iv = keyiv;
        byte[] d = data.getBytes("UTF-8");

        return new BASE64Encoder().encode(des3EncodeCBC(k,iv,d));
    }

    /**
     * CBC解密
     * @param key 密钥
     * @param keyiv IV
     * @param data Base64编码的密文
     * @return 明文
     * @throws Exception
     */
    public static byte[] des3DecodeCBC(byte[] key, byte[] keyiv, byte[] data)
            throws Exception {

        Key deskey = null;
        DESedeKeySpec spec = new DESedeKeySpec(key);
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
        deskey = keyfactory.generateSecret(spec);

        Cipher cipher = Cipher.getInstance("desede" + "/CBC/PKCS5Padding");
        IvParameterSpec ips = new IvParameterSpec(keyiv);

        cipher.init(Cipher.DECRYPT_MODE, deskey, ips);

        byte[] bOut = cipher.doFinal(data);

        return bOut;
    }

    public static String des3DecodeCBC(String key, String data)
    throws Exception {

        byte[] k = new BASE64Decoder().decodeBuffer(key);
        byte[] iv = keyiv;
        byte[] d = new BASE64Decoder().decodeBuffer(data);

        return new String(des3DecodeCBC(k, iv, d),"UTF-8");
    }

}