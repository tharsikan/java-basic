class countAlp{
    public static boolean check(char let){
        boolean isAlp = false;
        if(let == 'A' || let == 'E' || let == 'I' || let == 'O' || let == 'U' ||
        let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u'){
            isAlp = true;
        }
        return isAlp;
    }
    public static void main(String[] args) {
        String word = "Alphabet";
        int len = word.length();
        int count = 0;
        for(int i = 0; i<len; i++){
            if(check(word.charAt(i))){
                count++;
            }
        }
        System.out.println("No of Vowels : "+count+" & consonants : "+(len - count));
    }
}