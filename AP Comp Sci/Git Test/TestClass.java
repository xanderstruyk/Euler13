import java.io.*;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
   */
public class TestClass
{ 
    public static void filePlaying() throws Exception {
        File f = new File("Git_Test.txt");
        PrintWriter output = new PrintWriter(f);
        output.println("YAYYYYYY");
        output.close();
    }
    
}
