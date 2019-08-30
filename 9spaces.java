class spaces{
    static String sent = "apple orange strawberry banana";
    static int len = sent.length();
    static String arr;  
    static int count = -1;  
    static int l = 0; 
    static boolean finish = false;
    public static void separate(int j){
        String word = "";
        
        for(int i = j+1; i<len; i++){
            if(sent.charAt(i) != ' '){
                word += sent.charAt(i);
            }else{
                l = i;
                count++;
                break;
            }  
            if(i == len -1){
                finish = true;
            }  

        }
        arr += word;
        word = "";
        while(!finish){
            separate(l);
        }
        
    }


    public static void main(String[] args) {
        separate(-1);
        System.out.print(arr);
    }
}