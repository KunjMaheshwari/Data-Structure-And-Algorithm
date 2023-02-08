public class Shortestpath {
    public static float getShortest(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // South
            if (direction == 'S') {
                y--;
            }
            // North
            else if (direction == 'N') {
                y++;
            }
            // East
            else if (direction == 'E') {
                x++;
            }
            // West
            else {
                x--;
            }

        }
        int x2 = (x * x);
        int y2 = (y * y);
        return (float) Math.sqrt(x2 + y2); // formula of displacement
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(getShortest(path));
    }
}
/*
 * Logic behind the code will be
 * N - y+1
 * S - y-1
 * E - x+1
 * W - x-1
 */
