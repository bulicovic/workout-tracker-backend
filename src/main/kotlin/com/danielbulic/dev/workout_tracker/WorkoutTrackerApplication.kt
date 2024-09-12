package com.danielbulic.dev.workout_tracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WorkoutTrackerApplication

fun main(args: Array<String>) {
	runApplication<WorkoutTrackerApplication>(*args)
}
