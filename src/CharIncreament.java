public class CharIncreament {
    public  static void  incrementedString(String word){
        StringBuffer st=new StringBuffer();

        for (int i=0;i <=word.length()-1;i++){

            char currentChar=word.charAt(i);
            char incrementedChar;
            if (currentChar=='Z'){
                incrementedChar='A';
            } else if (currentChar=='z') {
                incrementedChar='a';
            }else {
                incrementedChar=(char)(currentChar +1);
            }
            st.append(incrementedChar);
        }
        System.out.println(st.toString());
    }
    public static void main(String[] args) {
        String word="XYZ";
        incrementedString(word);
    }
}
