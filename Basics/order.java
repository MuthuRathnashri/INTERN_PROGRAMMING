package Lab2;

public class order {
    public static void main(String[] args){
        int[][] arr = new int[3][5];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++){
                System.out.print("sales["+i+"]["+j+"]   ");
            }
            System.out.println();
        }
    }
}
