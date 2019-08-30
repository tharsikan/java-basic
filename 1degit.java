class degit{
    static int a = 12345;
    static String num = "";
    public static void main(String[] args) {
        while(a>0){
            num += Integer.toString(a%10);
            a = a/10;
        }
        System.out.println(num);
    }
    
}