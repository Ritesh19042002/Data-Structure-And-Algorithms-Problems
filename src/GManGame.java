import java.util.Scanner;

class Grid {
    private int[][] grid;

    public Grid() {
        this.grid = new int[7][7];
    }

    public boolean isValidCoordinate(int x, int y) {
        return x >= 0 && x <= 6 && y >= 0 && y <= 6;
    }
}

class GMan {
    private int power;

    public GMan(int initialPower) {
        this.power = initialPower;
    }

    public int getPower() {
        return power;
    }

    public void move(int distance) {
        power -= 10 * distance;
    }

    public void turn() {
        power -= 5;
    }
}

class GameManager {
    private GMan gMan;
    private Grid grid;

    public GameManager(GMan gMan, Grid grid) {
        this.gMan = gMan;
        this.grid = grid;
    }

    public void moveToDestination(int sourceX, int sourceY, String direction, int destX, int destY) {
        int distanceX = Math.abs(destX - sourceX);
        int distanceY = Math.abs(destY - sourceY);

        while (sourceX != destX || sourceY != destY) {
            if (sourceX < destX && grid.isValidCoordinate(sourceX + 1, sourceY)) {
                sourceX++;
                gMan.move(1);
            } else if (sourceX > destX && grid.isValidCoordinate(sourceX - 1, sourceY)) {
                sourceX--;
                gMan.move(1);
            } else if (sourceY < destY && grid.isValidCoordinate(sourceX, sourceY + 1)) {
                sourceY++;
                gMan.move(1);
            } else if (sourceY > destY && grid.isValidCoordinate(sourceX, sourceY - 1)) {
                sourceY--;
                gMan.move(1);
            } else {
                gMan.turn();
            }
        }
    }

    public int getRemainingPower() {
        return gMan.getPower();
    }
}

public class GManGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GMan gMan = new GMan(200);
        Grid grid = new Grid();
        GameManager gameManager = new GameManager(gMan, grid);

        int sourceX = 0, sourceY = 0; // Initialize these variables

        while (scanner.hasNext()) {
            String command = scanner.next();

            switch (command) {
                case "SOURCE":
                    sourceX = scanner.nextInt();
                    sourceY = scanner.nextInt();
                    String direction = scanner.next();
                    break;
                case "DESTINATION":
                    int destX = scanner.nextInt();
                    int destY = scanner.nextInt();
                    gameManager.moveToDestination(sourceX, sourceY, "", destX, destY); // Pass a dummy direction for now
                    break;
                case "PRINT_POWER":
                    System.out.println("POWER " + gameManager.getRemainingPower());
                    break;
            }
        }

        scanner.close();
    }
}
