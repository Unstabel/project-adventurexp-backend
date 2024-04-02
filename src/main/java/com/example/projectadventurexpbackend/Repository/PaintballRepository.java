package com.example.projectadventurexpbackend.Repository;


import com.example.projectadventurexpbackend.Model.Paintball;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;


public interface PaintballRepository extends JpaRepository<Paintball, Integer> {

}
