package com.solvd;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[][] myArray = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1},                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        int startX = 0;
        int startY = 0;
        int endX = 0;
        int endY = 0;
        int counter = 1;
        Map<String, Integer> coordinates = new HashMap<>();

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                if (myArray[i][j] == 0) {
                    startX = i; //2
                    startY = j; //3
                    while (myArray[i][j = j + 1] == 0) {
                        if (myArray[i][j + 1] == 1) {
                            endY = j; //5
                            while (myArray[i = i + 1][j] == 0) {
                                if (myArray[i + 1][j] == 1) {
                                    endX = i; //3
                                    int width = endY - startY + 1;
                                    int height = endX - startX + 1;
                                    coordinates.put("Figure " + counter + ": Width", width);
                                    coordinates.put("Figure " + counter + ": Height", height);
                                    counter++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        //Print Lambda
        coordinates.forEach((key, value) -> System.out.println(key + ": " + value));

        /*
        //Print For loop
        System.out.println("\nPrint with for Loop");
        for (Map.Entry<String, Integer> entry : coordinates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        */
    }
}