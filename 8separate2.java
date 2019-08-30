class separat2{
    static String sent = "apple , orange , strawberry , banana , dsjfka, sfdfa, dsfa";


    public static void main(String[] args) {
        String[] word = sent.split(",");     
        for (String var : word) {
            System.out.print(var+"  ");
        }
    }
}

// it is too easy to use java inbuild libraries 
// it reduse the code , and coding time