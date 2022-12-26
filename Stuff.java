public class Stuff {
    private String stuff_name, stuff_surname, stuff_gender, stuff_username, stuff_password, stuff_entrytime, stuff_checkout,stuff_department;

            //Yukarideki parametler değiştirilmemesi için private yapıldı.Çalışanın adı,Çalışanın soyadı,Çalışanın cinsiyetı,Çalışanın kullanıcı adı,Çalışanın parolası,Çalışanın giriş zamanı,
            // Çalışanın çıkış zamanını ve hangi bölümde çalıştığını içeren parametreler bulunmakta

    private int stuff_age, stuff_id,stuff_workedHourData; //Bu parametler değiştirilmemesi için private yapıldı.Çalışanın yaşı,Çalışanın ID si,
                                                                                                            // Çalışanın Çalıştığı saat sayısını döndüren parametreler bulunmakta.
    private double stuff_dailysalary;  //Çalışanın günlük maaşını double cinsinden değiştirilmemek kaydıyla saklayan parametredir.

    public Stuff(String stuff_name, String stuff_surname, String stuff_gender, String stuff_username, String stuff_password, String stuff_entrytime, String stuff_checkout, String stuff_department, int stuff_age, int stuff_id,int stuff_workedHourData,double stuff_dailysalary) {
        this.stuff_name = stuff_name;
        this.stuff_surname = stuff_surname;
        this.stuff_gender = stuff_gender;
        this.stuff_username = stuff_username;
        this.stuff_password = stuff_password;
        this.stuff_entrytime = stuff_entrytime;
        this.stuff_checkout = stuff_checkout;
        this.stuff_department = stuff_department;
        this.stuff_age = stuff_age;
        this.stuff_id = stuff_id;
        this.stuff_workedHourData=stuff_workedHourData;
        this.stuff_dailysalary=stuff_dailysalary;
    }

    public String getStuff_name() {
        return stuff_name;
    }   //Çalışanın adını döndüren fonksiyon

    public String getStuff_surname() {
        return stuff_surname;
    }   //Çalışanın soyadını döndüren fonksiyon

    public String getStuff_gender() {
        return stuff_gender;
    }     //Çalışanın cinsiyetini döndüren fonksiyon

    public String getStuff_username() {
        return stuff_username;
    }   //Çalışanın kullanıcı adını döndüren fonksiyon

    public String getStuff_password() {
        return stuff_password;
    }   //Çalışanın parolasını  döndüren fonksiyon

    public String getStuff_entrytime() {
        return stuff_entrytime;
    } //Çalışanın giriş zamnını döndüren fonksiyon

    public String getStuff_checkout() {
        return stuff_checkout;
    } //Çalışanın çıkış zamnını döndüren fonksiyon

    public String getStuff_department() {
        return stuff_department;
    }   //Çalışanın bölümünü döndüren fonksiyon

    public int getStuff_age() {
        return stuff_age;
    }   //Çalışanın yaşını döndüren fonksiyon

    public int getStuff_id() {
        return stuff_id;
    }    //Çalışanın ID sini döndüren fonksiyon
    public int getStuff_workedHourData() {return stuff_workedHourData;}    //Çalışanın Çalıştığı saat sayısını (Maaş Ödeme konusunda yöneticilere kolaylık olması için) döndüren fonksiyon

    public double getStuff_dailysalary() {return stuff_dailysalary;}  //Çalışanın günlük maaşını döndüren fonksiyon


}
