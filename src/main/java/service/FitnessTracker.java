package service;

import Model.User;
import Model.Workout;
import Model.WorkoutType;

import java.util.List;

public class FitnessTracker {

    public List<Workout> allWorkouts(User user, WorkoutType workoutType){
        return user.workoutList().stream().filter(workout -> workout.workoutType() == workoutType)
                .filter(workout -> workout.goal().completed()).toList();
    }

    public List<Workout> allWorkoutsHaventBennCompleted(List<User> users, int duration){
        return users.stream().flatMap(user -> user.workoutList().stream())
                .filter(workout -> workout.goal().completed() && workout.minutes() > duration).toList();
    }
}

//   - Can you create a function that retrieves all workouts of a certain type that were completed by a certain user by username?
//   - Can you create a function that retrieves all workouts from all users that have at least a minimum duration and haven't been completed?
