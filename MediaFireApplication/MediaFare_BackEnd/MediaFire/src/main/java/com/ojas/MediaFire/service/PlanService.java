package com.ojas.MediaFire.service;

import com.ojas.MediaFire.model.PlanModel;

import java.util.List;

public interface PlanService {
    public List<PlanModel> getAllPlans();
    public PlanModel getPlanById(Long id);
    public int createPlan(PlanModel planModel);
    public int updatePlan(PlanModel planModel);
    public int deletePlanById(Long id);
}
