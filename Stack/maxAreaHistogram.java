package Stack;
import java.util.*;

public class maxAreaHistogram {

    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int[] nsr = new int[arr.length]; // Next Smaller Right
        int[] nsl = new int[arr.length]; // Next Smaller Left

        // Calculate Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            nsr[i] = s.isEmpty() ? arr.length : s.peek();
            s.push(i);
        }

        // Calculate Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        // Calculate the maximum area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Max Area of The Histogram is " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4,5,8,9,6};
        maxArea(arr);
    }
}
