public class HousekeepingStuff extends StuffManager{
    public void menu() {  // Bu menü sadece housekeeping çalışanlarında görülebilir.


        int giris;
        boolean control = true;

        System.out.println("Yapmak istediğiniz işlemi giriniz.\n********************************");
        while (control) {
            System.out.println("1-İstekleri görüntüle \n2-Çıkış Yap\n***************");
            System.out.print("Seçiminiz : ");

            giris = scanner.nextInt();

            if (giris == 1) {
                control = false;
                showRequest();         //Bu fonksiyon odalardan gelen housekeeping isteklerini ekrana yazdırıyor ve güncellemeyi sağlıyor.
                menu();                 //Ve tekrar housekeeping menüsüne dönyüor.
            } else if (giris == 2) {

                control = false;
                updateTime("checkout",Login.stuff_username); //Burda Housekeeping çalışanı çıkış yaptığında çıkış zamanını sisteme kaydetmesini sağlıyor.
                MainPage.showLoginChoice();                   //Burda ana menüye dönüyor.
            } else {
                System.out.println("Hatalı giriş yaptınız !!\n****************");
            }
        }

    }
    public void showRequest(){     //Bu fonksiyon odalardan gelen housekeeping isteklerini ekrana yazdırıyor ve güncellemeyi sağlıyor.
    while (true){
            housekeepingRequest.clear();
            getHousekeepingRequest();



        for(Housekeeping housekeeping:housekeepingRequest){   //Burada gelen verileri nesnenin getter fonksiyonundan yararlanarak ekrana yazdırıyoruz.
            if(housekeeping.getHousekeeping_status()==0) {
                System.out.println("Hizmet Id: " + housekeeping.getId() + " Hizmet Oda Numarası: " + housekeeping.getHousekeeping_roomnumber() + " Hizmet istenilen Zamanı: " + housekeeping.getHousekeeping_time());

            }}

            System.out.println("1-İstekleri güncelle \n2-Çıkış yap");
            System.out.print("Seçiminiz : ");
            int choice = scanner.nextInt();
            //Bu for uda tekrar kontrol etmek istediğimiz için ekledik
        for(Housekeeping housekeeping:housekeepingRequest){
            if ((choice == 1)&&housekeeping.getHousekeeping_status()==0) {  //Eğer gelen verinin housekeeping status u sıfır ise yani housekeeping isteği gerçekleştirilmemişse
                updateRequest();                                              //burada gerçekleştirdi olarak güncelliyoruz.
                menu();                                                         //Tekrar housekeeping çalışanı menüsüne döndürüyor.
            }
            if (choice==2) {                                            //Çıkış yapmak istemişse tekrar housekeeping çalışanı menüsüne döndürüyor.
                menu();
            }
            if(choice!=1&&choice!=2){
                System.out.println("\n Hatalı tuşlama !!!\n");
            }

    }}

    }

    public void updateRequest(){                //Hizmet numarasını alıp o numaray ait isteği veritabanında güncelleyen fonksiyon.
        System.out.println("************************************************");
        System.out.println("Destek numarasını giriniz:");

        int choice=scanner.nextInt();
        updateHousekeepingStatus(1,choice);              //Hizmet durumunu 1 olarak güncelleyen(Yani YAPILDI olarak) fonksiyon

    }




}
