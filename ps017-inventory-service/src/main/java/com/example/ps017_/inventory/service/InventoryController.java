package com.example.ps017_.inventory.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventoryController {

    @Autowired
    private InventoryRepository ir;

    @PostMapping("/inventory")
    public String addInventory(@RequestBody Inventory inventory) {
        ir.save(inventory);
        return "Inventory Saved";
    }

    @GetMapping("/inventory/{id}")
    public Inventory getInventory(@PathVariable int id) {
        return ir.findById(id).orElse(null);
    }
}