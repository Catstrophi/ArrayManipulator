import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class arrayFInd {
    public static void main(String[] args) throws FileNotFoundException{
        String[][] arr = new String[5][5];
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                arr[i][j] = i + "" + j;
            }
        }
            Scanner scan = new Scanner(new File("D:\\CS\\javaproject\\src\\Other\\cdFile.txt"));
            int numLines = scan.nextInt();
            for(int i=0; i<numLines; i++) {
                int row = scan.nextInt();
                int col = scan.nextInt();
                System.out.println("\nPattern for (" + row + "," + col + "):\n");
                for(int j=row-2; j<=row+2; j++) {
                    for(int k=col-2; k<=col+2; k++) {
                        if(j<0 || j>=5 || k<0 || k>=5) {
                            System.out.print("** ");
                        } else if(j==row && k==col) {
                            System.out.print("<> ");
                        } else {
                            System.out.print(arr[j][k] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }


