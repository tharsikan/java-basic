class space2{
    static String sent = "apple orange strawberry banana dsjfka sfdfa dsfa";
    static String newSent = "";

    public static void main(String[] args) {
        String[] word = sent.split(" ");     
        for (String var : word) {
            newSent += var;
        }
        System.out.print(newSent);
    }
}

// it is too easy to use java inbuild libraries 
// it reduse the code and coding time