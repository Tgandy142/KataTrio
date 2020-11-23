package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        if(sideA == sideB && sideA == sideC)
            return "Equilateral";

        return "";
    }
}
