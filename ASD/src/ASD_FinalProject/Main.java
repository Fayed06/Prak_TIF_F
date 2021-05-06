package ASD_FinalProject;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();

//        Node p1 = new Node(10, 5);
//        Node p2 = new Node(20, 6);
//        Node p3 = new Node(21, 5);
//        Node p4 = new Node(22, 4);
//        Node p5 = new Node(25, 3);
//        Node p6 = new Node(26, 6);
//        Node p7 = new Node(30, 5);
//        Node p8 = new Node(36, 4);
//        Node p9 = new Node(48, 5);
//
//        q.addLast(p1);
//        q.addLast(p2);
//        q.addLast(p3);
//        q.addLast(p4);
//        q.addLast(p5);
//        q.addLast(p6);
//        q.addLast(p7);
//        q.addLast(p8);
//        q.addLast(p9);
//        q.FCFS();

        try (Scanner fileReader = new Scanner(Paths.get("file.txt"))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");

                Node node = new Node(Integer.valueOf(parts[0]), Integer.valueOf(parts[1]));
                q.addLast(node);
            }
        } catch (Exception e) {
            System.out.println("Reading the file failed.");
        }

        q.FCFS();
    }
}
