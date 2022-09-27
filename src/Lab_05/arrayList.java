package Lab_05;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
            boolean isContinue = true;
            List<Integer> myArrayList = new ArrayList<>();
            while (isContinue) {
                printMenu();
                int userOption = getUserOption();
                switch (userOption) {
                    case 0:
                        isContinue = false;
                        break;
                    case 1:
                        addNumberToArrayList(myArrayList);
                        break;
                    case 2:
                        printArrayList(myArrayList);
                        break;
                    case 3:
                        getMaximumNumberWithTempVariable(myArrayList);
                        getMaximumNumberUseSet(myArrayList);
                        break;
                    case 4:
                        getMinimumNumberWithTempVariable(myArrayList);
                        getMinimumNumberUseCollectionsUtil(myArrayList);
                        break;
                    case 5:
                        searchAParticularNumber(myArrayList);
                        break;
                    default:
                        System.out.println("Unknown number!. Please try again.");
                }
            }
        }
        private static void printMenu() {
            System.out.println("=====MENU======");
            System.out.println("0. Exit!");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Search number");
        }
        private static int getNumberFromKeyboard() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

        private static String getOptionFromKeyboard() {
            Scanner scanner = new Scanner(System.in);
            return scanner.next();
        }

        private static int getUserOption() {
            System.out.print("Please choose your option: ");
            return getNumberFromKeyboard();
        }

        private static void addNumberToArrayList(List<Integer> arrayList) {
            System.out.print("Add number: ");
            arrayList.add(getNumberFromKeyboard());

            boolean isContinue = true;
            while (isContinue) {
                System.out.print("Do you want to add other number? (Y/N): ");
                String userSelection = getOptionFromKeyboard();
                if (userSelection.equalsIgnoreCase("Y")) {
                    System.out.print("Add number: ");
                    arrayList.add(getNumberFromKeyboard());
                } else isContinue = false;
            }
        }

        private static boolean isEmptyArray(List<Integer> arrayList) {
            return arrayList.isEmpty();
        }

        private static void printArrayList(List<Integer> arrayList) {
            if (isEmptyArray(arrayList)) {
                System.out.println("Array List is empty!");
                addNumberToArrayList(arrayList);
            } else {
                System.out.println("Array List is: " + arrayList);
            }
        }

        private static void getMaximumNumberWithTempVariable(List<Integer> arrayList) {
            if (isEmptyArray(arrayList)) {
                System.out.println("Array List is empty!");
            } else if (arrayList.size() == 1) {
                System.out.println("Maximum number is: " + arrayList.get(0));
            } else {
                int max = arrayList.get(0);
                for (int index = 1; index < arrayList.size(); index++) {
                    if (max < arrayList.get(index)) {
                        max = arrayList.get(index);
                    }
                }
                System.out.println("Maximum number is: " + max);
            }
        }

        private static void getMaximumNumberUseSet(List<Integer> arrayList) {
            if (isEmptyArray(arrayList)) {
                System.out.println("Array List is empty!");
            } else if (arrayList.size() == 1) {
                System.out.println("Maximum number is: " + arrayList.get(0));
            } else {
                Set<Integer> set = new HashSet<>(arrayList);
                List<Integer> setArrayList = new ArrayList<>(set);
                int lastIndex = setArrayList.size() - 1;
                int max = setArrayList.get(lastIndex);
                System.out.println("Maximum number is: " + max);
            }
        }

        private static void getMinimumNumberWithTempVariable(List<Integer> arrayList) {
            if (isEmptyArray(arrayList)) {
                System.out.println("Array List is empty!");
            } else if (arrayList.size() == 1) {
                System.out.println("Minimum number is: " + arrayList.get(0));
            } else {
                int min = arrayList.get(0);
                for (Integer value : arrayList) {
                    if (min > value) {
                        min = value;
                    }
                }
                System.out.println("Minimum number is: " + min);
            }
        }

        private static void getMinimumNumberUseCollectionsUtil(List<Integer> arrayList) {
            if (arrayList.isEmpty()) {
                System.out.println("Array List is empty!");
            } else if (arrayList.size() == 1) {
                System.out.println("Minimum number is: " + arrayList.get(0));
            } else {
                Collections.sort(arrayList);
                int min = arrayList.get(0);
                System.out.println("Minimum number by using Collections util " + min);
            }
        }

        private static void searchAParticularNumber(List<Integer> arrayList) {
            if (isEmptyArray(arrayList)) {
                System.out.println("Array List is empty!");
            } else {
                System.out.print("Please enter a number that you want to find: ");
                int numberToFind = getNumberFromKeyboard();
                if (!arrayList.contains(numberToFind)) {
                    System.out.println(numberToFind + " is not present in the list");
                } else {
                    System.out.println("--> The index of " + numberToFind + " is: " + arrayList.indexOf(numberToFind));
                }
            }
    }
}
