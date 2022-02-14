import java.io.File;
import java.util.Arrays;

public class zad3 {
    public static void main(String[] args){
        String path = "D:\\infa\\pakiety";
        String[] lista = metoda(path);
        System.out.println(Arrays.toString(lista));
    }

    public static String[] metoda(String path){
        File file = new File(path);
        return file.list();
    }

}
