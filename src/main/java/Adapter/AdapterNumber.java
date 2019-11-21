/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Random;
import static java.util.stream.DoubleStream.builder;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;

/**
 *
 * @author aluno
 */
public class AdapterNumber implements Numeros {

    @Override
    public double buscaNumeros(double sample) {
        
        final long seed = 123;
        RealDistribution normalRandom = new NormalDistribution();
        normalRandom.reseedRandomGenerator(seed);

        RealDistribution exponentialRandom = new LogNormalDistribution();
        exponentialRandom.reseedRandomGenerator(seed);

        Random random = new Random(seed);
   
    return buscaNumeros(sample);
    }
}
