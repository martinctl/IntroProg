package Week3;

class DecimalPI{
    public static void main(String[] args) {
        int n=200000;
        int k;
        double somme=0;
        int signe=-1;
        double pi;

        for(k=0; k<=n; k=k+1)
        {
            signe=-signe;
            somme = somme + signe/(2.0*k+1.0);
        }

        pi = 4.0*somme;
        System.out.println(pi);


    }
}
