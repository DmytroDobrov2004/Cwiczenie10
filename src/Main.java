import java.io.*;
import java.net.URL;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        //zadanie 1
        /*FileInputStream fls;
        int bite;
        try {
            fls = new FileInputStream("C:\\index\\out.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        try {
            do {
                bite = fls.read();
                if (bite != -1) System.out.println((char) bite);
            } while (bite != -1);
        }catch (IOException e) {
            System.out.println("Blad odczytu pliku");
        }finally{
            fls.close();
        try{
        fls.close();
        }catch (IOException e){
    System.out.println("Blad podczas zamykania pliku");
    }
    }
*/





        //zadanie 2

        int bite;
        try (FileInputStream fls = new FileInputStream("C:\\index\\out.txt")){

            do {
                bite = fls.read();
                if (bite != -1) System.out.println((char) bite);
            } while (bite != -1);
        }catch (FileNotFoundException e){System.out.println("Plik nie jest znaleziony");
        }catch (IOException e) {System.out.println("Blad odczytu pliku");}






        //Zadanie 3
/*int bajt;
try(FileInputStream poczplik = new FileInputStream("C:\\index\\out.txt");){
    FileOutputStream konplik = new FileOutputStream("C:\\index\\FinOut.txt");
    byte[] buffer = new byte[poczplik.available()];
    poczplik.read(buffer);
    for(byte FirstByte : buffer){
        if(FirstByte == 32) {
            konplik.write(45);
        }else konplik.write(FirstByte);

        }

    }catch (FileNotFoundException e){System.out.println("Plik nie jest znaleziony");}
catch (IOException e) {System.out.println("Nie udało się odzcytanie pliku");}
*/
}




    }