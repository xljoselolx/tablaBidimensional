public class Ejercicio12 {
    int [][] marco= new int [5][15];
    {
        for (int i=0; i < marco.length; i++)
        {
            for (int j = 0; j < marco[i].length; j++)
            {
                if (i == 0 || j == marco[i].length - 1)
                {
                    marco[i][j] = 1;
                } else
                    {
                    marco[i][j] = 0;
                }
            }
        }
            for (int i = 0; i < marco.length; i++)
            {
                for (int j = 0; j < marco[i].length; j++)
                {
                    System.out.println(marco[i][j] + " ");
                }
            }


    }
}
