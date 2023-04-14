package quanlynhanvien.myfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyFileHr {
  
    public void output(Object h, String nameFile){
        try {
            FileOutputStream fos=new FileOutputStream(nameFile);
            ObjectOutputStream os=new ObjectOutputStream(fos);
            os.writeObject(h);
            os.close();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(),e.getCause());
        }
    }
    public Object input(String file){
        try{
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream oi=new ObjectInputStream(fis);
            Object o=oi.readObject();
            oi.close();
            return o;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(),e.getCause());

        }
    }

}
