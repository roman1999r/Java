import java.util.Arrays;

public class Collection {
    int arr[] = {1,7,8,6,23,4,2,5};

    public Collection(int[] arr) {
        this.arr = arr;
    }

    public Collection() {
    }
    Class aClass = new Class();
    Class2  class2 = new Class2();



    public class Class implements Iterator{


        @Override
        public void hasNext() {
            System.out.println("Масив: " + Arrays.toString(arr));
        }

        @Override
        public void next() {
            for (int i = 0; i < arr.length; i++){
                if(arr[i] % 2 == 1){
                    arr[i] = 0;
                }
            }
            System.out.println("Масив із заміною непарних елементів на '0': " + Arrays.toString(arr));
        }
    }

    public class Class2 implements Iterator{

        int arry[] = {2,4,5,6,1,7,4};

        @Override
        public void hasNext() {
            System.out.print("Масив: ");
            System.out.println(Arrays.toString(arry));

            int[] array = new int[arry.length];

            System.out.print("Обернений масив: ");
            System.out.print("[");
            for (int i = arry.length - 1, j = 0; i >= 0; i--,j++) {
                System.out.print(arry[i] + ", ");
                array[j] = arry[i];
            }
            System.out.print("]");
            System.out.println();
            System.out.print("Масив через 1 елемент: ");
            System.out.print("[");
            for (int j = 0; j<array.length; j++){
                if (j % 2 == 0){
                    System.out.print(array[j] + ", ");
                }
            }
            System.out.print("]");

        }

        @Override
        public void next() {
      }
    }

}
