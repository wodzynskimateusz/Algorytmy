package PracaDomowa2701;

public class NajwiekszyWspolnyDzielnik {
    public static void main(String[] args) {

        System.out.println(nwd(8,12));
    }

    static int nwd(int k, int n) {
        if (k == 0)
            return n;
        else
            return nwd(n % k, k);
    }
}
