import java.util.*;
import java.io.*;

public class MatrixMult
{
    public static void main(String[] args) throws IOException
    {
        int [] [] matrixl, matrix2, matrix3;
        int i, j;
        String fileName;
        Scanner scanner, inFile;
        PrintWriter outFile;

        matrixl = new int [2][2];
        matrix2 = new int [2][2];
        matrix3 = new int [2] [2];

        scanner = new Scanner(System.in);
        System.out.print("Enter filename: ");
        fileName = scanner.next();

        inFile = new Scanner(new File(fileName));
        for(i=0; i<2; i++)
            for(j=0; j<2; j++)
                matrixl [i][j] = inFile.nextInt();
        for(i=0; i<2; i++)
            for(j=0; j<2; j++)
                matrix2[i][j] = inFile.nextInt();
        inFile.close();

        for(i=0; i<2; i++)
            for(j=0; j<2; j++)
                matrix3 [i][j] = matrixl [i] [0] *matrix2 [0][j] + matrixl [i] [1] *matrix2 [1][j];

        outFile = new PrintWriter(new FileWriter (fileName, true));
        outFile.println();
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
                outFile.print(matrix3 [i][j]+" ");
            outFile.println();
        }
        outFile.close();
    }
}


/*

D:\vishal\home-120324\continue>javac MatrixMult.java

D:\vishal\home-120324\continue>java MatrixMult
Enter filename: demo.txt

// Before

1 2
3 4
5 6
7 8

// After

1 2
3 4
5 6
7 8

19 22 
43 50 


*/