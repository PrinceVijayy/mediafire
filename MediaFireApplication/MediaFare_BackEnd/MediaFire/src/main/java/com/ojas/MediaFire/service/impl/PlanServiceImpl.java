package com.ojas.MediaFire.service.impl;

import com.ojas.MediaFire.entity.PlanEntity;
import com.ojas.MediaFire.model.PlanModel;
import com.ojas.MediaFire.repository.PlanRepository;
import com.ojas.MediaFire.service.PlanService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import java.util.ArrayList;
import java.util.List;
@Service
public class PlanServiceImpl implements PlanService {

    private final PlanRepository planRepository;
    @Autowired
    public PlanServiceImpl(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    public List<PlanModel> getAllPlans() {
        List<PlanModel> planModels=new ArrayList<>();
        for (PlanEntity pe: planRepository.findAll()) {
            PlanModel planModel=new PlanModel();
            BeanUtils.copyProperties(pe,planModel);
            planModels.add(planModel);
        }
        return planModels;
    }
    public PlanModel getPlanById(Long id) {
        PlanEntity plan= planRepository.findById(id).get();
        PlanModel planModel=new PlanModel();
        BeanUtils.copyProperties(plan,planModel);
        return planModel;
    }

    public int createPlan(PlanModel planModel) {
        PlanEntity plan=new PlanEntity();
        BeanUtils.copyProperties(planModel,plan);
        try {
            planRepository.save(plan);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int updatePlan(PlanModel planModel) {
        PlanEntity plan=new PlanEntity();
        BeanUtils.copyProperties(planModel,plan);
        try {
            planRepository.save(plan);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int deletePlanById(Long id) {
        try {
            planRepository.deleteById(id);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}
