public class FIFO{

    public static int count(int[] references, int frames, int pages) {
        int[] frame = new int[frames];
        int[] time = new int[frames];
        int t=-1;
        int result=0;
        for (int i = 0; i < frames; i++) {
            frame[i]=-1;
        }
        for (int r : references) {
            boolean b=false;
            for (int i = 0; i< frames; i++) {
                if (frame[i] == r) {
                    time[i]++;
                    b = true;
                    break;
                }
            }
            if (!b){
                result++;
                t++;
                if (t< frames){
                    frame[t]=r;
                    time[t]=0;

                }
                else {
                    int maxIndex=-1;
                    int maxValue=-1;
                    for (int j = 0; j< frames; j++) {
                        if (time[j]>maxValue){
                            maxIndex=j;
                            maxValue=time[j];
                        }
                    }
                    frame[maxIndex]=r;
                    time[maxIndex]=0;
                }
            }
            for (int k = 0; k< frames; k++) {
                time[k]++;
            }

        }

        return result;
    }
}
