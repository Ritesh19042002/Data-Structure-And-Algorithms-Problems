import java.util.Scanner;

public class MGMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sX, sY, dX, dY;
        String dir;

        System.out.println("INPUT:");
        System.out.print("SOURCE ");
        sX = scanner.nextInt();
        sY = scanner.nextInt();
        dir = scanner.next();

        System.out.print("DESTINATION ");
        dX = scanner.nextInt();
        dY = scanner.nextInt();

        int remainingPower = calculateRemainingPower(sX, sY, dX, dY, dir);
        System.out.println("\nOUTPUT:");
        System.out.println("POWER " + remainingPower);
    }

    public static int calculateRemainingPower(int sX, int sY, int dX, int dY, String direction) {
        int xTravel = Math.abs(dX - sX);
        int yTravel = Math.abs(dY - sY);

        // Calculate the turns needed to change direction in each dimension
        int turnsX = (dX > sX) ? 1 : (dX < sX) ? 1 : 0;
        int turnsY = (dY > sY) ? 1 : (dY < sY) ? 1 : 0;

        int totalTurns = turnsX + turnsY;
        int totalPowerLoss = xTravel + yTravel + (totalTurns * 5);

        return 200 - (totalPowerLoss);
    }
}
