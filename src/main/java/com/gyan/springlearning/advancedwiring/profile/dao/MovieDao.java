package com.gyan.springlearning.advancedwiring.profile.dao;

import com.gyan.springlearning.advancedwiring.profile.model.Movie;

public interface MovieDao {
    Movie findByDirector(String name);
}
