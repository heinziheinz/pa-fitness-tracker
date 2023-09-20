package Model;

import java.util.List;

public record User(int id, String username, String password, String email, List<Workout> workoutList) {
}


//    Each user should have a unique username, a password, an email, and can have several workouts.
