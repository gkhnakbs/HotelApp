public class Room {
    private String room_option,room_view;              //Oda bilgilerini değiştirilmemesi için private yaptık.Odanın kaç kişilik olduğu ve manazaralı mı manzarasız mı olduğu bilgileri içeren parameteler.
    private int room_number,room_status,room_price,room_spendamount;   //Oda bilgilerini değiştirilmemesi için private yaptık.Oda numarası,Oda durumu(Boş veya Dolu) oda ücreti (gecelik)
                                                                                                                                                                    // ,Oda da kalanların ödeyeceği miktar

    public Room(String room_option, String room_view, int room_number, int room_status, int room_price, int room_spendamount) {
        this.room_option = room_option;
        this.room_view = room_view;
        this.room_number = room_number;
        this.room_status = room_status;
        this.room_price = room_price;
        this.room_spendamount = room_spendamount;
    }

    public String getRoom_option() {
        return room_option;
    }   //Odanın kaç kişilik olduğunu döndürdüğümüz fonksiyon

    public String getRoom_view() {
        return room_view;
    }    //Odanın manzaralı olup olmadığını döndürdüğümüz fonksiyon

    public int getRoom_number() {
        return room_number;
    }    //Odanın numarasını döndürdüğümüz fonksiyon

    public int getRoom_status() {
        return room_status;
    }     //Odanın durumunu(Boş veya Dolu) döndürdüğümüz fonksiyon

    public int getRoom_price() {
        return room_price;
    }     //Odanın gecelik ücretini döndürdüğümüz fonksiyon

    public int getRoom_spendamount() {
        return room_spendamount;
    }       //Odada kalanların o odaya ödeyecekleri ücreti döndürdüğümüz fonksiyon
}
