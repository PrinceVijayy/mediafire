package com.ojas.MediaFire.repository;

import com.ojas.MediaFire.entity.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<PlanEntity,Long> {
    @Query(value = "select * from plans where name=?1",nativeQuery = true)
    public PlanEntity findPlanByName(String name);
}
