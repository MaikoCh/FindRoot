package net.squarerootTest;

import net.squareroot.FindRoot;
import net.squareroot.Solutions;
import org.testng.Assert;
import org.testng.annotations.Test;
//import


public class squarerootTest
{
    @Test
    public void Dlesszero()
    {
        FindRoot Result=new FindRoot();
        Assert.assertNull(Result.Solution(3, -4, 2), "the result is not null");
    }

    @Test
    public void Diszero()
    {
        FindRoot Result=new FindRoot();
        Solutions Expected = new Solutions(-6, -6);
        Assert.assertEquals(Result.Solution(1, 12, 36), Expected, "the result is not the same number!");
    }

    @Test
    public void Dmorezero()
    {
        FindRoot Result=new FindRoot();
        Solutions Expected = new Solutions(5, -1);
        Assert.assertEquals(Result.Solution(1, -4, -5), Expected, "the result is not correct!");
    }
}
