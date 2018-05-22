package com.ushulabubko645.usingintent.behindthescenes;

import java.util.Random;

public class OnCreateMetoder {
    private static int randomOpgaveKontrol = 999999;



    public static int randomOpgaveVælger (){
        int dateSetLenght = 99999999;

        //her vil jeg så skulle finde ud af hvordan jeg henter lænden på id cullumnen fra vores database
        //for nu laver jeg test
        dateSetLenght = 3;

        Random randomDummy = new Random();
        randomOpgaveKontrol = randomDummy.nextInt(dateSetLenght-1);
        return randomOpgaveKontrol;
    }

    public static String vaelgForkertOpgaveA(){
        //her er der nogler ting som jeg skal finde ud af inde i
        String forkertSvarA = "error error";

        //her skal jeg finder ud af hvordan jeg henter den data jeg vil hente før jeg gør så checkboksene
        //men intil videre kan jeg skrive til test
        forkertSvarA = "forkert test svar";

        while (forkertSvarA )

    }



}
