/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est;

import java.util.List;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Menu {
    
    public void DesplegarOpciones(Update update){
        SendMessage message = new SendMessage();
        message.setChatId(update.getMessage().getChatId().toString());
        message.setText("Hola, escoge una opción: \n 1.Sumar 2 números \n 2. Fibonacci ");
         /*   try {
                
                execute(message); // Envia el mensaje
            
            } catch (TelegramApiException e) {
               e.printStackTrace();
            
            }*/
    }
    
    public void Opcion(String opcion){
        int op;
        op = Integer.parseInt(opcion);
        if(op == 1){
            
        }else{
            
        }
        
    }
    
    
    
}
