import java.util.ArrayList;
import java.util.List;

public class PosNegAlternative {

    public static void main(String[] args) {
        int[]arr={-1, 2,9,9,7,4,-3,8,9,6,-5,-4, 5, -6};

        List<Integer>pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();

        for (int num:arr)
        {
            if(num>=0){
                pos.add(num);
            }
            else {
                neg.add(num);
            }
        }
        System.out.println(pos);
        System.out.println(neg);

        List<Integer>output=new ArrayList<>();
        //merge both
//        int i=0, poscount=0, negcount=0;
//
//        while (arr.length>i){
//             output.add(pos.get(poscount++));
//            output.add(neg.get(negcount++));
//
//            i++;
//        }
//        int i=0,j=0;
//        while (i<pos.size() && j<neg.size())
//        {
//            output.add(pos.get(i++));
//            output.add(neg.get(j++));
//        }

        int i=0,j=0;
        if(pos.size()==neg.size())
        {
            int z=0;
            while (pos.size()>z){
                output.add(pos.get(i++));
                output.add(neg.get(j++));
                z++;
            }
            System.out.println(output);
        }
        else
        {
                while (i<pos.size() && j<neg.size())
                {
                    output.add(pos.get(i++));
                    output.add(neg.get(j++));
                }
                while (i<pos.size())output.add(pos.get(i++));
                while (j<neg.size())output.add(neg.get(j++));

            System.out.println(output);
        }


    }


}
