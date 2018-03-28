import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by torak on 28.03.2018.
 * Finds the largest 20 numbers in and sorts them to the front using insertionSort
 */
public class Largest20 {

    static int[] sortingarray;

    public static void main(String[] args){
        sortingarray = lesFil(args[0]);
        insertSortStart();
        findLarger();
        for (int i: sortingarray) System.out.println(i);

    }

    public static void findLarger(){
        int temp;
        for(int i = 19; i < sortingarray.length;i++){
            if(sortingarray[i] > sortingarray[19]){
                temp = sortingarray[i];
                sortingarray[i] = sortingarray[19];
                insertOne(temp);
            }
        }
    }

    public static void insertOne(int toFront){
        int i = 18;
        while(i >= 0 && sortingarray[i] < toFront){
            sortingarray[i+1] = sortingarray[i];
            i--;
        }
        sortingarray[i+1] = toFront;
    }


    public static void insertSortStart () {
        int i , t ;
        for ( int k = 0 ; k < 19 ; k++) {
            t = sortingarray[k+1] ;
            i = k ;
            while ( i >= 0 && sortingarray[i] < t ) {
                sortingarray[i+1] = sortingarray[i] ;
                i--;
            }
            sortingarray[i+1] = t ;
        }
    }


    public static int[] lesFil(String filnavn){
        int[] arr;
        try{
        Scanner s = new Scanner(new File(filnavn));
        arr = new int[Integer.parseInt(s.nextLine())];
        int cnt=0;
        while(s.hasNext()) arr[cnt++] = Integer.parseInt(s.nextLine());
        return arr;
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
