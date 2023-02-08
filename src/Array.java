public class Array {
    private int [] array;

    public Array(int [] array){
        this.array=array;
    }
    public int indexOf(int n){
        int i =0;
        while(i< array.length){
            if(array[i]==n){
                return i;
            }
            i++;
        }
        return -1;
    }

}

