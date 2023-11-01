package cat.iesesteveterradas.fites;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * - Utilitzant l'objecte 'Exercici3nau', que es pot necessitar modificar.
 * - Inicialitza 'llista0' amb dades d'objectes de tipus 'Exercici3nau'.
 * - Guarda 'llista0' en un arxiu binari anomenat 'Exercici3.dat' al directori data/exercici3.
 * - Espera 1 segon abans de procedir.
 * - Llegeix l'arxiu 'Exercici3.dat' en una nova llista 'llista1'.
 * - Mostra les dades de 'llista1' per pantalla amb el format "Shuttle, US 1981",
 *   on cada línia representa una nau.
 * - El codi ha de ser capaç de manejar llistes de longitud variable.
 */

public class Exercici3 {
    public static void main(String args[]) {
        String basePath = System.getProperty("user.dir") + "/";
        String filePath = basePath + "Exercici3.dat";

        ArrayList<Exercici3nau> llista0 = new ArrayList<>();
        llista0.add(new Exercici3nau("Vostok", "USSR", 1961));
        llista0.add(new Exercici3nau("Mercury", "US", 1961));
        llista0.add(new Exercici3nau("Gemini", "US", 1965));
        llista0.add(new Exercici3nau("Soyuz", "Russia", 1967));
        llista0.add(new Exercici3nau("Apollo", "US", 1968));
        llista0.add(new Exercici3nau("Shuttle", "US", 1981));
        llista0.add(new Exercici3nau("Shenzhou", "Xina", 2003));
        llista0.add(new Exercici3nau("Crew Dragon", "US", 2020));

        // Escriure la llista0 a l'arxiu 'filePath'

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) { e.printStackTrace(); }

        // Llegir l'arxiu 'filePath' en una variable 'llista1'
        // i printa pel terminal cada un dels seus objectes línia a línia
    }  
}
