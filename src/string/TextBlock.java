package string;

public class TextBlock {
    public static void main(String[] args) {
        String html = """
                <!DOCTYPE html>
                <html>
                  <head>
                    <title>Titel der Webseite</title>
                    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
                    <!-- weitere Kopfinformationen -->
                    <!-- Kommentare werden im Browser nicht angezeigt. -->
                  </head>
                  <body>
                    <p>Inhalt der Webseite</p>
                  </body>
                </html>
                """;
        System.out.println(html.formatted("Titel der Website"));
    }
}
