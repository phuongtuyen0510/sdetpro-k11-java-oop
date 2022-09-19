package lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        int[] myIntArray = new int[5];

        //Iterate
//        for (int index = 0; index < 5; index++) {
//            myIntArray[index] = index++;
//
//            /*
//            * arr[0] = 0 --> index = 1 --> index = 2
//            * arr[2] = 2 ---> index = 3 ---> index = 4
//            * arr[4] = 4 ---> index = 5 ---> index = 6
//            *
//            * */
//        }

            //Iterate
           for (int index = 0; index < 5;) {
               myIntArray[index++] = index;


                /*
                 * arr[0] = 1 --> index = 1
                 * arr[1] = 2 ---> index = 2
                 * arr[2] = 3 ---> index = 3
                 *
                 * */
            }
//        //Print out values
//        for (int index = 0; index < ARRAY_LENGTH; index++) {
//            System.out.println(myIntArray[index]);
//        }

//        for (int value : myIntArray){
//            System.out.println(value);
//        }

        for (int array_length = ARRAY_LENGTH ; array_length > 0; array_length--) {
            System.out.println(myIntArray[array_length]);

        }

    }
}
