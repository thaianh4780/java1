package Bai3;

import java.util.ArrayList;
import java.util.List;

public class  CharPosition{

    char kiTu ;
    private List<Integer>  position ;

    public List<Integer> getPosition() {
        return position;
    }

    public void setPosition(List<Integer> position) {
        this.position = position;
    }

    public char getKiTu() {
        return kiTu;
    }

    public void setKiTu(char kiTu) {
        this.kiTu = kiTu;
    }

    public CharPosition(int position, char kiTu) {
        this.position = new ArrayList<>() ;
        this.position.add(position);
        this.kiTu = kiTu;
    }

    public void addPosition(int positions){
        position.add(positions);
    }

    @Override
    public String toString() {
        return "CharPosition{" +
                "position=" + position +
                ", kiTu=" + kiTu +
                '}';
    }
}