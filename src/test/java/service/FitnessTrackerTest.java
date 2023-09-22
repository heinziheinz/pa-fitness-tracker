package service;

import Model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FitnessTrackerTest {

    //TESTS need to be adopted

    @Test
    void allWorkouts() {
        Goal goalONe = new Goal(1, GoalType.MUSCLEGAIN, true);
        Workout workoutOne = new Workout(1, WorkoutType.STRENGTH, 30, goalONe);
        Goal goalTwo = new Goal(2, GoalType.WEIGHTLOSS, false);
        Workout workoutTwo = new Workout(1, WorkoutType.STRENGTH, 30, goalTwo);
        List<Workout> workouList = List.of(workoutOne, workoutTwo);
        User user = new User(1, "Karl", "alsd#", "as@fmg.at", workouList);
        FitnessTracker fitnessTracker = new FitnessTracker();
        List<Workout> actual = fitnessTracker.allWorkouts(user, WorkoutType.STRENGTH);
        List<Workout> expected = List.of(workoutOne);
        System.out.println( "actual: " + actual);
        System.out.println( "expected: " + expected);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void allWorkoutsHavenNotBennCompleted() {
        // test need to be adopted!!
        //   - Can you create a function that retrieves
        //   all workouts from all users that have at least a minimum duration and haven't been completed?
        Workout workout = new Workout(1,
                WorkoutType.STRENGTH,
                30,
                new Goal(1, GoalType.MUSCLEGAIN, true));

        List<Workout> workoutList = List.of(workout);

        User user = new User(1, "Karl", "alsd#", "as@fmg.at", workoutList);

        Workout workoutTwo = new Workout(1,
                WorkoutType.STRENGTH,
                30,
                new Goal(1, GoalType.MUSCLEGAIN, false));

        List<Workout> workoutkListTwo = List.of(workoutTwo);

        User userTwo = new User(1, "Karl", "alsd#", "as@fmg.at", workoutkListTwo);
        List<User> users = List.of(user, userTwo);


        FitnessTracker fitnessTracker = new FitnessTracker();
        List<Workout> actual = fitnessTracker.allWorkoutsHaventBennCompleted(users, 10);


        List<Workout> expected = List.of(workout);
        Assertions.assertEquals(expected, actual);

    }
}