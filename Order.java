public class Order {
    private int order_roomnumber,order_status,order_id;       //Yiyecek siparişinin odanumarasını durumunu id sini aldığımız değişken.Değiştirilmemesi için private yaptık

    private String order_name;       //Yiyecek siparişinin adını aldığımız değişken .Değiştirilmemesi için private yaptık

    public Order(String order_name,int order_roomnumber, int order_status, int order_id ) {
        this.order_roomnumber = order_roomnumber;
        this.order_status = order_status;
        this.order_id = order_id;
        this.order_name = order_name;
    }

    public int getOrder_roomnumber() {
        return order_roomnumber;
    }         //Siparişin oda numarasını döndürdüğümüz fonksiyon

    public void setOrder_roomnumber(int order_roomnumber) {
        this.order_roomnumber = order_roomnumber;
    } //Siparişin oda numarasını değiştirdiğimiz fonksiyon

    public int getOrder_status() {
        return order_status;
    } //Siparişin durumunu döndürdüğümüz fonskiyon

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    } //Siparişin durumunu değiştirdiğimiz fonksiyon

    public int getOrder_id() {
        return order_id;
    } //Siparişin ID sini döndürdüğümüz fonksiyon

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    } //Siparişin ID sini değiştirdiğimiz fonksiyon

    public String getOrder_name() {
        return order_name;
    } //Siparişin adını döndürdüğümüz fonksiyon

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    } //Siparişin adını değiştiridğimiz fonksiyon
}
