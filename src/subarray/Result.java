package subarray;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Result {
    public static int shortarray(List<Integer> a) {


        int totalSum=0;
        Set<Integer> eachNum = new HashSet<>();

        for(int i =0; i< a.size(); i++)
        {
            eachNum.add(a.get(i));
        }
        Integer[] eachNum2 = eachNum.toArray(new Integer[eachNum.size()]);


        for(int i =0; i<eachNum2.length; i++)
        {
            int sum =0;
            for(int j = 0; j< a.size(); j++)
            {
                if(eachNum2[i] -a.get(j)<=1 && eachNum2[i]-a.get(j) >= 0)
                {
                    sum++;
                }
                if(totalSum< sum)
                {
                    totalSum = sum;
                }

            }
            sum =0;
            for(int j = 0; j<a.size(); j++)
            {
                if(a.get(j)- eachNum2[i]<=1 && a.get(j) - eachNum2[i] >= 0)
                {
                    sum++;
                }
                if(totalSum< sum)
                {
                    totalSum = sum;
                }
            }
        }

        return(totalSum);

    }

}
