package com.shankar.repo;

import com.shankar.model.HondaBike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HondaBikeRepository extends JpaRepository<HondaBike,Integer> {
}
