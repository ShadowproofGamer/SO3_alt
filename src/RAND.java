import java.util.Random;

public class RAND {
    public static int count(int[] references, int frames, int pages) {
        Random myRandom = new Random();
        int[] frame = new int[frames];
        int result = 0;
        for (int i = 0; i < frames; i++) {
            frame[i] = -1;
        }
        for (int r : references) {
            boolean b = false;
            for (int i = 0; i < frames; i++) {
                if (frame[i] == r) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                result++;
                frame[myRandom.nextInt(frames)] = r;
            }
        }
        return result;
    }
}

