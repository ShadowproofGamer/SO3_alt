import java.util.Random;

import static java.lang.Math.abs;

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
    public static int[] generateIncLocality(int number, int pages){
        Random rand = new Random();
        int temp = 0;
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            int op = rand.nextInt(10);
            int r=temp;
            if (op<=0)r=abs(temp-1)%pages;
            else if (op<=1)r=abs(temp+1)%pages;
            else if (op>=8)r=rand.nextInt(pages);
            result[i]=r;
            temp=r;
        }
        return result;
    }
    public static int[] generateIncLocality2(int number, int pages){
        Random rand = new Random();
        int temp = 0;
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            int op = rand.nextInt(10);
            int r=temp;
            if (op<=3)r=abs(temp-1)%pages;
            else if (op<=7)r=abs(temp+1)%pages;
            else if (op>=9)r=rand.nextInt(pages);
            result[i]=r;
            temp=r;
        }
        return result;
    }
    public static int[] generateIncLocalityOptions(int number, int pages, int lower, int higher, int same, int random){
        System.out.println("jeden mniejsze: "+ lower+"\tjeden większe: "+ higher+"\ttakie same:"+ same+"\tlosowe:"+ random);
        Random rand = new Random();
        int temp = 0;
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            int op = rand.nextInt(lower+higher+same+random);
            int r=temp;
            if (op<=lower){
                r=temp-1;
                if (r<0)r+=pages;
            }
            else if (op<=(lower+higher))r=abs(temp+1)%pages;
            else if (op<=(lower+higher+random))r=rand.nextInt(pages);
            result[i]=r;
            temp=r;
        }
        return result;
    }

}
