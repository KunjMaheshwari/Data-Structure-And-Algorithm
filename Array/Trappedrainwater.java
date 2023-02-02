// Time complexity will be O(n) because it is proportional to the height of the number of blocks given. 
public class Trappedrainwater {
    // function to find Trapped Rain water between the blocks
    public static int trapped(int height[]) {
        int width = 1;
        // left maximum boundary ( Auxillary Arrays- helper arrays)
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // right maximum boundary (Auxillary Arrays - helper arrays)
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        // trapped water
        int trappedwater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // Trapped water = (Waterlevel - height)* width of the block
            trappedwater += (waterlevel - height[i]) * width;
        }
        return trappedwater;
    }

    public static void main(String agrs[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapped(height));
    }
}