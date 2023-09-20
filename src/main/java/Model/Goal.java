package Model;

public record Goal(int id, GoalType goalType, boolean completed) {
}

//  Goals should have a goal ID, a type (weight loss, muscle gain, muscle definition), and whether they have been completed.
