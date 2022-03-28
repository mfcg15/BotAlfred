public class AlfredTest {
    public static void main(String[] args) {
        // Crea una instancia de AlfredQuotes para acceder a todos tus métodos
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Haz algunos saludos de prueba, proporcionando los datos necesarios
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testGuestGreeting1 = alfredBot.guestGreeting();
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis("¡Alexis! Toca algunos beats low-fi.");
        String alfredTest = alfredBot.respondBeforeAlexis("No puedo encontrar mi yo-yo. Quizás Alfred sepa dónde está");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Quizás de eso se trata Batman. No de ganar. Si no que de fallar...");
        String operacionSuma = alfredBot.opreacionNumeros("suma",5,4);
        String operacionResta = alfredBot.opreacionNumeros("resta",5,4);
        String operacionMultipliacion = alfredBot.opreacionNumeros("multiplicacion",5,4);
        String operacionDivision = alfredBot.opreacionNumeros("division",5,4);
        
        // Imprime los saludos para probar.
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testGuestGreeting1);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        System.out.println(operacionSuma);
        System.out.println(operacionResta);
        System.out.println(operacionMultipliacion);
        System.out.println(operacionDivision);

    }
}