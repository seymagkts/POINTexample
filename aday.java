public abstract class aday {
    private int edebiyat;
    private int turkce;
    private int fizik;
    private int matematik;
    private String isim;

    public aday (int edebiyat, int turkce, int fizik, int matematik,String isim){
        this.edebiyat=edebiyat;
        this.turkce=turkce;
        this.fizik=fizik;
        this.matematik=matematik;
        this.setIsim(isim);
    }


    public abstract int puanHesapla();


    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
