package ma.enset.sma;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
import jade.wrapper.StaleProxyException;
import ma.enset.GAUtils;

public class SimpleContaner {
    public static void main(String[] args) throws ControllerException {
        Runtime runtime=Runtime.instance();
        ProfileImpl profile=new ProfileImpl();
        profile.setParameter(Profile.MAIN_HOST,"localhost");
        AgentContainer agentContainer=runtime.createAgentContainer(profile);
        for (int i = 0; i< GAUtils.ISLAND_NUMBER; i++){
            AgentController islandAgent= agentContainer.createNewAgent("IslandAgent"+i,IslandAgent.class.getName(),new Object[]{});
            islandAgent.start();
        }
        AgentController masterAgent = agentContainer.createNewAgent("MasterAgent",MasterAgent.class.getName(),new Object[]{});
        masterAgent.start();
    }
}
