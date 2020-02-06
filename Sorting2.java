package edu.touro.mco264;

public class Sorting2 {

    public static void sort(int[] listSort){

        for(int arraySortMain = 0; arraySortMain < listSort.length - 1; arraySortMain++){
            for(int innerSwapIter = 1; innerSwapIter < listSort.length; innerSwapIter++){

                if(listSort[innerSwapIter - 1] > listSort[innerSwapIter]){
                    int smallerNum = listSort[innerSwapIter - 1];
                    listSort[innerSwapIter - 1] = listSort[innerSwapIter];
                    listSort[innerSwapIter] = smallerNum;
                }
            }
        }
    }


    public static void randomGen(int[] array) {

        for(int i = 0; i < array.length; i++) { // sets random numbers for each index
            array[i] = (int) (Math.random() * 1000000); // Generates a random number between 1 -> 1,000,000
        }
    }


    // I attached a screenshot to show some results
    public static void main(String[] args) {
        int[] list = new int[10000];
        //int[] testList = new int[] {81, 92, 16, 15, 13, 11, 9, 7};
        //int[] testList2 = new int[] {1234, 581, 599, 32, 918, 911, 930, 458};
        randomGen(list);
        for(int i: list){
            System.out.println(i);
        }
        System.out.println("\n" + "---Sorting---");
        sort(list);

        for(int i: list){
            System.out.println(i);
        }
    }
}
