package com.github.victoruizz.gym_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {
    
    
    public  String getExercises(){
        return "Push-ups\nSquats\nLunges\nPlank\nBurpees\nMountain Climbers\nJumping Jacks";
    }
}
