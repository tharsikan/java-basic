class separat{
    static String sent = "apple,orange,strawberry,banana,dsjfka,sfdfa,dsfa";
    static int len = sent.length();
    static String[] arr = new String[10];  
    static int count = -1;  
    static int l = 0; 
    static boolean finish = false;
    public static void separate(int j){
        String word = "";
        
        for(int i = j+1; i<len; i++){
            if(sent.charAt(i) != ','){
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
        arr[count] = word;
        word = "";
        while(!finish){
            separate(l);
        }
        
    }


    public static void main(String[] args) {
        separate(-1);
        for(int i = 0; i<count+1; i++){
            System.out.print(arr[i]);
        }
    }
}