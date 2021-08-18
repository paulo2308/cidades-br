package com.github.paulo2308.cidadesbr.states.repositories;

import com.github.paulo2308.cidadesbr.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
