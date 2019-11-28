
import org.apache.commons.math3.distribution.RealDistribution;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class RealDistributionAdapter implements RandomNumber {

    private RealDistribution random;

    public RealDistributionAdapter(RealDistribution random) {
        this.random = random;
    }

    public RealDistributionAdapter(RealDistribution random, long seed) {
        this(random);
        random.reseedRandomGenerator(seed);

    }

    @Override
    public double getNumber() {
        return random.sample();
    }

    @Override
    public double[] getNumber(int quant) {
        return random.sample(quant);
    }

    
}
