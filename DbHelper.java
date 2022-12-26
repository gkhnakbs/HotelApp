import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper { // Bu class Amazon Server larındaki bilgilerle eşelşip Amazon Veritabanına bağlanmamızı sağlıyor

    public static Connection getConnection() throws SQLException { // Bu fonksyion Amazon Server larındaki bilgilerle eşelşip Amazon Veritabanına bağlanmamızı sağlıyor
        String password = "K6g4aSfTKjZKmHQBfiAB";
        String dbUrl = "jdbc:mysql://projeotel.ceaeispo2d3k.eu-central-1.rds.amazonaws.com:3306/hotelsdb?user=admin&password=K6g4aSfTKjZKmHQBfiAB";
        String userName = "admin";
        return DriverManager.getConnection(dbUrl, userName, password);
    }
    public  void showErrorMassage(SQLException exception){ // Bu fonksiyon ise Veritabanı ile bağlantı sırasında eğer bir hata alırsak bize hatanın daha anlaşılır olmasını sağlıyor.
        System.out.println("Error : " + exception.getMessage() );
        System.out.println("Error Kodu : "+exception.getErrorCode());
    }
}
