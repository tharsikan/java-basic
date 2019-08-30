class factors{
    public static void facto(int num){
        int[] fact = new int[num];
        for(int i = 1; i<= num;i++){
            if(num % i == 0){
                fact[i-1] = i;
            }
        }
        for(int i = 0; i< num;i++){
            if(fact[i] != 0){
                System.out.print(fact[i] +"   ");
            }           
        }
    }
    public static void main(String[] args) {
        facto(32);
    }
}