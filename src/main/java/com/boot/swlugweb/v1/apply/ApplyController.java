package com.boot.swlugweb.v1.apply;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apply")
public class ApplyController {

    @GetMapping
    public Boolean apply() {

        return true;
    }

}
