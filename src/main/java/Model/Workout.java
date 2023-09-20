package Model;

public record Workout(int id,WorkoutType workoutType, int minutes, Goal goal) {
}

//   Workouts should have a workout ID, a type (such as cardio or strength training), a duration in minutes and one goal.
