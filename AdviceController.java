package com.example.journal;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class AdviceController {

    private final Journal journal;

    @Autowired
    public AdviceController(Journal journal) {
        this.journal = journal;
    }

    @GetMapping("/advice")
    public String getAdvice(@RequestParam String mood,
                            @RequestParam int age,
                            @RequestParam String gender) {

        String ageGroup = journal.mapAgeToGroup(age);
        return journal.getAdvice(mood, ageGroup, gender);
    }
}
