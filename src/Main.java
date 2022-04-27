import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int pages = 5;
        int frames = 3;
        int num = 1000;
        int[] ref = Generator.generate(num, pages);
        //test references
        /*
        ref = new int[]{1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5};
        num = ref.length;
        frames=4;
        pages=5;

         */
        //systems
        System.out.println(FIFO.class+"  "+FIFO.count(ref, frames, pages));
        System.out.println(RAND.class+"  "+RAND.count(ref, frames, pages));
        System.out.println(OPT.class+"  "+OPT.count(ref, frames, pages));
        System.out.println(LRU.class+"  "+LRU.count(ref, frames, pages));
        System.out.println(ALRU.class+"  "+ALRU.count(ref, frames, pages));

    }
}
