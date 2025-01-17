package com.practice.understanding;

public class BangladeshFlag {
    public static void main(String[] args) {
        // Dimensions of the flag
        int width = 40;
        int height = 20;
        
        // Coordinates of the center of the red circle (approximated)
        int centerX = 15;
        int centerY = 10;
        int radius = 5;

        // Loop over each row of the flag
        for (int y = 0; y < height; y++) {
            // Loop over each column of the flag
            for (int x = 0; x < width; x++) {
                // Check if the current point (x, y) is within the red circle
                if (Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) <= Math.pow(radius, 2)) {
                    System.out.print("R"); // Red circle
                } else {
                    System.out.print("G"); // Green background
                }
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}