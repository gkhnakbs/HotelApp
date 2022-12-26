public class Housekeeping {
    private String housekeeping_time;   //Dışarıdan değiştirilmeye kapalı olması için private yaptık.
    private int housekeeping_status,id,housekeeping_roomnumber;  //Dışarıdan değiştirilmeye kapalı olması için private yaptık.

    public Housekeeping(String housekeeping_time, int housekeeping_status, int id, int housekeeping_roomnumber) { //Yapıcı Constructor
        this.housekeeping_time = housekeeping_time;
        this.housekeeping_status = housekeeping_status;
        this.id = id;
        this.housekeeping_roomnumber = housekeeping_roomnumber;
    }

    public String getHousekeeping_time() {    // Bu fonksiyonumuuz ile housekeeping hizmetinin zamanını döndürebiliyoruz.
        return housekeeping_time;
    }

    public int getHousekeeping_status() {    // Bu fonksiyonumuuz ile housekeeping hizmetinin durumunu(Yapıldı veya Yapılmadı) döndürebiliyoruz.
        return housekeeping_status;
    }

    public int getId() {      // Bu fonksiyonumuuz ile housekeeping hizmetinin ıd sini  döndürebiliyoruz.
        return id;
    }

    public int getHousekeeping_roomnumber() {          // Bu fonksiyonumuuz ile housekeeping hizmetinin oda nummarasını döndürebiliyoruz.
        return housekeeping_roomnumber;
    }
}
