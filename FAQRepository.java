package com.example.Task1.Repository;

import com.example.Task1.Entity.FAQEntity;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
@EnableJpaRepositories
public interface FAQRepository extends JpaRepository<FAQEntity, Long> {

        List<FAQEntity> findAll ();

    }
