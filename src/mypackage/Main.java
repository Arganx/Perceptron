package mypackage;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Perceptron perceptron = new Perceptron();
        perceptron.show();
       // System.out.println(guess);

        ArrayList<AND> and = new ArrayList<>();


        for(int a =0;a<100;a++)
        {
            and.add(new AND());
        }

        //and.add(new AND(0,0));
        //and.add(new AND(1,0));
        //and.add(new AND(0,1));
        //and.add(new AND(1,1));

        //test
        ArrayList<Integer> k = new ArrayList<Integer>();
        k.add(0);
        k.add(0);

        for(AND a: and)
        {
            perceptron.train(a.getIn(),a.getLabel());
            //System.out.println();
            //perceptron.show();
        }

        System.out.println(perceptron.guess(k));


        //System.out.println("Answer: "+perceptron.guess(k));

    }
}
