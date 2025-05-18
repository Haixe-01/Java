package _12_oops;

public class Plant extends Organism {

    String photosinthesize;

    void photosinthesize() {
        System.out.println("The plat is photozinthesizing");
    }

    @Override
    void move() {
        System.out.println("This is a plant it can't move");
    }
}
