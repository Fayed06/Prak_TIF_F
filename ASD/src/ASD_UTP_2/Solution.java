package ASD_UTP_2;
import java.util.Stack;
import java.util.EmptyStackException;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int kurung1 = 0, kurung2 =0, kurung3 = 0;
        String input = read.nextLine();
        String[] kurung = input.split("");
        for(String K: kurung) {
            switch (K){
                case "{": case"}":
                    kurung1++;
                    break;
                case "(": case")":
                    kurung2++;
                    break;
                case "[": case"]":
                    kurung3++;
                    break;
            }
        }
        if(kurung1 % 2 == 0 && kurung2 % 2 == 0 && kurung3 % 2 == 0) {
            System.out.print("Seimbang ");
            int a = kurung1/2,b = kurung2/2,c = kurung3/2;
            int tot = a + b + c;
            System.out.println(tot);
        } else {
            System.out.println("Tidak Seimbang");
        }
    }
}
