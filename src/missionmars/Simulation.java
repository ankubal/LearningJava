package missionmars;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Simulation {
	private static final int ROCKET_COST_R1 = 100000000;
    private static final int ROCKET_COST_R2 = 120000000;

    ArrayList<Item> loadItems(String fileName) {
        ArrayList<Item> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\binny\\Downloads\\abc.txt"))) {
            br.lines().map(line -> line.split("="))
                    .forEach(parts -> items.add(new Item(parts[0].trim(), Integer.parseInt(parts[1].trim()))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }

    ArrayList<Rocket> loadRockets(ArrayList<Item> items, Rocket rocketType) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket rocket = rocketType;
        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = rocketType;
                rocket.carry(item);
            }
        }
        rockets.add(rocket); 
        return rockets;
    }

    int runSimulation(ArrayList<Rocket> rockets) {
        return rockets.stream().mapToInt(rocket -> (rocket.launch() && rocket.land()) ? ROCKET_COST_R1 : 0).sum();
    }

	public static int getRocketCostR2() {
		return ROCKET_COST_R2;
	}
}

