package aston;

import java.util.Arrays;

public class Action {
    public void evenNumbers (int[] startMassive){
        int finalMassiveLength = 0;
        for (int i = 0; i < startMassive.length; i ++) {
            if (startMassive[i] % 2 == 0)
            {
                finalMassiveLength++;
            }
            if (i == startMassive.length-1)
            {
                int [] result = new int [ finalMassiveLength];
                int resultNumber =0;
                for  (int t = 0; t < startMassive.length; t ++)
                {

                    if (startMassive[t] % 2 == 0)
                    {
                        result[resultNumber] = startMassive[t];
                        resultNumber++;
                    }
                    if (t == startMassive.length-1)
                    {
                        System.out.println("Четные числа: " + Arrays.toString(result));
                    }
                }
            }
        }
    }

}
