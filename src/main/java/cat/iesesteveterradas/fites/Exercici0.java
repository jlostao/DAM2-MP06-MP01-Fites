package cat.iesesteveterradas.fites;

import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Objectius de l'exercici:
 * - Comprova l'existència del fitxer filePaht.
 * - Determina si el fitxer és ocult.
 * - Mostra la data de l'última modificació.
 * - Verifica si el fitxer pot ser modificat.
 * - Llista els arxius dins d'un directori basePath.
 */

public class Exercici0 {
    public static void main(String args[]) {
        String basePath = System.getProperty("user.dir") + "/data/exercici0/";
        String filePath = basePath + "Exercici0.dat";

        boolean existeix = false;
        File fileExists = new File(filePath);
        if (fileExists.exists()) {
            existeix = true;
        } else {
            existeix = false;
        }
        System.out.println("L'arxiu existeix: " + existeix);


        boolean ocult = false;
        File fileHidden = new File(filePath);
        if (fileHidden.isHidden()) {
            ocult = true;
        } else {
            ocult = false;
        }
        System.out.println("L'arxiu és ocult: " + ocult);


        File fileLastModified = new File(filePath);
        Date modificat = new Date(fileLastModified.lastModified());
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyy hh:mm:ss");  
        String strModificat = dateFormat.format(modificat);  
        System.out.println("Última modificació: " + strModificat);


        boolean esPotModificar = true;
        File fileWritabel = new File(filePath);
        if (fileWritabel.canWrite()) {
            esPotModificar = true;
        } else {
            esPotModificar = false;
        }
        System.out.println("L'arxiu es pot modificar: " + esPotModificar);


        ArrayList<String> llistaArxius = new ArrayList<>();
        File directory = new File(basePath);
        String files[] = directory.list();
        for (int i = 0; i < files.length; i++) {
            llistaArxius.add(files[i]);
        }
        System.out.println("La llista d'arxius d'aquesta carpeta és: " + llistaArxius);
    }
}
