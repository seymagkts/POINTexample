public class esitAgirlik extends aday{
    public esitAgirlik(int edebiyat, int turkce, int fizik, int matematik,String isim) {
        super(edebiyat, turkce, fizik, matematik,isim);
    }

    @Override
    public int puanHesapla() {
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
    }
}
