package jobsheet3;
class praktek extends tugas{
    private String Buku;
    private int idbuku;
    public praktek (String Buku, int idbuku, String nama, int id_penyewa)
    {       
    super (nama, id_penyewa);
    this.Buku = Buku;
    this.idbuku = idbuku;
    }
    public void info()
    {
        System.out.println("--PERPUSTAKAAN--");
        System.out.println("Buku : "+this.Buku);
        System.out.println("Id Buku : "+this.idbuku);
        super.info();
    }
}
