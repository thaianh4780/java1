package Bai3;

import java.util.ArrayList;
import java.util.List;

public class CharPosition {
    private char c;
    private List<Integer> positions;

    public CharPosition(char c, int position) {
        this.c = c;
        this.positions = new ArrayList<>();
        this.positions.add(position);
    }

    public char getChar() {
        return c;
    }

    public List<Integer> getPositions() {
        return positions;
    }

    public void addPosition(int position) {
        positions.add(position);
    }

    @Override
    public String toString() {
        return c + "=" + positions;
    }
}
