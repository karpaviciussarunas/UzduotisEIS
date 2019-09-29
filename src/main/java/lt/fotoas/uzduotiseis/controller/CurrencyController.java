/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.fotoas.uzduotiseis.controller;

import java.math.BigDecimal;
import java.util.List;
import lt.fotoas.uzduotiseis.Currency;
import static lt.fotoas.uzduotiseis.controller.Methods.getCurrentDayStamp;
import static lt.fotoas.uzduotiseis.controller.Methods.getFileData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sars
 */
@Controller
//@RequestMapping("/")
public class CurrencyController {

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
             String thisDay = getCurrentDayStamp();
        List<Currency> currList = getFileData("2019-09-19");
        model.addAttribute("currlist", currList);
        model.addAttribute("date", thisDay);
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String list(String date, Model model) {
        List<Currency> currList = getFileData(date);
        model.addAttribute("currlist", currList);
        model.addAttribute("date", date);
        return "list";
    }

    @RequestMapping(value = "/currencyrate", method = RequestMethod.POST)
    public String currcode(String code, String startingday, String endingday, Model model) {

        List<Currency> curr1 = getFileData(startingday);
        List<Currency> curr2 = getFileData(endingday);
        Currency currCode1 = null;
        Currency currCode2 = null;
        for (int i = 0; i < curr1.size(); i++) {
            if (curr1.get(i).getCode().equals(code)) {
                currCode1 = curr1.get(i);
            }
        }
        for (int i = 0; i < curr2.size(); i++) {
            if (curr2.get(i).getCode().equals(code)) {
                currCode2 = curr2.get(i);
            }
        }
        BigDecimal x = null;  
        try{
            if((currCode1.getValue() !=null) && (currCode2.getValue() != null)){
           x = currCode1.getValue().subtract(currCode2.getValue());
        }
        }catch (Exception e){
            //null point exception
        }
                
                

        model.addAttribute("code1", currCode1);
        model.addAttribute("code2", currCode2);
        
        if(x!=null){
            model.addAttribute("ratex", x);
        }
        

        return "currencyrate"; //grazina i puslapi
    }

    @GetMapping("back")
    public String back() {
        return "redirect:/";
    }

}
