package com.ojas.MediaFire.repository;

import com.ojas.MediaFire.entity_history.PlanEntityHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanEntityHistoryRepository extends JpaRepository<PlanEntityHistory,Long> {
}
