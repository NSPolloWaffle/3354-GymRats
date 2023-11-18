import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WorkoutTrackerTest {
    @Test
    public void test1() {
        WorkoutTracker test1 = new WorkoutTracker();
        int output1 = test1.calculateCaloriesBurned(30, 3);
        assertEquals("Test1: 30mins at Intensity 3", 630, output1);
    }
    
    @Test
    public void test2(){
        WorkoutTracker test2 = new WorkoutTracker();
        int output2 = test2.calculateCaloriesBurned(60, 1);
        int output2Intense = test2.calculateCaloriesBurned(60, 4);
        assertEquals("Test2: 60mins at Intensity 1", 400, output2 < output2Intense);
    }

    @Test
    public void test3(){
         WorkoutTracker test3 = new WorkoutTracker();
        int output3 = test3.calculateCaloriesBurned(0, 5);
        assertEquals("Test3: 0mins at Intensity 5", 0, output3);
    }           
}
