package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        if(sideA == sideB && sideA == sideC)
            return "Equilateral";
        else if(sideA == sideB || sideA == sideC || sideB == sideC)
            return "Isosceles";

        int temp = 0;
        if(sideB > sideA && sideB > sideC)
        {
            temp = sideA;
            sideA = sideB;
            sideB = temp;
        }
        else if(sideC > sideB && sideC > sideA)
        {
            temp = sideA;
            sideA = sideC;
            sideC = temp;
        }

        if((sideB*sideB)+(sideC*sideC) == (sideA*sideA))
            return "Right";
        else if(sideB+sideC > sideA)
            return "Scalene";


        return "";
    }
}
