package datat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {

    public static void main(String[] args) {

        String dataCzasString = "2018-08-19 23:32:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime formatDateTime = LocalDateTime.parse(dataCzasString, formatter);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("E, HH:mm");
        System.out.println(formatDateTime.format(formatter2));



    }

}
