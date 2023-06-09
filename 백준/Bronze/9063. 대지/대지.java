import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[]arr1 = new int[N];
        int[]arr2 = new int[N];
        
        for(int i = 0; i <N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.print((arr1[N-1]-arr1[0]) * (arr2[N-1]-arr2[0]));
    }
}