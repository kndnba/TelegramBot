import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GandybbaBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "Gandybba_bot";
    }

    @Override
    public String getBotToken() {
        return "5657777910:AAFZOiZhpccdfImkb97Slosp4QrMdapIu40";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String user_first_name = update.getMessage().getChat().getFirstName();
            String user_last_name = update.getMessage().getChat().getLastName();
            String user_username = update.getMessage().getChat().getUserName();
            long user_id = update.getMessage().getChat().getId();
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
            String answer = message_text;

            SendMessage message = new SendMessage();
            message.setChatId(chat_id);
            message.setText(message_text);
            log(user_first_name, user_last_name, Long.toString(user_id), message_text, answer);


             if (message_text.equals("/pic")) {
                SendPhoto msg = new SendPhoto();
                msg.setChatId(chat_id);
                msg.setPhoto(new InputFile("AgACAgIAAxkBAANPYw7eUa6LY01Wpxrhjn4yVnJR3_oAAuC9MRsUKnhIl1SGuUUGSO0BAAMCAANtAAMpBA"));
                msg.setCaption("Это сир Отто Хайтауэр.");
                try {
                    execute(msg);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }

            else if (message_text.equals("/markup")){
                SendMessage message1 = new SendMessage();
                        message1.setChatId(chat_id);
                        message1.setText("Here is your keyboard");
                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                List < KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                row.add("Тык 1");
                row.add("Тык 2");
                row.add("Тык 3");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("Буп 1");
                row.add("Буп 2");
                row.add("Буп 3");
                keyboard.add(row);
                keyboardMarkup.setKeyboard(keyboard);
                message1.setReplyMarkup(keyboardMarkup);
                try{
                    execute(message1);
                }catch (TelegramApiException e){
                    e.printStackTrace();
                }
            }
             else if (message_text.equals("/hide")){
                 SendMessage message2 = new SendMessage();
                 message2.setChatId(chat_id);
                 message2.setText("Keyboard hidden");
                 ReplyKeyboardRemove keyboardMarkup = new ReplyKeyboardRemove();
                 keyboardMarkup.setRemoveKeyboard(true);
                 message2.setReplyMarkup(keyboardMarkup);
                 try {
                     execute(message2);
                 }catch (TelegramApiException e){
                     e.printStackTrace();
                 }
             }

            else if (message_text.equals("Тык 1")){
                SendPhoto msg = new SendPhoto();
                msg.setChatId(chat_id);
                msg.setPhoto(new InputFile("AgACAgIAAxkBAANPYw7eUa6LY01Wpxrhjn4yVnJR3_oAAuC9MRsUKnhIl1SGuUUGSO0BAAMCAANtAAMpBA"));
                msg.setCaption("Это сир Отто Хайтауэр, десница короля");
                try {
                    execute(msg);
                }catch (TelegramApiException e){
                    e.printStackTrace();
                }
            }

             else if (message_text.equals("Тык 2")){
                 SendPhoto msg = new SendPhoto();
                 msg.setChatId(chat_id);
                 msg.setPhoto(new InputFile("AgACAgIAAxkBAAOiYw7y-QABJ_O0LgyaCPHOw1DlAAF-hwAC5b0xGxQqeEhJ8H2JModetAEAAwIAA3gAAykE"));
                 msg.setCaption("Это рыболюд из Инсмута");
                 try {
                     execute(msg);
                 }catch (TelegramApiException e){
                     e.printStackTrace();
                 }
             }

             else if (message_text.equals("Тык 3")){
                 SendPhoto msg = new SendPhoto();
                 msg.setChatId(chat_id);
                 msg.setPhoto(new InputFile("AgACAgIAAxkBAAOkYw8E_jGig7vcK5C4LzxWeX1v-jwAAu69MRsUKnhIumnPQqQxTKABAAMCAAN5AAMpBA"));
                 msg.setCaption("Это сир Александр Дмитриевич Кондратьев, 31 годик");
                 try {
                     execute(msg);
                 }catch (TelegramApiException e){
                     e.printStackTrace();
                 }
             }

             else if (message_text.equals("Буп 1")){
                 SendPhoto msg = new SendPhoto();
                 msg.setChatId(chat_id);
                 msg.setPhoto(new InputFile("AgACAgIAAxkBAAOxYw8FrE-PQJYTUhdwYwABHlGikrpvAAJlvjEbFCp4SI6F7kGKcwfFAQADAgADeAADKQQ"));
                 msg.setCaption("Это смешной мем");
                 try {
                     execute(msg);
                 }catch (TelegramApiException e){
                     e.printStackTrace();
                 }
             }

             else if (message_text.equals("Буп 2")){
                 SendPhoto msg = new SendPhoto();
                 msg.setChatId(chat_id);
                 msg.setPhoto(new InputFile("AgACAgIAAxkBAAO1Yw8GJqQSfSabkogi8ebbEK5HMP0AAma-MRsUKnhI9LwSi9rYSJsBAAMCAAN5AAMpBA"));
                 msg.setCaption("Я уже мидл");
                 try {
                     execute(msg);
                 }catch (TelegramApiException e){
                     e.printStackTrace();
                 }
             }

             else if (message_text.equals("Буп 3")){
                 SendPhoto msg = new SendPhoto();
                 msg.setChatId(chat_id);
                 msg.setPhoto(new InputFile("AgACAgIAAxkBAAO3Yw8GiuaveU5DmGwtmenBpfROkrgAAmm-MRsUKnhI1eZGvEmjXw4BAAMCAAN5AAMpBA"));
                 msg.setCaption("Это корги Каспер");
                 try {
                     execute(msg);
                 }catch (TelegramApiException e){
                     e.printStackTrace();
                 }
             }


            try {
                execute(message); // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if (update.hasMessage() && update.getMessage().hasPhoto()) {
            long chat_id = update.getMessage().getChatId();
            List<PhotoSize> photos = update.getMessage().getPhoto();

            String f_id = photos.stream()
                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                    .findFirst()
                    .orElse(null).getFileId();

            int f_width = photos.stream()
                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                    .findFirst()
                    .orElse(null).getWidth();

            int f_height = photos.stream()
                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                    .findFirst()
                    .orElse(null).getHeight();

            String caption = "file_id: " + f_id + "\nwidth: " + Integer.toString(f_width) + "\nheight: " + Integer.toString(f_height);
            SendPhoto msg = new SendPhoto();
            msg.setChatId(chat_id);
            msg.setPhoto(new InputFile(f_id));
            msg.setCaption(caption);

            try {
                execute(msg);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
    private void log (String first_name, String last_name, String user_id, String txt, String bot_answer){
        System.out.println("\n -----------------------------------------");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Сообщение от "+ first_name+ " "+ last_name + " (id = "+ user_id +")"+ " \n Текст - "+ txt);
    }
}

