package com.example.mcap.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coba")
public class TestContoller {

    @GetMapping
    public String test()
    {
        return "TestContoller nih coy";
    }

    @GetMapping(value = "cek")
    public  String cek()
    {
        return "cek terpanggial";
    }

    @GetMapping(value = "nama")
    public  String nama(@RequestParam String nama)
    {
        return "nama terpanggil";
    }

    @GetMapping(value = "id/{employeeId}")
    public String employees(@PathVariable String employeeId) {
        return "ID gue nih: " + employeeId;
    }



}
