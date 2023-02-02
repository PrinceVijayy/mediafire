package com.ojas.MediaFire.service.impl;

import com.ojas.MediaFire.entity.PlanEntity;
import com.ojas.MediaFire.entity_history.PlanEntityHistory;
import com.ojas.MediaFire.model.PlanModel;
import com.ojas.MediaFire.repository.PlanEntityHistoryRepository;
import com.ojas.MediaFire.repository.PlanRepository;
import com.ojas.MediaFire.service.PlanService;
import com.ojas.MediaFire.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    private final PlanRepository planRepository;
    private final PlanEntityHistoryRepository planEntityHistoryRepository;

    @Autowired
    public PlanServiceImpl(PlanRepository planRepository,
                           PlanEntityHistoryRepository planEntityHistoryRepository) {
        this.planRepository = planRepository;
        this.planEntityHistoryRepository = planEntityHistoryRepository;
    }

    public List<PlanModel> getAllPlans() {
        List<PlanModel> planModels = new ArrayList<>();
        planRepository.findAll().stream().filter(pe -> pe.getVisibility() == 1).forEach(pe -> {
            PlanModel planModel = new PlanModel();
            BeanUtils.copyProperties(pe, planModel);
            planModels.add(planModel);
        });
        return planModels;
    }

    public PlanModel getPlanById(Long id) {
        PlanEntity plan = planRepository.findById(id).get();
        PlanModel planModel = new PlanModel();
        if (plan.getVisibility() == 1) {
            BeanUtils.copyProperties(plan, planModel);
        }
        return planModel;
    }

    public PlanModel getPlanByName(String name) {
        PlanEntity plan = planRepository.findPlanByName(name);
        PlanModel planModel = new PlanModel();
        if (plan.getVisibility() == 1) {
            BeanUtils.copyProperties(plan, planModel);
        }
        return planModel;
    }

    public int createPlan(PlanModel planModel) {
        // creating data for plan entity
        PlanEntity plan = new PlanEntity();
        BeanUtils.copyProperties(planModel, plan);
        plan.setVisibility(1);
        plan.setPublishedOn(DateUtils.currentDateTime());

        // creating data for plan entity history
        PlanEntityHistory planEntityHistory = new PlanEntityHistory();
        BeanUtils.copyProperties(planModel, planEntityHistory);
        planEntityHistory.setPublishedOn(DateUtils.currentDateTime());

        try {
            planRepository.save(plan);
            planEntityHistoryRepository.save(planEntityHistory);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int updatePlanById(Long id, PlanModel planModel) {
        // creating data for plan entity
        PlanEntity plan = new PlanEntity();
        BeanUtils.copyProperties(planModel, plan);
        plan.setId(id);
        plan.setPublishedOn(DateUtils.currentDateTime());
        plan.setVisibility(1);

        // creating data for plan entity history
        PlanEntityHistory planEntityHistory = new PlanEntityHistory();
        BeanUtils.copyProperties(planModel, planEntityHistory);
        plan.setId(id);
        planEntityHistory.setPublishedOn(DateUtils.currentDateTime());

        try {
            planRepository.save(plan);
            planEntityHistoryRepository.save(planEntityHistory);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int deletePlanById(Long id) {
        try {
            PlanEntity plan = planRepository.findById(id).get();
            plan.setVisibility(0);
            planRepository.save(plan);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}
