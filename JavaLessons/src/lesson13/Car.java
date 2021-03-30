package lesson13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Car/* implements Runnable */{
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private CyclicBarrier cb;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier cb) {
        this.race = race;
        this.speed = speed;
        this.cb = cb;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    public void prepare() throws InterruptedException, BrokenBarrierException {
        System.out.println(this.name + " готовится");
        Thread.sleep(500 + (int) (Math.random() * 800));
        System.out.println(this.name + " готов");
        cb.await();
    }

    public void start() throws BrokenBarrierException, InterruptedException {
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        cb.await();
    }
}
