package com.itsm.controller;

import com.itsm.entity.History;
import com.itsm.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller(value = "histories")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @Autowired
    public void setHistoryService(HistoryService historyService) {
        this.historyService = historyService;
    }

    @RequestMapping(value = "/book-history/{id}", method = RequestMethod.GET)
    public String bookHistory(Model model, @PathVariable("id") int id) {
        List<History> histories = historyService.findByBookId(id);
        model.addAttribute("bookHistory", histories);
        return "book-history";
    }
}
