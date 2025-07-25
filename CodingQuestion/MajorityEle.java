import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityEle {
    public static void main(String[] args) {

        int[] nums = {3,2,3};

        List<Integer>res=new ArrayList<>();
        int n=nums.length;
        if(n>=1 && n<3){
            for(int i:nums){
                if(!res.contains(i)){
                    res.add(i);
                }
            }
            System.out.println(res);
        }
        else{

            Map<Integer,Integer>count=new HashMap<>();

            for(int val:nums){
                if(count.containsKey(val)){
                    count.put(val,count.get(val)+1);
                }
                else{
                    count.put(val,1);
                }
            }

            int totele=nums.length;
            for(Map.Entry<Integer,Integer>entry:count.entrySet())
            {
                int val=entry.getValue();
                if(val>(totele/3))
                {
                    res.add(entry.getKey());
                }
            }
            System.out.println(res);
        }
    }
}
