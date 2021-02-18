package stones.stone;

import stones.enums.SemipreciousStonesName;
import stones.enums.StoneColor;

import java.util.Objects;

public class SemiPreciousStone extends Stone {
    private SemipreciousStonesName semipreciousStoneName;

    public SemiPreciousStone(SemipreciousStonesName semipreciousStoneName, StoneColor stoneColor, double stoneWeight, double stonePrice, int stoneClarity) {
        super(stoneColor, stoneWeight, stonePrice, stoneClarity);
        this.semipreciousStoneName = semipreciousStoneName;
    }

    public SemipreciousStonesName getSemipreciousStoneName() {
        return semipreciousStoneName;
    }

    public void setSemipreciousStoneName(SemipreciousStonesName semipreciousStoneName) {
        this.semipreciousStoneName = semipreciousStoneName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SemiPreciousStone that = (SemiPreciousStone) o;
        return semipreciousStoneName == that.semipreciousStoneName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), semipreciousStoneName);
    }

    @Override
    public String toString() {
        return "SemiPreciousStone: " +
                "semipreciousStoneName = " + semipreciousStoneName + " " +
                super.toString() +
                "\n";
    }
}




