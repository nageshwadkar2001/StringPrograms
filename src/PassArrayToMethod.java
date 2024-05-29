public class PassArrayToMethod {
    public static void square(int [] num){
        System.out.println("Square of the elements : ");
        for (int i=0;i<num.length;i++){
            int result =num[i]*num[i];
            System.out.print(result+" ");
        }

    }
    public static void main(String[] args) {
        int [] num={1,2,3,4};
       square(num );

    }
}
