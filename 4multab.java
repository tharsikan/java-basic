class mulTab{
    public static void main(String[] args) {
        int [][] mul = new int[10][10];
        for(int i =1; i<11; i++){
            for(int j =1; j<11; j++){
                mul[i-1][j-1] = i*j;
            }
        }
        for(int i =0; i<10; i++){
            for(int j =0; j<10; j++){
                System.out.print( mul[i][j]+"    " );
            }
            System.out.println();
        }
    }
}

class mulTab2{
    public static void main(String[] args) {
        int [][] mul = new int[10][10];
        int i =1;
        while( i<11){
            int j =1;
            while( j<11){
                mul[i-1][j-1] = i*j;
                j++;
            }
            i++;
        }
        int l =0;
        while( l<10 ){
            int k =0;
            while( k<10 ){
                System.out.print( mul[l][k]+"    " );
                k++;
            }
            System.out.println();
            l++;
        }
    }
}