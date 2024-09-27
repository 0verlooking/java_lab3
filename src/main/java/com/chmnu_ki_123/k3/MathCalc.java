package com.chmnu_ki_123.k3;

import static java.lang.Math.*;

public class MathCalc {
    public static void main(String[] args) {
        double x = 0.5, a = 7.12, b = 8.12, c = 2.0;

        double expAx = exp(a * x);
        double tanBxC = tan(b * x + c);
        double log2AxC = log((a * x) - c) / log(2);
        double expBx2_1 = exp(b * pow(x, 2) - 1);

        double result = expAx * tanBxC + log2AxC / expBx2_1;

        System.out.printf("Result: %.3f\n", result);
    }
}
