package lesson_03;

public class LoopFlowControlKeyWords {

    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            if(index == 8) {
                break;
            }
            System.out.println(index);
        }
    }
}
