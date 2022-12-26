import java.lang.reflect.Array;
import java.util.ArrayList;

public class TechnicalStuff extends StuffManager{

    public void menu() {      //Bu menu fonksiyonu teknisyenlerin menüsünü gösteren fonksiyondur.


        int giris;
        boolean control = true;

        System.out.println("Yapmak istediğiniz işlemi giriniz.\n********************************");
        while (control) {
            System.out.println("1-Destek mesajlarını görüntüle \n2-Çıkış Yap\n***************");
            System.out.print("Seçiminiz : ");

            giris = scanner.nextInt();

            if (giris == 1) {
                control = false;
                showRequest();          //Burada odalardan gelen teknik desteklerin gösterilmesi ve güncellenmesi işlemleri yapılıyor.
                menu();                  //Teknisyenlerin menüsüne geri döndürüyor.
            } else if (giris == 2) {

                control = false;
                updateTime("checkout",Login.stuff_username);      //Burada teknisye çıkış yapyı tuşladığında çıkış zamnını veritabanından güncelliyor.
                MainPage.showLoginChoice();                        //Ve en baştaki Ana mneüye dönüyor.
            } else {
                System.out.println("Hatalı giriş yaptınız !!\n****************");
            }
        }

    }
    public void showRequest(){                  //Burada odalardan gelen teknik desteklerin gösterilmesi ve güncellenmesi işlemleri yapılıyor.
        while (true){
            technicalSupportMessages.clear();
            getRequest();

            for(TechnicalSupports technicalSupports:technicalSupportMessages){    //Burada gelen destek taleplerini görüntülüyoruz.
                if(technicalSupports.getTechnical_status()==0) {
                    System.out.println("Hizmet Id: " + technicalSupports.getTechnical_id() + " Hizmet Oda Numarası: " + technicalSupports.getTechnical_roomnumber() + " Hizmet istenilen Zamanı: " + technicalSupports.getTechnical_time());

                }}

            System.out.println("1-İstekleri güncelle \n2-Çıkış yap");
            System.out.print("Seçiminiz : ");
            int choice = scanner.nextInt();
            //Bu for da tekrar kontrol etmek istediğimiz için ekledik
            for(TechnicalSupports technicalSupports:technicalSupportMessages){
                if ((choice == 1)&&technicalSupports.getTechnical_status()==0) {
                    updateRequest();          //Burada odalardan gelen destek taleplerini  güncelliyoruz(YAPILDI olarak)
                    menu();              //Ve teknisyen  menüsüne dönüyor.
                }
                if (choice==2) {
                    menu();         //Ve teknisyen  menüsüne dönüyor.
                }
                if(choice!=1&&choice!=2){            //Yanlış tuşlama yapıldığında bu while tekrar çalışıyor.
                    System.out.println("\n Hatalı tuşlama !!!\n");
                }

            }


    }}
    public void updateRequest(){                      //Burada odalardan gelen destek taleplerini  güncelliyoruz(YAPILDI olarak)
        System.out.println("************************************************");
        System.out.println("Destek numarasını giriniz:");

        int choice=scanner.nextInt();
        updateOrderOrSupport("technicalsupport","technical_status",choice,1);          //Burada technicalsupport anahtar kelimesini girerek destek durumunu veritabanından güncelliyoruz.

    }
}
