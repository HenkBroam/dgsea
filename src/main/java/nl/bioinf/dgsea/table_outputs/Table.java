package nl.bioinf.dgsea.table_outputs;

import nl.bioinf.dgsea.data_processing.Deg;
import nl.bioinf.dgsea.data_processing.Pathway;
import nl.bioinf.dgsea.data_processing.PathwayGene;

import java.util.List;

public abstract class Table {
    public static List<Deg> degs;
    public static List<Pathway> pathways;
    public static List<PathwayGene> pathwayGenes;

    public String getTwoByTwoContingencyTable() throws Exception {
        throw new Exception("Not implemented yet");
    }

    private int getSumInPathway() throws Exception {
        throw new Exception("Not implemented yet");
    }

    private int getSumTotalPathway() throws Exception {
        throw new Exception("Not implemented yet");
    }

    private int getSumIsSignificantDeg() throws Exception {
        throw new Exception("Not implemented yet");
    }

    private int getSumTotalDeg() throws Exception {
        throw new Exception("Not implemented yet");
    }
}

