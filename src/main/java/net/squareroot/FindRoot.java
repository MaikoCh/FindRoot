package net.squareroot;

import java.lang.Math;


public class FindRoot
{
    public double FindD(int a, int b, int c)
    {
        int D= b*b-4*a*c;
        return D;
    }

    public Solutions Solution(int a, int b, int c)
    {
        Double D = FindD(a, b, c);
        if (D<0) return null;

        double x1, x2;
        x1=(-b + Math.sqrt(D))/(2*a);
        x2=(-b - Math.sqrt(D))/(2*a);

        Solutions Result = new Solutions(x1, x2);
        return Result;
    }
}
