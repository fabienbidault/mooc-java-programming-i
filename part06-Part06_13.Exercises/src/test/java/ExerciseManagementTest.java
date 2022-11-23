
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize() {
        this.management = new ExerciseManagement();
    }

    @Test
    public void exerciceListEmptyAtBeginning() {
        Assert.assertEquals(0, this.management.exerciseList().size());
    }
    
    @Test
    public void addingExerciceGrowListByOne() {
        this.management.add("test");
        Assert.assertEquals(1, this.management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseInList() {
        this.management.add("test");
        Assert.assertTrue(this.management.exerciseList().contains("test"));
        
    }
}
