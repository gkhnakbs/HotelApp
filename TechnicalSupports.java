public class TechnicalSupports {
    private String technical_message,technical_time;   //Burada teknik desteklerin bilgisinin değişmemesi için private kullandık.Teknik destek mesajını ve teknik destek zamanını getiren parametreler var.
    private int technical_id,technical_roomnumber,technical_status; //Burada teknik desteklerin bilgisinin değişmemesi için private kullandık.Teknik destek ID sini,Teknik destek oda numarasını,
                                                                        // Teknik destek durumunu(Yapıldı veya yapılmadı yani 1 veya 0)

    public TechnicalSupports(String technical_message, String technical_time, int technical_id, int technical_roomnumber, int technical_status) {
        this.technical_message = technical_message;
        this.technical_time = technical_time;
        this.technical_id = technical_id;
        this.technical_roomnumber = technical_roomnumber;
        this.technical_status = technical_status;
    }

    public String getTechnical_message() {
        return technical_message;
    }     //Burada Teknik Destek mesajını döndürüyoruz.

    public String getTechnical_time() {
        return technical_time;
    }    //Burada Teknik Destekte istenilen  zamanı döndürüyoruz.

    public int getTechnical_id() {
        return technical_id;
    }     //Burada Teknik Destek ID sini döndürüyoruz.

    public int getTechnical_roomnumber() {
        return technical_roomnumber;
    }     //Burada Teknik Destek istenilen oda numarasını döndürüyoruz.

    public int getTechnical_status() {
        return technical_status;
    }    //Burada Teknik Destek durumunu (o veya 1 olarak)döndürüyoruz.
}
