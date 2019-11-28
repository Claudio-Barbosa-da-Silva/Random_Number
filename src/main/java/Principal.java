
import java.util.Arrays;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args) {
        RandomNumber random = new RandomAdapter();
        System.out.println(random.getNumber());
        System.out.println(Arrays.toString(random.getNumber(2)));
        
        System.out.println();
        RandomNumber realDistribution;
        realDistribution = new RealDistributionAdapter(new NormalDistribution());
        System.out.println(realDistribution.getNumber());
        System.out.println(Arrays.toString(realDistribution.getNumber(2)));
        
        System.out.println();
        realDistribution
                = new RealDistributionAdapter(new LogNormalDistribution());
        System.out.println(realDistribution.getNumber());
        System.out.println(Arrays.toString(realDistribution.getNumber(2)));
    }
    
}
