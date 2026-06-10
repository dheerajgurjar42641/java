import java.util.ArrayList;

public class Mergesort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(4);
        System.out.println(arr);
        Mergesort(arr,0,arr.size()-1);
    }
    public static void Mergesort(ArrayList<Integer> arr,int low,int high){
        if(low>=high){
            return;}
        int mid;
        mid = (low+high)/2;
        Mergesort(arr,low,high);
        Mergesort(arr,low,mid);
        Mergesort(arr,mid+1,high);
        while(low<=mid && mid+1<=high){
            if(arr.get(low)<=arr.get(mid+1)){
                low++;
            }else{
                int temp = arr.get(low);
                arr.set(low,arr.get(mid+1));
                arr.set(mid+1,temp);
                low++;
                mid++;
            }
        }while(low<=mid){
            low++;
        }
        while(mid+1<=high){
            mid++;
        }
        System.out.println(arr);
    }
}
