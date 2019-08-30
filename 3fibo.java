class fibo{
    public static void getnum(int num){
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<num; i++){
            arr[i]= arr[i-1]+arr[i-2];
        }
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        getnum(10);
    }
}