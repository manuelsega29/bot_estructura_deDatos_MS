package bo.edu.ucb.est;

import java.util.List;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Boty extends TelegramLongPollingBot {
    
    int aux = 0;
    int auxiliar = 0;
    int s1=0;
    int s2=0;
    int xt = 0;
    @Override
    public String getBotToken() {
        return "2017822096:AAGeomxydZHuX-8-2m8_k2qw0KiqVXkG8N4";
    }

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage message = new SendMessage();
        message.setChatId(update.getMessage().getChatId().toString());
        System.out.println("Llego mensaje: " + update.toString());
        String mensaje;
        if(update.hasMessage()) { // Verificamos que tenga mensaje
            
            mensaje = update.getMessage().getText();
            if(aux==-1){
                message.setText(" HOLAAA ");
               try {
                execute(message); // Envia el mensaje
                } catch (TelegramApiException e) {
                   e.printStackTrace();
                }
                aux=0;
            }else{
                if(aux == 0){
                    message.setText(" Hola, soy tu bot amigo, elije una opcion para que lo haga: \n"
                       + "A. Sumar dos números \n "
                       + "B. Hacer la Serie de Fibo \n");
                    try {
                        execute(message); // Envia el mensaje
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    aux++;
                }else{
                    mensaje=update.getMessage().getText();
                    if(mensaje.equals("A")||mensaje.equals("a")){
                        message.setText(" Ok, haremos la suma, entregue su primer dígito \n");
                        try {
                            execute(message); // Envia el mensaje
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                        auxiliar=2;
                        aux++;
                    }else{
                        if(auxiliar==2){
                            s1=Integer.parseInt(mensaje);
                            message.setText(" Danos tu segundo dígito \n");
                            try {
                                execute(message); // Envia el mensaje
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                            auxiliar=3;
                            aux++;
                        }else{
                            if(auxiliar==3){
                                s2=Integer.parseInt(mensaje);
                                xt=s1+s2;
                                message.setText("Tu suma es: "+xt);
                                try {
                                    execute(message); // Envia el mensaje
                                } catch (TelegramApiException e) {
                                    e.printStackTrace();
                                }
                                auxiliar=1;
                                aux=0;
                            }else{
                                    if(mensaje.equals("B")||mensaje.equals("b")){
                                        message.setText(" Por ahora no sé hacer el Fibona :/, mandame \n"
                                                + " un mensaje si quieres ver la otra opción");
                                    try {
                                        execute(message); // Envia el mensaje
                                    } catch (TelegramApiException e) {
                                        e.printStackTrace();
                                    }
                                    aux = 0;
                                    }else{
                                        message.setText(" Dime Hola para que te muestre mis ofertas nuevamente C:  ");
                                        try {
                                            execute(message); // Envia el mensaje
                                        } catch (TelegramApiException e) {
                                            e.printStackTrace();
                                        }
                                        aux = 0;
                                    }
                                }    
                            }    
                        }    
                    }   
                }
        }
  
          
    }

    @Override
    public String getBotUsername() {
        return "Practica3_bot";
    }
    
}

