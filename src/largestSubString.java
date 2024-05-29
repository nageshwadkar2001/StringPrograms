public class largestSubString {
    public static void main(String[] args) {
        String word="Hello to worldds of java";
        String [] arr=word.split(" ");
        String largest=arr[0];

        for (int i=1;i <arr.length;i++){
            if (largest.length() < arr[i].length()){
                    largest=arr[i];
            }
        }
        System.out.println("Largest : "+largest);
    }
}
