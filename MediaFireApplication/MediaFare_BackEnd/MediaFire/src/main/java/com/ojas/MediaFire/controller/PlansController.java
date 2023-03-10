package com.ojas.MediaFire.controller;

import com.ojas.MediaFire.model.PlanModel;
import com.ojas.MediaFire.service.impl.PlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Repository
@RequestMapping("/plan")
public class PlansController {

    private final PlanServiceImpl planService;

    @Autowired
    public PlansController(PlanServiceImpl planService) {
        this.planService = planService;
    }

    @GetMapping("/user/list")
    public List<PlanModel> getAllPlans() {
        return planService.getAllPlans();
    }

    @GetMapping("/user/view/{id}")
    public PlanModel getPlanById(@PathVariable Long id) {
        return planService.getPlanById(id);
    }

    @GetMapping("/user/viewByName/{name}")
    public PlanModel getPlanByName(@PathVariable String name) {
        return planService.getPlanByName(name);
    }

    @PostMapping("/admin/create")
    public String createPlan(@RequestBody PlanModel planModel) {
        int status = planService.createPlan(planModel);
        if (status == 1) {
            return "Created Successfully";
        } else return "Not Created";
    }

    @PutMapping("/admin/update/{id}")
    public String updatePlan(@PathVariable Long id,@RequestBody PlanModel planModel) {
        int status = planService.updatePlanById(id,planModel);
        if (status == 1) {
            return "Updated Successfully";
        } else return "Not Updated";
    }

    @DeleteMapping("/admin/delete/{id}")
    public String deletePlan(@PathVariable Long id) {
        int status = planService.deletePlanById(id);
        if (status == 1) {
            return "Deleted Successfully";
        } else return "Not Deleted";
    }
}
