package stones.stone;


import stones.enums.PreciousStonesNames;
import stones.enums.StoneColor;

import java.util.Objects;

public class PreciousStone extends Stone {
    private PreciousStonesNames preciousStoneName;

    public PreciousStone(PreciousStonesNames preciousStoneName, StoneColor stoneColor, double stoneWeight, double stonePrice, int stoneClarity) {
        super(stoneColor, stoneWeight, stonePrice, stoneClarity);
        this.preciousStoneName = preciousStoneName;
    }

    public PreciousStonesNames getPreciousStoneName() {
        return preciousStoneName;
    }

    public void setPreciousStoneName(PreciousStonesNames preciousStoneName) {
        this.preciousStoneName = preciousStoneName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PreciousStone that = (PreciousStone) o;
        return preciousStoneName == that.preciousStoneName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), preciousStoneName);
    }

    @Override
    public String toString() {
        return "PreciousStone: " +
                "preciousStoneName=" + preciousStoneName + " " +
                super.toString() +
                "\n";
    }
}

