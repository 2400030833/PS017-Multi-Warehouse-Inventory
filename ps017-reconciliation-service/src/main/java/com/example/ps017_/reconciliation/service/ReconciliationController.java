package com.example.ps017_.reconciliation.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReconciliationController {

    @Autowired
    private ReconciliationRepository rr;

    @PostMapping("/reconciliation")
    public String addReconciliation(
            @RequestBody Reconciliation reconciliation) {
        rr.save(reconciliation);
        return "Reconciliation Saved";
    }

    @GetMapping("/reconciliation/{id}")
    public Reconciliation getReconciliation(@PathVariable int id) {
        return rr.findById(id).orElse(null);
    }
}
