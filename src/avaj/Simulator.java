import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Point d'entrée du programme Avaj Launcher (version simplifiée).
 * 
 * Étapes principales :
 * 1. Récupère le fichier scenario.txt passé en argument.
 * 2. Lit la première ligne pour obtenir le nombre de cycles météo.
 * 3. Lit les lignes suivantes pour créer les avions via la Factory.
 * 4. Stocke les avions dans une liste.
 * 5. Exécute la simulation : à chaque cycle, tous les avions réagissent à la météo.
 * 
 * Les résultats s'affichent dans la console.
 */
public class Simulator {

	/**
     * Exécute la simulation météo.
     * @param aircraftList liste des avions à simuler
     * @param cycles nombre de cycles météo
     */
    public static void runSimulation(ArrayList<Aircraft> aircraftList, int cycles) {
        WeatherTower tower = new WeatherTower();
        for (int c = 0; c < cycles; ++c) {
            for (Aircraft plane : aircraftList) {
                tower.changeWeather(plane);
            }
        }
	}
	/**
	 * Lit le contenu d'un fichier scénario et crée une liste d'avions.
	 * @param br BufferedReader déjà ouvert sur le fichier
	 * @return liste des avions créés
	 * @throws IOException si un problème de lecture survient
	 */
	public static ArrayList<Aircraft> parseAircrafts(BufferedReader br) throws IOException {
	    ArrayList<Aircraft> aircraftList = new ArrayList<>();
	    String line;

	    while ((line = br.readLine()) != null) {
	        String[] parts = line.split(" ");
	        String type = parts[0];
	        String name = parts[1];
	        int longitude = Integer.parseInt(parts[2]);
	        int latitude  = Integer.parseInt(parts[3]);
	        int height    = Integer.parseInt(parts[4]);

	        Aircraft plane = AircraftFactory.newAircraft(type, name, longitude, latitude, height);
	        aircraftList.add(plane);
	    }

	    return aircraftList;
	}



    public static void main(String[] args) {
	    try {

			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			String firstLine = br.readLine();
			int cycles = Integer.parseInt(firstLine);
			ArrayList<Aircraft> aircraftList = new ArrayList<>();
			
			// Création d'une liste d'avion
			aircraftList = parseAircrafts(br);

	        // Simulation
	        runSimulation(aircraftList, cycles);

	        br.close();
	    }
	    catch (IOException e) {
	        System.out.println("error reading file");
	    }
	    catch (NumberFormatException e) {
	        System.out.println("error: first line must be a number");
	    }
	}
}
