package com.company;

public class Fernsehsender {

    int senderplaetze = 30;
    String[] sendernamen = new String[senderplaetze];
    int aktuellerSender;


    void zappUp(){
        if(aktuellerSender<senderplaetze) aktuellerSender++;
        else aktuellerSender=0;
    }

    void zappDown(){
        if(aktuellerSender!=0) aktuellerSender--;
        else aktuellerSender=senderplaetze;
    }

    void printSendername(){
        System.out.print(sendernamen[aktuellerSender]);
    }

    int findeSendeplatz(String sendername){
        int i=0;
        while(i<senderplaetze){
            if(sendername.equals(sendernamen[i])) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        // ...
    }
}
