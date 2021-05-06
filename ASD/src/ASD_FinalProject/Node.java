package ASD_FinalProject;

class Node {
    Node next;
    int arrival;
    int bursttime;
    String nama = "P";
    static int count = 1;
    String data;
    int selesai;

    public Node(String data, int selesai){
        this.selesai = selesai;
        this.data = data;
    }

    public Node(int arrival, int bursttime){
        this.nama = this.nama + count;
        this.arrival = arrival;
        this.bursttime = bursttime;
        count++;
    }
    public Node (String nama, int arrival, int bursttime){

    }
}

