package stones.stone;

import stones.enums.StoneColor;

import java.util.Objects;

public abstract class Stone {

    private StoneColor stoneColor;
    private double stoneWeight;
    private double stonePrice;
    private int stoneClarity;

    public Stone(StoneColor stoneColor, double stoneWeight, double stonePrice, int stoneClarity) {
        this.stoneColor = stoneColor;
        this.stoneWeight = stoneWeight;
        this.stonePrice = stonePrice;
        this.stoneClarity = stoneClarity;
    }

    public StoneColor getStoneColor() {
        return stoneColor;
    }

    public double getStoneWeight() {
        return stoneWeight;
    }

    public double getStonePrice() {
        return stonePrice;
    }

    public int getStoneClarity() {
        return stoneClarity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stone stone = (Stone) o;
        return Double.compare(stone.stoneWeight, stoneWeight) == 0 && Double.compare(stone.stonePrice, stonePrice) == 0 && stoneClarity == stone.stoneClarity && stoneColor == stone.stoneColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stoneColor, stoneWeight, stonePrice, stoneClarity);
    }

    @Override
    public String toString() {
        return
                "stoneColor =" + stoneColor +
                        ", stoneWeight=" + stoneWeight +
                        ", stonePrice=" + stonePrice +
                        ", stoneClarity=" + stoneClarity;
    }
}






