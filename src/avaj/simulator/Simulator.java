package avaj.simulator;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import avaj.aircraft.Aircraft;
import avaj.aircraft.AircraftFactory;

public class Simulator {

    // public static void runSimulation(ArrayList<Aircraft> aircraftList, int cycles) {
    //     WeatherTower tower = new WeatherTower();
    //     for (int c = 0; c < cycles; ++c) {
    //         for (Aircraft plane : aircraftList) {
    //             tower.changeWeather(plane);
    //         }
    //     }
	// }
	// public static ArrayList<Aircraft> parseAircrafts(BufferedReader br) throws IOException {
	//     ArrayList<Aircraft> aircraftList = new ArrayList<>();
	//     String line;

	//     while ((line = br.readLine()) != null) {
	//         String[] parts = line.split(" ");
	//         String type = parts[0];
	//         String name = parts[1];
	//         int longitude = Integer.parseInt(parts[2]);
	//         int latitude  = Integer.parseInt(parts[3]);
	//         int height    = Integer.parseInt(parts[4]);

	//         Aircraft plane = AircraftFactory.newAircraft(type, name, longitude, latitude, height);
	//         aircraftList.add(plane);
	//     }

	//     return aircraftList;
	// }

    public static void main(String[] args) {
	    try {

			if (args.length == 0) {
				  // ⚠️ remplacer par Logger.log dans la version finale
    			System.out.println("Usage: java Simulator <scenario file>");
    			return;
			}

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
	        System.out.println("error reading file"); // ⚠️ Remplacer par Logger 
	    }
	    catch (NumberFormatException e) {
	        System.out.println("error: first line must be a number"); // ⚠️ Remplacer par Logger 
	    }
	}
}
