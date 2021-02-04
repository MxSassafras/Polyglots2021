package Exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PolyglotsExercise1 {
    public static void main(String[] args){
        ServerRoom

        ReadInput("Test1");
    }

    private static void ReadInput(String name) {
        String inputPath = "C:\\Users\\jasoncfinley\\IdeaProjects\\Polyglots2021\\TestFiles\\" + name + ".txt";
        System.out.println(inputPath);

        try {
            File myObj = new File(inputPath);
            Scanner myReader = new Scanner(myObj);

            // Gather first line data
            String firstLine = MyReader.nextLine();

            int rows = firstLine.split(" ")[0];
            int slotsPerRow = firstLine.split(" ")[1];
            int unavailableSlotCount = firstLine.split(" ")[2];
            int poolCount = firstLine.split(" ")[3];
            int serverCount = firstLine.split(" ")[4];

            int unavailableStots[][] = new int[unavailableSlotCount][2];

            for (i = 0; i < unavailableSlotCount; i++) {
                String data = myReader.nextLine();
                unavailableStots[i] = { data.split(" ")[0], data.split(" ")[0] }
            }



            System.out.println(unavailableStots);

            /*
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            */
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}