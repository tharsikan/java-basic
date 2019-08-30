class alphabet{
    public static boolean check(char let){
        boolean isAlp = false;
        if(let == 'A' || let == 'E' || let == 'I' || let == 'O' || let == 'U' ||
        let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u'){
            isAlp = true;
        }
        return isAlp;
    }

    public static boolean check2(char let){
        boolean isAlp = false;
        switch(let){
            case 'A': case 'E': case 'I': case 'O': case 'U': case 'a': case 'e': case 'i': case 'o': case 'u':
                isAlp = true;
                break;
            
            default:
                isAlp = false;
                break;
            
        }

        return isAlp;
    }

    public static void main(String[] args) {
        if(check('e')){
            System.out.println("is Alphabet");
        }else{
            System.out.println("is not an Alphabet");
        }
        if(check2('B')){
            System.out.println("is Alphabet");
        }else{
            System.out.println("is not an Alphabet");
        }
    }
}