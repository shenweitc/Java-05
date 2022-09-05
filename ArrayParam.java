public class ArrayParam {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
       printArray(array);//传递的是地址
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
