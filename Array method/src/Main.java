

public class Main {
    static int[] add(int[] arr, int a) {
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[temp.length - 1] = a;
        return temp;

    }

    static int[] pop(int[] arr) {
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    static int[] insert(int[] arr, int value, int index) {
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length+1; i++) {
        if(i<index){
            temp[i]=arr[i];
        }
        else if(i>index){
            temp[i]=temp[i-1];
        }
        else if(i==index){
            temp[i]=value;
        }
        }
            return temp;
        }


        public static void main (String[]args){

            int[] arr = {5, 6, 8};
            arr = add(arr, 9);
            arr = pop(arr);
            arr = insert(arr, 9, 2);
            System.out.println(arr[2]);


        }

    }

