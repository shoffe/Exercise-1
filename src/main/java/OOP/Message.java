package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Message {
    private String sender;
    private String receiver;
    private String text;

    public Message(String sender, String receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

}
class MessageBox {
    private List<Message> messages;

    public MessageBox() {
        messages = new ArrayList<>();
    }

    public void sendMessage(String sender, String receiver, String text) {
        Message message = new Message(sender, receiver, text);
        messages.add(message);
    }

    public void deleteMessage(int index) {
        if (index >= 0 && index < messages.size()) {
            messages.remove(index);
        } else {
            System.out.println("Неверный индекс сообщения.");
        }
    }



    public void displayAllMessages() {
        if (messages.isEmpty()) {
            System.out.println("No messages to display.");
        } else {
            for (int i = 0; i < messages.size(); i++) {
                Message message = messages.get(i);
                System.out.println("Message index " + (i) + ":");
                System.out.println("Sender: " + message.getSender());
                System.out.println("Receiver: " + message.getReceiver());
                System.out.println("Text: " + message.getText());
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {
        MessageBox messageBox = new MessageBox();

        messageBox.sendMessage("Alice", "Bob", "Hello Bob!");
        messageBox.sendMessage("Bob", "Alice", "Hi Alice!");
        messageBox.sendMessage("Charlie", "Alice", "Hey Alice!");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите функционал: ");
        System.out.println("1 - посмотреть все сообщения");
        System.out.println("2 - добавить сообщение");
        System.out.println("3 - удалить сообщение");
        System.out.println("4 - поиск сообщения");


        int chose = scanner.nextInt();

        switch (chose) {
            case 1:
                messageBox.displayAllMessages();
                break;


            case 2:
                System.out.println("Введите отправителя:");
                String sender = scanner.next();
                System.out.println("Введите получателя:");
                String receiver = scanner.next();
                System.out.println("Введите текст сообщения:");
                String text = scanner.next();
                messageBox.sendMessage(sender, receiver,text);
                messageBox.displayAllMessages();
            break;

            case 3:
                messageBox.displayAllMessages();
                System.out.println("Введите индекс сообщения для удаления:");
                int index = scanner.nextInt();
                messageBox.deleteMessage(index);
                messageBox.displayAllMessages();
                break;

        }
    }

}