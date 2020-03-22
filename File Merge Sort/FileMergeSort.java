import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class FileMergeSort {
    static final int FILE_SIZE = 1024; 
    static boolean iter = true; // First iteration check
    static int runs = 0; // the run number
    static int count = 16; // the number of items per run

    public static void mergeSort(File oL, File oR, File nums) {
        while (count <= (FILE_SIZE / 2)) {
            distribute(oL, oR, nums);
            mergeFiles(oL, oR, nums);
        }
    }

    public static void distribute(File oL, File oR, File nums) {
        try {
            PrintWriter pwL = new PrintWriter(oL);
            PrintWriter pwR = new PrintWriter(oR);
            Scanner in = new Scanner(nums);
            int [] oLArr = new int[count];
            int [] oRArr = new int[count];
            while (in.hasNextInt()) {
                if (runs % 2 == 0) {
                    for (int i = 0; i < oLArr.length; i++) {
                        oLArr[i] = in.nextInt();
                    }
                    if (iter) {
                        sort(oLArr);
                    }
                    for (int i = 0; i < oLArr.length; i++) {
                        pwL.print(oLArr[i] + "\n");
                    }
                    runs++;
                }
                else {
                    for (int i = 0; i < oRArr.length; i++) {
                        oRArr[i] = in.nextInt();
                    }
                    if (iter) {
                        sort(oRArr);
                    }
                    for (int i = 0; i < oRArr.length; i++) {
                        pwR.print(oRArr[i] + "\n");
                    }
                    runs++;
                }
            }
            iter = false;
            pwL.close();
            pwR.close();
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }

    public static void mergeFiles(File oL, File oR, File nums) {
        try {
            Scanner inL = new Scanner(oL);
            Scanner inR = new Scanner(oR);
            PrintWriter pwO = new PrintWriter(nums);
            int[] arrL = new int[count];
            int[] arrR = new int[count];
            int l = 0;
            int j = 0;
            int k = 0;
            while(runs > 0) {
                for (int i = 0; i < count; i++) {
                    arrL[i] = inL.nextInt();
                }
                runs--;
                for (int i = 0; i < count; i++) {
                    arrR[i] = inR.nextInt();
                }
                runs--;

                l = 0;
                j = 0;
                k = 0;

                while (l < arrL.length || j < arrR.length) {
                    if (l >= arrL.length) {
                        pwO.print(arrR[j] + "\n");
                        j++;
                    }
                    else if (j >= arrR.length) {
                        pwO.print(arrL[l] + "\n");
                        l++;
                    }
                    else if (arrL[l] <= arrR[j]) {
                        pwO.print(arrL[l] + "\n");
                        if (l < arrL.length) {
                            l++;
                        }
                    }
                    else {
                        pwO.print(arrR[j] + "\n");
                        if (j < arrR.length) {
                            j++;
                        }
                    }
                }
            }
            count *= 2;
            inL.close();
            inR.close();
            pwO.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void sort(int[] arr) {
        boolean change = true;
        boolean flag = false;
        int temp; 
        while (change) {
            flag = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
            }
            if (flag) {
                change = true;
            }
            else {
                change = false;
            }
        }
    }

    public static void main(String[] args) {
        File outL = new File("outLeft.txt");
        File outR = new File("outRight.txt");
        File numbers = new File("numbers.txt");
        
        mergeSort(outL, outR, numbers);
    }
}