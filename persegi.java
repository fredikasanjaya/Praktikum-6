public class persegi extends bangundatar {
    float panjang;
    float lebar;

    public persegi(String warna, float panjang, float lebar){
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void gambar(){
        System.out.println("Warna Bangun Datar : " + warna);
    }
     public float luas(){
            System.out.println("Menghitung Luas Persegi");
            System.out.println("panjang = " + panjang );
            System.out.println("lebar = " + lebar );
            System.out.println("Luas Persegi = " + (panjang * lebar) + " cm");
            return 1;
      }   
    
}
