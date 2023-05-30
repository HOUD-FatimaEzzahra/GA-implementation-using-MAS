package ma.enset.sma;

import jade.core.Agent;
import ma.enset.GAUtils;
import ma.enset.Individual;

public class IslandAgent extends Agent {
    private Individual[] population=new Individual[GAUtils.POPULATION_SIZE];
    private Individual individual1;
    public Individual individual2;

}
