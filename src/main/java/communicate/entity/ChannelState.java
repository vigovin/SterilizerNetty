package communicate.entity;

import communicate.constants.State;
import entity.Sterilizer;

public class ChannelState {
    private String sterilizerId;
    private State state;

    public ChannelState() {
        this.sterilizerId = null;
        this.state = State.WAITING;
    }

    public String getSterilizerId() {
        return sterilizerId;
    }

    public void setSterilizerId(String sterilizerId) {
        this.sterilizerId = sterilizerId;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
