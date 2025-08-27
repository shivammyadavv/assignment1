import java.util.*;
public class cricketscore {
    public static void main(String[] args) {
        int []arr= new int[11];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<11;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=100){
                System.out.println("Player "+(i+1)+" is a centurion");
            }
        }
        Arrays.sort(arr);
        int h=arr[10];
        int l=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg=sum/11;
        System.out.println("Highest: "+h);
        System.out.println("Lowest Score: "+l); 
        System.out.println("Average Score: "+avg);

        
    }
}
