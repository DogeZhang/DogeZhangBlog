package com.dogezhang.myBlogServer.util;
import java.io.*;

/**
 * Created by zhang on 2019/3/16.
 */
public class FileUtil {
    // 将文件写入
    public static void fileupload(byte[] file,String filePath,String fileName) throws IOException {
        //目标目录
        File targetfile = new File(filePath + fileName);
        if(!targetfile.exists()) {
            targetfile.getParentFile().mkdirs();
        }

        //二进制流写入
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }
    // 读取文件内容，以字符串方式返回
    public static String fileRead(String filePath, String fileName) throws IOException {
        String encoding = "UTF-8";
        File file = new File(filePath + fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }
}
