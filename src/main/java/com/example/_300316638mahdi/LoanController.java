package com.example._300316638mahdi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SessionAttributes({"id", "errorMessage", "num", "Name", "amount", "year", "type", "clientNum", "ClientName"})
@RequestMapping
@Controller


public class LoanController {

        DatabaseService service1;

        @Autowired
        Connection123 connect;


        @RequestMapping(value = "/loantable", method = RequestMethod.GET)
        public String showLoanPage(ModelMap model) throws SQLException, ClassNotFoundException {

            service1 = new DatabaseService(connect.connect());

            model.addAttribute("loans", service1.display());

            /*
            List<Category> filteredTodos = new ArrayList<Category>();

            filteredTodos = (List) model.get("todos");

            model.put("id",filteredTodos.get(0).getCatcode());

            model.put("desc",filteredTodos.get(0).getCatdesc());

             */

            return "loantable";
        }

        @RequestMapping(value = "/", method = RequestMethod.GET)
        public String showLoanPage2(ModelMap model) throws SQLException, ClassNotFoundException {

            service1 = new DatabaseService(connect.connect());

            model.addAttribute("loans", service1.display());

            return "loantable";
        }

        @RequestMapping(value ="/addLoan", method = RequestMethod.GET)
        public String showAddPage(){
            return "add";
        }


        @RequestMapping(value ="/adding", method = RequestMethod.POST)
        public String showAddPage2(ModelMap model, @RequestParam("cNum") String cNum, @RequestParam("cName") String cName, @RequestParam("lAmount") Double lAmount, @RequestParam("years") int years, @RequestParam("lType") String lType) throws SQLException, ClassNotFoundException{

            if(!(service1.search(cNum)==null)){
                model.put("errorMessage","Record Existing");
            } else{
                Loan obj1 = new Loan(cNum, cName, lAmount, years, lType);

                service1.add(obj1);
            }

            return "redirect:/loantable";
        }

        @RequestMapping(value = "/update", method = RequestMethod.GET)
        public String showUpdatePage(ModelMap model, @RequestParam(defaultValue = "") String id)
                throws SQLException, ClassNotFoundException {



            /*

            model.put("id", id);

            Loan cc = service1.search(id);

            model.put("num",cc.getClientno());
            model.put("Name", cc.getClientname());
            model.put("amount", cc.getLoanamount());
            model.put("year", cc.getYears());
            model.put("type", cc.getLoantype());

             */


            return "Edit";
        }


        @RequestMapping(value = "/update", method = RequestMethod.POST)
        public String showUpdatePage2(ModelMap model, @RequestParam("clientN") String cNum, @RequestParam("clientName") String cName, @RequestParam("Lamount") Double lAmount, @RequestParam("years") int years, @RequestParam("loanT") String lType) throws SQLException, ClassNotFoundException {

            String iid = (String) model.get("id");

            Loan obj1 = new Loan(cNum, cName, lAmount, years, lType);

            service1.edit(obj1,iid);

            return "redirect:/";
        }


        @RequestMapping(value ="/delete", method = RequestMethod.GET)
        public String deleteTodo(ModelMap model, @RequestParam String id) throws SQLException, ClassNotFoundException {


            service1.delete(id);


            model.clear();
            return "redirect:/";
        }

        @RequestMapping(value = "/amor", method = RequestMethod.GET)
        public String showAmorPage(ModelMap model, @RequestParam(defaultValue = "") String id) throws SQLException, ClassNotFoundException {
            model.addAttribute("clientNum", id);

            return "Amortization";
        }

        @RequestMapping(value = "/back", method = RequestMethod.GET)
        public String backToMain() {
            return "redirect:/";
        }




}
