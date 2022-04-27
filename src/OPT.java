public class OPT {
    public static int count(int[] references, int frames, int pages) {
        int[] frame = new int[frames];
        int t=-1;
        int result=0;
        for (int i = 0; i < frames; i++) {
            frame[i]=-1;
        }
        
        for (int r : references) {
            t++;
            boolean b=false;
            for (int i = 0; i< frames; i++) {
                if (frame[i] == r) {
                    b = true;
                    break;
                }
            }
            if (!b){
                result++;
                if (t< frames){
                    frame[t]=r;
                    continue;
                }
                int[] next=new int[frames];
                for (int j=0;j<frames;j++) {
                    int p = frame[j];
                    int temp = -1;
                    for (int i = t; i < references.length; i++) {
                        if (references[i]!=p) temp++;
                        else break;
                    }
                    next[j]=temp;
                }
                int maxIndex=-1;
                int maxValue=-1;
                for (int j = 0; j< frames; j++) {
                    if (next[j]==-1){
                        maxIndex=j;
                        break;
                    }
                    if (next[j]>maxValue){
                        maxIndex=j;
                        maxValue=next[j];
                    }
                }
                frame[maxIndex]=r;
                next[maxIndex]=0;
            }
            

        }

        return result;
    }
}
