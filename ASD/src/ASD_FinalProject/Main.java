package ASD_FinalProject;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();
        int jmlh = 1;

        try (Scanner fileReader = new Scanner(Paths.get("ASD/file.txt"))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if(!line.contains(",")) {
                    jmlh = Integer.valueOf(line);
                } else {
                    String[] parts = line.split(",");

                    Node node = new Node(Integer.valueOf(parts[0]),
                            Integer.valueOf(parts[1]));
                    q.addLast(node);
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file failed.");
        }

        q.FCFS(jmlh);
    }
}
