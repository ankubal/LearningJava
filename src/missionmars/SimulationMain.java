package missionmars;
import java.util.ArrayList;
public class SimulationMain {

	public static void main(String[] args) {
		Simulation simulation = new Simulation();
        ArrayList<Item> items = simulation.loadItems("abc.txt");

        ArrayList<Rocket> fleetR1 = simulation.loadRockets(items, new R1());
        int totalCostR1 = simulation.runSimulation(fleetR1);
        System.out.println("Total cost for R1 fleet: $" + totalCostR1);

        ArrayList<Rocket> fleetR2 = simulation.loadRockets(items, new R2());
        int totalCostR2 = simulation.runSimulation(fleetR2);
        System.out.println("Total cost for R2 fleet: $" + totalCostR2);
	}}