package lesson8;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height ){
        this.height = height;
    }

    @Override
    public boolean pass(PhysicalAction physicalAction) {
       return physicalAction.jump(height);
    }
}
