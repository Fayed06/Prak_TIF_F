package ASD_FinalProject;
import java.util.Scanner;

class Queue {
    int size = 0;
    Node head;
    Node tail;

    boolean isEmpty(){
        return size == 0;
    }

    int size(){
        return this.size;
    }

    void addFirst(Node temp){
        if(isEmpty()){
            head = tail = temp;
            size++;
            return;
        }
        temp.next = head;
        head = temp;
        size++;
    }

    void addLast(Node temp){
        if(isEmpty()){
            head = tail = temp;
            size++;
            return;
        }
        tail.next = temp;
        tail = temp;
        size++;
    }

    void removeFirst(){
        if(isEmpty()){
            System.out.println("not found");
        }
        if(size == 1){
            head = tail = null;
        }else {
            Node temp = head;
            temp = temp.next;
            head = temp;
            temp = null;
        }
        size--;
    }

    void removeLast(){
        if(isEmpty()){
            System.out.println("not found");
        }
        if(size == 1){
            head = tail = null;
        } else {
            Node temp = head;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    void print(){
        if(isEmpty()){
            System.out.println("kosong");
            return;
        }
        Node temp = head;
        for(int i = 0; i < size; i++){
            System.out.print("Pelanggan " + (i+1) + ": " + temp.arrival + ", " + temp.bursttime + "\n");
            temp = temp.next;
        }
    }

    void sortData(){
        Node current = head;
        Node index = null;
        int arrivaltemp;
        int bursttemp;
        String namatemp;

        if (head == null){
            return;
        }

        else {
            while(current != null){
                index = current.next;
                while(index != null){
                    if(current.arrival > index.arrival){
                        arrivaltemp = current.arrival;
                        bursttemp = current.bursttime;
                        namatemp = current.nama;
                        current.arrival = index.arrival;
                        current.bursttime = index.bursttime;
                        current.nama = index.nama;
                        index.arrival = arrivaltemp;
                        index.bursttime = bursttemp;
                        index.nama = namatemp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    void FCFS(){
        Scanner in = new Scanner(System.in);
        if(isEmpty()){
            System.out.println("kosong");
            return;
        }
        Node temp = head;

        System.out.print("Jumlah layanan:");
        int queues = in.nextInt();

        Queue[] queue = new Queue[queues];
        int[][] wtime= new int[queues][size()];
        for (int i = 0; i < queues; i++) {
            queue[i] = new Queue();
        }
        int[] bPrev = new int[queues];
        int[] aPrev = new int[queues];

        int[] mulai = new int[queues];
        int[] selesai = new int[queues];
        int count = 0;
        int qtype = 0;

        double totalWT = 0;
        double rt = 0;

        System.out.println("" +
                "============================================================================================\n" +
                "| Pelanggan | Datang | Waktu Layanan |   	Queue 	   | Mulai  | Selesai | Waktu Tunggu |");
        while (count < size()){
            int[] times = new int[queues];

            if(wtime[qtype][0] != 0 || count == 0) {
                wtime[qtype][0] = 0;
            }else{
                wtime[qtype][count] = aPrev[qtype] + bPrev[qtype] - temp.arrival + wtime[qtype][count-1];
                if (wtime[qtype][count] < 0) {
                    wtime[qtype][count] = 0;
                }
            }

            mulai[qtype] = temp.arrival + wtime[qtype][count];
            selesai[qtype] = mulai[qtype] + temp.bursttime;

            queue[qtype].addLast(new Node((count + 1) + "", selesai[qtype]));
            while(queue[qtype].head.selesai < temp.arrival) {
                queue[qtype].removeFirst();
            }

            System.out.printf("%8S %8S %12S %22S %10S %7S %11S %n", temp.nama + " Q" + (qtype+1), temp.arrival, temp.bursttime, "Q" + (qtype+1) + ": " + queue[qtype].show(), mulai[qtype], selesai[qtype], wtime[qtype][count]);

            //ngitung rata-rata
            totalWT += wtime[qtype][count];


            bPrev[qtype] = temp.bursttime;
            aPrev[qtype] = temp.arrival;
            temp = temp.next;

            count++;

            if(count != 0 && count < size()){
                //jika masuk queue pertama kali
                for (int i = 0; i < queues; i++) {
                    if (wtime[i][0] != 0) {
                        qtype = i;
                    }
                }
                //menghitung waiting time setiap queue
                for (int i = 0; i < queues; i++) {
                    times[i] = selesai[i] - temp.arrival;
                    //if(times[i] < 0) times[i] = 0;
                }
                //membandingkan total waiting time setiap queue
                int temp2 = times[0];
                int change = 0;
                for (int i = 0; i < queues-1; i++) {
                    if (temp2<times[i+1]){
                        qtype = change;
                    } else {
                        change = i + 1;
                        qtype = change;
                        temp2 = times[i+1];
                    }
                }
            }
        }
        System.out.println("============================================================================================");

        rt = totalWT /this.size();

        System.out.printf("%-80s %f %n", "Rata-Rata Waktu Tunggu", rt);
    }

    String show() {
        if (isEmpty()) {
            return "";
        }
        Node n = head;
        String temp = "";
        while (n.next != null) {
            temp += n.data + " ";
            n = n.next;
        }
        temp += n.data;

        return temp;
    }
}
