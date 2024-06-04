package org.launchcode.techjobsmvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    static HashMap<String,String> actionChoices = new HashMap<>();

    public TechJobsController() {
    }

    @ModelAttribute("actions")
    public HashMap getActionChoices(){
        return actionChoices;
    }

    @ModelAttribute("columns")
    public HashMap getColumnChoices(HashMap columns){
        return columns;
    }


}
