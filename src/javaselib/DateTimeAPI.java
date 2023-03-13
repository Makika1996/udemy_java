package javaselib;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Lernziel: Temporale Datentypen
 * - Alte Datentypen `Date` und `Calendar`
 * - `LocalDate`
 * - `LocalDateTime`
 * - `LocalTime`
 * - Formatieren und Parsen
 */

public class DateTimeAPI {
    public static void main(String[] args) {

        /*
        Typ                     Jahr    Monat   Tag     Std.    Min.    Sek.    Zeitzonen-Offset Zonen-ID
        -----------------------------------------------------------------------------------------------------
        LocalDate                x        x      x
        LocalTime                                        x       x       x
        LocalDateTime            x        x      x       x       x       x

        OffsetTime                                      x       x       x              x
        OffsetDateTime          x        x      x       x       x       x              x
        ZonedDateTime           x        x      x       x       x       x              x           x
         */

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2020, 1, 12));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfWeek());

        System.out.println(now.withHour(17));

        System.out.println(now.minusHours(1));
        System.out.println(now.plusHours(100));

        System.out.println(LocalDate.now().atTime(12, 10));

        System.out.println(now.atOffset(ZoneOffset.ofHours(+2)));
        System.out.println(now.atZone(ZoneId.of("Europe/Berlin")));

        /*
        MonthDay
        Year
        YearMonth
        Month
         */

        /*
        Duration    Zeit    24 Std.
        Period      Datum
         */

        /*
        Instant
        Clock
         */

//        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
//        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));
//        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));

//        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
//        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.ENGLISH)));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

        for (Locale locale : Locale.getAvailableLocales()) {
            System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ENGLISH)));
            System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.ENGLISH)));
            System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.ENGLISH)));
            System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.ENGLISH)));
        }

//        LocalDate.parse()
    }
}
