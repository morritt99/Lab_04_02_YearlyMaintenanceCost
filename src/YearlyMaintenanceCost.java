
public class YearlyMaintenanceCost {
    public static void main(String[] args) {
        // Assuming these are tha maintenance costs for each season
        double winterCost = 450.0;
        double fallCost = 350.0;
        double summerCost = 100.0;
        double springCost = 200.0;

        // Calculate the total yearly maintenance cost
        double totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        // Output the costs for clarity
        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Total yearly maintenance cost: $" + totalYearlyCost);

        }
    }