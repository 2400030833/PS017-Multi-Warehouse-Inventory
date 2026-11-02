package com.example.ps017_.warehouse.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WarehouseController {

    @Autowired
    private WarehouseRepository wr;

    @PostMapping("/warehouse")
    public String addWarehouse(@RequestBody Warehouse warehouse) {
        wr.save(warehouse);
        return "Warehouse Saved";
    }

    @GetMapping("/warehouse/{id}")
    public Warehouse getWarehouse(@PathVariable int id) {
        return wr.findById(id).orElse(null);
    }
}