package Composite;

import java.util.ArrayList;
import java.util.List;

public class Figure implements Draw{
    private List<Draw> mChildDraw = new ArrayList<>();

    @Override
    public void print() {
        for(Draw draw : mChildDraw){
            draw.print();
        }
    }

    public void add(Draw draw){
        mChildDraw.add(draw);
    }

    public void remove(Draw draw){
        mChildDraw.remove(draw);
    }
}
