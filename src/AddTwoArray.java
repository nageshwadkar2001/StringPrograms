public class AddTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7, 8, 9};
        int l = arr1.length + arr2.length;

        int[] resultArray = new int [l];

        for (int i=0;i< arr1.length;i++)
        resultArray[i] = arr1[i];

        for (int i=0;i <arr2.length;i++)
            resultArray[arr1.length + i]=arr2[i];

        for (int result : resultArray) {
            System.out.print(result+ " ");
        }
    }
}
