package practise.daytime.practise08;

public class Kumanda {


    private double genislik;
    private double yukseklik;
    private double ekranBuyuklugu;
    private int maxVolume = 32;
    private int ses = 10;
    private boolean guc;

    public Kumanda(double genislik, double yukseklik, double ekranBuyuklugu) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.ekranBuyuklugu = ekranBuyuklugu;
    }

    public double kanalDegistirme(int kanal) {
        switch (kanal) {
            case 1:
                return 30.56;
            case 2:
                return 50.72;
            case 3:
                return 88.90;
        }
        return 0;
    }
    public void gucDugmesi(){
        this.guc=!guc;
        System.out.println(guc);
    }

    public int sesAzaltma(){
        if(ses>0){
            ses--;
        }
        return ses;
    }
    public int sesArtirma(){
        if(ses<maxVolume){
            ses++;
        }
        return ses;
    }
}
