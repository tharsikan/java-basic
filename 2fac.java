class fac{
    public static int getnum(int num){
        int fact = 1;
        while(num > 0){
            fact *= num ;
            num = num -1;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(getnum(5)); 
    }
}