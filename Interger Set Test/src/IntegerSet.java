import java.util.ArrayList;

public class IntegerSet {
    ArrayList<Integer> nums;

    IntegerSet(){
        nums = new ArrayList<>();
    }


    //Requires unique int
    //modifies this
    //effects insert num in the set unless it's already there, in which case do nothing
    public void insert(Integer num){
        if(!nums.contains(num)){
            nums.add(num);
        }
    }
    //requires int
    //modifies this
    //effects if the integer is in the set, remove it, otherwise do nothing
    public void remove(Integer num){
        if(nums.contains(num)){
            nums.remove(num);
        }
    }

    public  int size(){
        return nums.size();
    }

    public boolean contains(Integer num){
        return nums.contains(num);
    }
}
