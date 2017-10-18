package mypackage;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by qwerty on 17-Oct-17.
 */
public class Perceptron {
    private Double[] weights = new Double[2];
    private Double biasweight;
    private Double lr = new Double(0.1);

    public Double getLr() {
        return lr;
    }

    public void setLr(Double lr) {
        this.lr = lr;
    }

    private int activation(Double sum)
    {
        if(sum>=0.0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    Perceptron()
    {
        for(int i=0;i<weights.length;i++) {
            weights[i] = ThreadLocalRandom.current().nextDouble(-1, 1 + 1);
        }
        biasweight=ThreadLocalRandom.current().nextDouble(-1, 1 + 1);
    }

    public void show()
    {
        for(int i=0;i<weights.length;i++) {
            System.out.println(weights[i]);
        }
        System.out.println(biasweight);
    }

    public Integer guess(ArrayList<Integer> inputs)
    {
        Double sum= new Double(0.0);
            for(int i=0;i<weights.length;i++)
            {
                sum+=inputs.get(i)*weights[i];
            }
            sum+=biasweight;
        Integer out = activation(sum);
        return out;
    }

    public void train(ArrayList<Integer> input, Integer target)
    {

        int guess =guess(input);
        Integer error = target - guess;

        for(int i=0;i<weights.length;i++)
        {
            weights[i]+=error*input.get(i)*lr;
        }
        biasweight+=error*lr;

    }
}
