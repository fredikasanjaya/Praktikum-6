public class segitiga extends bangundatar {
  int alas;
  int tinggi;
  
  public segitiga(String warna, int alas, int tinggi){
    super(warna);
    this.alas = alas;
    this.tinggi = tinggi;
}

public void gambar(){
    System.out.println("Warna Bangun Datar : " + warna);
}
 public float luas(){
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("alas = " + alas );
        System.out.println("tinggi = " + tinggi );
        System.out.println("Luas segitiga = " + (0.5 * alas * tinggi) + " cm^2");
        return 1;
  }   

    
}
