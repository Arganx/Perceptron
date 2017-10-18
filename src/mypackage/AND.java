package mypackage;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by qwerty on 17-Oct-17.
 */
public class AND {
    private ArrayList<Integer> in;
    private Integer x;
    private Integer y;
    private int label;

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public int getLabel() {
        return label;
    }

    public ArrayList<Integer> getIn() {
        return in;
    }

    AND()
    {

        x= ThreadLocalRandom.current().nextInt(0,2);
        y= ThreadLocalRandom.current().nextInt(0,2);
        if(x.equals(1)&&x.equals(y))
        {
            label=1;
        }
        else
        {
            label=-1;
        }
        in = new ArrayList<Integer>();
        in.add(x);
        in.add(y);
    }
    AND(int a,int b)
    {
        x= a;
        y= b;
        if(x.equals(1)&&x.equals(y))
        {
            label=1;
        }
        else
        {
            label=-1;
        }
        in = new ArrayList<Integer>();
        in.add(x);
        in.add(y);
    }

    void show()
    {
       System.out.println("X: "+ x +"\nY: "+ y + "\n Wynik: " + label);
    }
}
