package Coba;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int n, m, v, w;
        String x = read.nextLine();
        n = read.nextInt();
        m = read.nextInt();
        Graph gr1 = new Graph(n);
        int ctr = 0;
        if (x.equals("Directed")) {
            ctr = 1;
        } else if (x.equals("Undirected")) {
            ctr = 2;
        }
        for (int i = 0; i < m; i++) {
            v = read.nextInt();
            w = read.nextInt();
            if (ctr == 2) {
                gr1.addEdge(v, w);
                gr1.addEdge(w, v);
            } else {
                gr1.addEdge(v, w);
            }
        }
        int s = read.nextInt();
        gr1.BFS(s);
        System.out.println();
        gr1.DFS(s);
    }
}

class Graph {

    private int V;

    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        //Isi dengan kodingan untuk melakukan penambahan edge ke linked list sesuai tipenya
        adj[v].add(w);
    }

    void DFS(int s) {
        //Isi dengan kodingan untuk melakukan traversal secara DFS
        boolean visit[] = new boolean[V];
        LinkedList<Integer> stack = new LinkedList<Integer>();
        visit[s] = true;
        stack.addLast(s);

        for (int i = 0; stack.size() != 0; i++) {
            s = stack.removeLast();
            System.out.print(s + " ");

            for (int j = adj[s].size() - 1; j >= 0; j--) {
                int x = adj[s].get(j);
                if (!visit[x]) {
                    visit[x] = true;
                    stack.addLast(x);
                }
            }
        }
    }

    void BFS(int s) {
        //Isi dengan kodingan untuk melakukan traversal secara BFS
        boolean visit[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visit[s] = true;
        queue.addLast(s);

        for (int i = 0; queue.size() != 0; i++) {
            s = queue.removeFirst();
            System.out.print(s + " ");

            for (int j = 0; j < adj[s].size(); j++) {
                int x = adj[s].get(j);
                if (!visit[x]) {
                    visit[x] = true;
                    queue.addLast(x);
                }
            }
        }
    }
}
