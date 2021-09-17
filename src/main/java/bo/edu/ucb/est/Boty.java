package bo.edu.ucb.est;

import java.util.List;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Boty extends TelegramLongPollingBot {
    int aux=0;
    Menu opcion;
    @Override
    public String getBotToken() {
        return "1939060923:AAEs9qeCDftGHL-YMx2gbOXCBmvw99M6ciU";
    }

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage message = new SendMessage();
        // Creo el objeto para enviar un mensaje arrba
        message.setChatId(update.getMessage().getChatId().toString());//Define a quien le vamos a enviar el mensaje
        //message.setText("Hola, escoge una opción: \n 1.Sumar 2 números \n 2. Fibo ");
        //     try {
        //        execute(message); // Envia el mensaje
        //    } catch (TelegramApiException e) {
        //        e.printStackTrace();
         //   }
        System.out.println("Llego mensaje: " + update.toString());
        if(update.hasMessage()) { // Verificamos que tenga mensaje
            String a;
            int s;
            int sumador;
            a = update.getMessage().getText();
            sumador = Integer.parseInt(a);
            s=aux+sumador;
            aux=sumador;
            
            message.setText("Vamos a ir sumando los  2 ultimos números que lleguen, por ahora tienes: " + s);
        //    message.setText("Your number multiplied by NINE is="+m);
         /*   message.setText("Dame tu 1er número: ");
            String a,b;
            int x1,x2,suma;
            a = update.getMessage().getText();
            x1 = Integer.parseInt(a);
            message.setText("Dame tu 2d0 número: ");
            b = update.getMessage().getText();
            x2 = Integer.parseInt(b);
            suma =x1+x2;
            message.setText("Your number final is an addition="+suma); */
            try {
                execute(message); // Envia el mensaje
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "estructus_manuel_bot";
    }
    
    
    
}

