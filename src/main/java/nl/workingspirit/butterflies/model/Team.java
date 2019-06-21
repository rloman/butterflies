package nl.workingspirit.butterflies.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Team {

    @Autowired
    private Player wietse;

    @Autowired
    private Player frank;

    @Autowired
    private Player eline;

    public Player getWietse() {
        return wietse;
    }

    public Player getFrank() {
        return frank;
    }

    public Player getEline() {
        return eline;
    }
}
