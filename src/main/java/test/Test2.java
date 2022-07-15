package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test2
{
    public void add(Byte b)
    {
        b = b++;
    }
    public void test()
    {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a + " ");
        add(b);
        System.out.println(b + "");
    }

    public static void main(String[] args) {
        new Test2().test();
        new Test2().getCustomerInfo();
    }


    public void getCustomerInfo() {
        try {
            File file = new File("E:/11/afb.txt");
            String name = file.getName();
            FileOutputStream fos = new FileOutputStream(file);
            FileChannel channel = fos.getChannel();
            channel.read(new ByteBuffer[455555]);
            String str = "abc";
            str += 'a';
            str += 'a';
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException!");
        } catch (IOException ex) {
            System.out.println("IOException!");
        } catch (Exception ex) {
            System.out.println("Exception!");
        }
    }

}
