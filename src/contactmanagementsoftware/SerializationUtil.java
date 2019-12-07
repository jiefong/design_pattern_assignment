package contactmanagementsoftware;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationUtil implements Serializable {

    private static SerializationUtil uniqueInstance;

    private SerializationUtil() {
    }

    public static synchronized SerializationUtil getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SerializationUtil();
        }
        return uniqueInstance;
    }

    public Object deserialize(File file) throws IOException,
            ClassNotFoundException {
        System.out.println("Deserializing...");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        System.out.println("Going to return object...");
        return obj;
    }

    // serialize the given object and save it to file
    public void serialize(Object obj, String fileName)
            throws IOException {
        System.out.println("Serializing...");
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        fos.close();
        System.out.println("Done writing object");
    }
}

//public class SerializationUtil implements Serializable{
// 
//    public static Object deserialize(File file) throws IOException,
//            ClassNotFoundException {
//        System.out.println("I m in the method");
//        FileInputStream fis = new FileInputStream(file);
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Object obj = ois.readObject();
//        ois.close();
//        System.out.println("I m in the method before return");
//        return obj;
//    }
// 
//    // serialize the given object and save it to file
//    public static void serialize(Object obj, String fileName)
//            throws IOException {
//        FileOutputStream fos = new FileOutputStream(fileName);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(obj);
// 
//        fos.close();
//    }
// 
//}
