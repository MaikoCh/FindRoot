package net.squareroot;

public class Solutions
{
    double x1, x2;

    public Solutions(double z1, double z2)
    {
        this.x1=z1;
        this.x2=z2;
    }

    public static Solutions solutions(double z1, double z2)
    {
        Solutions result = new Solutions(z1, z2);
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Solutions)
        {
            Solutions sol = (Solutions) obj;
            return (this.x1 == sol.x1) && (this.x2 == sol.x2);
        }
        return false;
    }
}
