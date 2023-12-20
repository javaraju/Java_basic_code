package Test;

public class ArrayRightRotation {
    public static void rotateRight(int array[], int numberOfRotation, int lengthOfArray) {
        for (int i = 0; i < numberOfRotation; i++)
            rotateArrayByOne(array, lengthOfArray);
    }

    public static void rotateArrayByOne(int array[], int lengthOfArray) {
        int temp = array[lengthOfArray - 1];
        for (int i = lengthOfArray - 1; i > 0; i--)
            array[i] = array[i - 1];
        array[0] = temp;
    }

    public static void main(String args[]) {
        int array[] = {1,4,7,2,9};
        int numberOfRotation = 1;
        int lengthOfArray = array.length;
        System.out.println("Array before rotation: ");
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        rotateRight(array, numberOfRotation, lengthOfArray);
        System.out.println("\nArray after right rotation: ");
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print(array[i] + " ");
        }
    }
}  