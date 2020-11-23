package triangles;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TrianglesTest {

    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType, is("Equilateral"));
    }
    @Test
    public void twoEqualSidesIsAnIsoscelesTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(5,5,3);
        assertThat(triangleType, is("Isosceles"));
    }
    @Test
    public void ninetyDegreeAngleIsARightTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3,4,5);
        assertThat(triangleType, is("Right"));
    }
}
