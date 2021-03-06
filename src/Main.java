import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.rmi.NotBoundException;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static final String INPUT= "Three tea cups for three hungry tigers with tinny tea cups for tinny tea cup tigers";

        public static void main(String[] args) {

        }
}

class Difference{
    int[] __elements;
    int maximumDifference;

    public Difference(int[] elements){
        this.__elements = elements;
    }

    public void computeDifference() {
        int min = __elements[0];
        int max = __elements[0];

        for(int x : __elements){
            if(x < min){
                min = x;
            }

            if(x > max){
                max = x;
            }
        }
        maximumDifference = Math.abs(max - min);
    }
}

