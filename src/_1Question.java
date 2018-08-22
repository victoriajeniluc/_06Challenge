/**
 * Question 1:
 * Write a java program to create an array of 8 * 8 size [to resemble chess board]
 * and initialize all the array elements starting from 1 till 64 (using for loop) as follows:
 * 1	2	3	4	5	6	7	8
 * 9	10	11	12	13	14	15	16
 * 17	18	19	20	21	22	23	24
 * 25	26	27	28	29	30	31	32
 * 33	34	35	36	37	38	39	40
 * 41	42	43	44	45	46	47	48
 * 49	50	51	52	53	54	55	56
 * 57	58	59	60	61	62	63	64
 *
 * Write a nested for loop to print all the elements of 2-Dimensional array in above format.
 *
 * @author Udayan Khattry
 */
public class _1Question {
    public static void main(String[] args) {
        int [][] arr = new int[8][8]; //2-D symmetrical array of 8 rows and 8 columns



        int counter = 1;
        for(int i = 0; i < arr.length; i++) {
            //1st dimension is 8, so board.length is always 8
            for(int j = 0; j < arr[i].length; j++) {
                //2nd dimension is fixed to 8, hence each row has 8 elements thus board[i].length is always 8 for all the value of i.
                arr[i][j] = counter++;
            }
        }

        System.out.println("Printing 2-D array of 8 x 8:");
        // Print above array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();// Code to print new line
        }
    }
}
