package com.github.victoruizz.gym_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

    @GetMapping()
    public String listWorkouts() {
        return "Strength Training\nCardio\nHIIT\nYoga\nPilates\nCrossFit\nCycling\nSwimming";
    }

    @GetMapping("/features")
    public String getFeaturedWorkout() {
        return "Workout of the day: 30-minute HIIT";
    }
    
}