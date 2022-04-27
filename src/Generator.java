import java.util.Random;

public class Generator {
    public static int[] generate(int number, int pages){
        Random rand = new Random();
        int temp = -1;
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            int r = rand.nextInt(pages);
            while(r==temp)r=rand.nextInt(pages);
            result[i]=r;
            temp=r;
        }
        return result;
    }
}
