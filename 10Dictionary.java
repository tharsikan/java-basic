class Dictionary{
    static String sent = "orange,apple,amount,strawberry,banana";
    static String[] words = sent.split(","); 
    static int length = words.length;
    public static void swap(int w1, int w2) {
        String temp = words[w1];
        words[w1] = words[w2];
        words[w2] = temp;
    }
    public static void main(String[] args) {
        for(int j=length-1; j>1 ; j--){   
            for(int i=0; i<j ; i++){
                int a = words[i].charAt(0);
                int b = words[i+1].charAt(0);
                System.out.println(words[i]+" "+words[i+1]);
                System.out.println(a +" "+ b);
                if(a == b){
                    a = words[i].charAt(1);
                    b = words[i+1].charAt(1);
                    swap(i, i+1);
                }
                else if(a>b)
                    swap(i, i+1);  // big element at the last 
            }
        }
        for(int i=0; i<length ; i++){
            System.out.print(words[i]+" ");
        }
    }
}