public class FloorOfX {
    public static int findFloor(int[] array,int n){
        int x =-1;
        for(int i =0;i< array.length;i++){
            if(array[i]>n){
              x = array[i-1];
              break;
            }else continue;
        }
    return x;
    }

    public static void main(String[] args) {
        int[] array = {1,2,8,10,10,12,19};
        int result = findFloor(array,22);
        System.out.println(result);

    }

}
