import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) 
    {
        return "Hola, "+name +". Encantado de verte";
    }

    public String guestGreeting() 
    {
        String horaDia = "";
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObjHora = DateTimeFormatter.ofPattern("HH");
        int hora = Integer.parseInt(myDateObj.format(myFormatObjHora));

        if(hora >=6 && hora <=12)
        {
            horaDia = "Buenos dias";
        }
        if(hora >=13 && hora <=20)
        {
            horaDia = "Buenos tardes";
        }
        if(hora >=21 && hora <=24)
        {
            horaDia = "Buenos noches";
        }
        if(hora >=0 && hora <=5)
        {
            horaDia = "Buenos noches";
        }
        
        return horaDia+", Beth Kane. Encantado de verte";
    }
    
    public String dateAnnouncement() 
    {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd");
        DateTimeFormatter myFormatObjMes = DateTimeFormatter.ofPattern("MMM");
        DateTimeFormatter myFormatObjHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter myFormatObjAño = DateTimeFormatter.ofPattern("yyyy");
        String formattedDate = myDateObj.format(myFormatObj) + " de "+myDateObj.format(myFormatObjMes)+" a las "+myDateObj.format(myFormatObjHora)+" de "+myDateObj.format(myFormatObjAño);
        return "Actualmente es "+formattedDate;
    }
    
    public String respondBeforeAlexis(String conversation) 
    {
        if(conversation.indexOf("Alexis")>0)
        {
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        }
        else
        {

            if(conversation.indexOf("Alfred")>0)
            {
                return "A su servicio. Como desee, naturalmente";
            }
            else
            {
                return "Bien. Y con eso, me retiraré";
            }
        }
    }
    
    public String opreacionNumeros(String operacion, int numero1 , int numero2 ) 
    {
        int respuesta = 0;
        float respuestaDisivion = 0;
        String rpta = "";

        switch (operacion)
        {
            case "suma":
                respuesta =  numero1+numero2;
                rpta = "La "+operacion+" de "+numero1+" y "+numero2+" es "+respuesta;
                break;
            case "resta":
                respuesta = numero1-numero2;
                rpta = "La "+operacion+" de "+numero1+" y "+numero2+" es "+respuesta;
                break;
            case "multiplicacion":
                respuesta = numero1*numero2;
                rpta = "La "+operacion+" de "+numero1+" y "+numero2+" es "+respuesta;
                break;
            case "division":
                if(numero2 == 0)
                {
                    return "El divisor no puede ser 0";
                }
                else
                {
                    respuestaDisivion = (float) numero1/numero2;
                    
                }
                rpta = "La "+operacion+" de "+numero1+" y "+numero2+" es "+respuestaDisivion;
                break;
        }
        
        return rpta;
    }
	
}