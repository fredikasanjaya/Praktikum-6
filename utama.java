public class utama {
    public static void main(String[] args){
        bangundatar lingkaran = new lingkaran("biru",8);
        bangundatar segitiga = new segitiga("merah",7,4);
        bangundatar persegi = new persegi("hijau", 4,4);


        lingkaran.gambar();
        lingkaran.luas();
        System.out.println();
        segitiga.gambar();
        segitiga.luas();
        System.out.println();
        persegi.gambar();
        persegi.luas();







    }
    
}
