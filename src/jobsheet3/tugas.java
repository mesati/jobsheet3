package jobsheet3;
public class tugas {
    private String nama;
    private int  id_penyewa;
    
    public tugas (String nama, int id_penyewa){
        this.nama = nama;
        this.id_penyewa = id_penyewa;
    }
    public void info(){
        System.out.println("nama :" +this.nama);
        System.out.println("id_penyewa :" +this.id_penyewa);
    }
}
