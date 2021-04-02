package lesson8;

public class RunningTrack implements Obstacle {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean pass(PhysicalAction physicalAction) {
        return physicalAction.run(length);
    }
}
