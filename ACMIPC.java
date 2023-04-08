import java.io.*;
import java.util.*;
public class ACMIPC{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] bin = new String[N];
        boolean[][] b = new boolean[N][M];
        for (int i=0; i < N; i++){
            bin[i] = br.readLine();
            for (int k=0; k < M; k++){
                if (bin[i].charAt(k) == '1')
                    b[i][k] = true;
                else
                    b[i][k] = false;
            }
        }
        int max = 0;
        for (int i=0; i < N; i++){
            for(int j=0; j < N; j++){
              
                int cnt = 0;
                if (i != j){
                    for (int k=0; k < M; k++){
                        if ((b[i][k] == true) || (b[j][k] == true)){
                            cnt++;
                        }
                    }
                    if (cnt > max){
                        max = cnt;
                    }
                }
                
            }
        }
        int res = 0;
        for (int i=0; i < N; i++){
            for(int j=0; j < N; j++){
               
                int cnt = 0;
                if (i != j){
                    for (int k=0; k < M; k++){
                        if ((b[i][k] == true) || (b[j][k] == true)){
                            cnt++;
                        }
                    }
                    if (cnt == max){
                        res++;
                    }
                }
                
            }
        }
        
        System.out.println(max);
        System.out.println(res/2);
        
    }
}