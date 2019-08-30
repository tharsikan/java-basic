class prime{
    public static void main(String[] args) {
        int i,n=0;
        while(n<300){
            i=2;
            while(i<n){ // if this loop doesn't brak  ==> then n is prime ====> if it breaks i < n
                if(n%i == 0)
                    break;
                else
                    i++;
            }
            if(i == n){
                System.out.print(n + "  ");
            }
            n++;
        }
    }
}