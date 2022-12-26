

public class StuffManager extends DbConnection {


    public void stuffRedirect(int index){    //Bu fonksiyon ile farklı bölümlere ayrılan işçileri yönlendime işemini yapıyoruz.
        getStuff();                     // Bu fonksiyon ile veritabanına bağlanarak (DbHelper classını kullanarak) müşterileri stuffs adında bir ArrayList e aktarıyoruz.

        KitchenStuff kitchenStuff=new KitchenStuff();
        Waiters waiters=new Waiters();
        TechnicalStuff technicalStuff=new TechnicalStuff();
        HousekeepingStuff housekeepingStuff=new HousekeepingStuff();
        String department=stuffs.get(index).getStuff_department();
        if(department.equalsIgnoreCase("kitchen")){                  // Bu bölümde mutfakta çalışan işçileri kendi menülerine yönlendiriyoruz.
            getOrders();
            kitchenStuff.menu();
        }
        else if (department.equalsIgnoreCase("waiter")) {            // Bu bölümde garson olarak çalışan işçileri kendi menülerine yönlendiriyoruz.
            waiters.menu();
        }
        else if (department.equalsIgnoreCase("technician")) {           // Bu bölümde teknisyen olarak  çalışan işçileri kendi menülerine yönlendiriyoruz.
              technicalStuff.menu();
        } else if (department.equalsIgnoreCase("housekeeping")) {         // Bu bölümde kat görevlisi olarak çalışan işçileri kendi menülerine yönlendiriyoruz.
            housekeepingStuff.menu();
        }

    }



}
