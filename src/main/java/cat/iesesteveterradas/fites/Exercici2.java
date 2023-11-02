package cat.iesesteveterradas.fites;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Objectius de l'exercici:
 * - Llegeix el fitxer 'Exercici2.dat'.
 * - Fixa't en el programa 'Exercici2write.java' per veure com s'ha genereat el fitxer.
 * - Crea objectes 'Exercici2persona' amb les dades llegides.
 * - Mostra les dades de cada persona en una línia diferent.
 * - El programa ha de gestionar qualsevol quantitat de persones dins de l'arxiu.
 *
 * Nota: Executa primner Exercici2write.java (No cal fer cap canvi) i mira el codi per entendre
 * què fa.
 */


public class Exercici2 {
    public static void main(String args[]) {
        String basePath = System.getProperty("user.dir") + "/data/exercici2/";
        String filePath = basePath + "Exercici2.dat";
        List<Exercici2persona> persones = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            while (dis.available() > 0) {
                String name = dis.readUTF();
                String surname = dis.readUTF();
                int age = dis.readInt();
                persones.add(new Exercici2persona(name, surname, age));
            }
        } catch (IOException e) {
            System.out.println("Hi ha hagut un problema llegint el fitxer: " + e.getMessage());
        }

        for (int i = 0; i < persones.size(); i++) {
            System.out.println(persones.get(i).toString());  
        }   
    }
}
