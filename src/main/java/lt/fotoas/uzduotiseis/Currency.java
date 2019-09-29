/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.fotoas.uzduotiseis;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Sars
 */
public class Currency {

    private String currency;
    private String code;
    private BigDecimal value;
    private String date;
    private List<Currency> currencyList;

    public Currency(String currency, String code, BigDecimal value, String date) {
        this.currency = currency;
        this.code = code;
        this.value = value;
        this.date = date;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    @Override
    public String toString() {
        return "Currency{" + "currency=" + currency + ", code=" + code + ", value=" + value + ", date=" + date + '}';
    }



}
