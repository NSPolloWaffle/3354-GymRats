class WorkoutTracker {
    public int calculateCaloriesBurned(int duration/* in minutes */, int intensity/* ranges 1-5 */) {
        int calsPerMin = 7;
        return calsPerMin * duration * intensity;
    }
}
