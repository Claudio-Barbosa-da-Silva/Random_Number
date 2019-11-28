
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class RandomAdapter implements RandomNumber {

    private Random random;

    public RandomAdapter() {
        random = new Random();

    }

    public RandomAdapter(long seed) {
        random = new Random(seed);

    }

    @Override
    public double getNumber() {
        return random.nextDouble();

    }

    @Override
    public double[] getNumber(int quant) {
        return random.doubles(quant).toArray();
    }

}
