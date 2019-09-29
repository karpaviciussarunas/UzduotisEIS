/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.fotoas.uzduotiseis.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lt.fotoas.uzduotiseis.Currency;

/**
 *
 * @author Sars
 */
public class Methods {
    
    public static String getCurrentDayStamp() {
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");//dd/MM/yyyy
    Date thisDay = new Date();
    String strDate = sdfDate.format(thisDay);
    return strDate;
}
    static List getFileData(String date) {
        BufferedReader reader;
        List<Currency> currList = new ArrayList<>();

        try {
//            reader = new BufferedReader(new java.io.FileReader("currency-" + date + ".csv"));
            reader = new BufferedReader(new java.io.FileReader("C:/Users/Dell/Documents/NetBeansProjects/uzduotisEIS/src/main/resources/data/"+"currency-" + date + ".csv"));
            String line = reader.readLine();
            while (line != null) {
                while ((line = reader.readLine()) != null) {
                    List currency = new ArrayList();
                    for (String item : line.split(";")) {
                        item = item.replaceAll("\"", "");
                        item = item.replaceAll(",", ".");
                        currency.add(item);
                    }
                    currList.add(new Currency(currency.get(0).toString(), currency.get(1).toString(), new BigDecimal(currency.get(2).toString()), currency.get(3).toString()));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currList;
}
}
