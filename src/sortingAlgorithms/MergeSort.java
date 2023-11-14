package sortingAlgorithms;

import java.util.Random;
import java.util.random.RandomGenerator;

public class MergeSort {
    public static void main(String[] args) {
        int size = 100000000;
        int[] mainArray = new int[size];
        Random random = new Random();

        for(int i = 0; i < mainArray.length; i++) {
            mainArray[i] = random.nextInt(1000000);
        }

        long startTime = System.currentTimeMillis();
        mergeSort(mainArray);
        long endTime = System.currentTimeMillis();
        System.out.println("Sorting ran for " + (endTime-startTime) + "ms for an array of " + size + " integers.");

    }

    private static void printArray(int[] array) {
        for(int number : array) {
            System.out.println(number);
        }
    }

    private static void mergeSort(int[] mainArray) {
        if(mainArray.length < 2) {
            return;
        }

        int totalSize = mainArray.length;
        int leftSize = totalSize/2;
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[totalSize-leftSize];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftSize) {
            leftArray[i] = mainArray[k];
            i++;
            k++;
        }

        while(j<totalSize-leftSize) {
            rightArray[j] = mainArray[k];
            j++;
            k++;
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        mergeArrays(mainArray,leftArray,rightArray);

    }

    private static void mergeArrays(int[] mainArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int mainSize = mainArray.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                mainArray[k] = leftArray[i];
                i++;
            } else {
                mainArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<leftSize) {
            mainArray[k] = leftArray[i];
            i++;
            k++;
        }

        while(j<rightSize) {
            mainArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
