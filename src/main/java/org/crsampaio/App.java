package org.crsampaio;

import java.util.ArrayList;
import java.util.List;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class App {
    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public static int testandoBenchmark() {
        int itemEscolhido = 0;
        List<Integer> listaDeInteiros = new ArrayList<Integer>(10);

        for (int i = 1; i <= 10; i++) {
            listaDeInteiros.add(i);
        }

        for (int item : listaDeInteiros) {
            if (item == 10) {
                itemEscolhido = item;
            }
        }

        return itemEscolhido;
    }
}
