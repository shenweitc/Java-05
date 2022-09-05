public class getMax {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("最大的数是："+max);
    }
}
