package ua.lviv.iot.goods;

import ua.lviv.iot.enums.Season;
import ua.lviv.iot.enums.Sex;
import ua.lviv.iot.enums.Size;
import ua.lviv.iot.enums.Type;

public class Gloves extends Good {
    private Size size;

    public Gloves(final String modelName, final Sex sex, final Season season,
                  final double price, final String producer, final Size size) {
        super(modelName, sex, season, Type.GLOVES, price, producer);
        setSize(size);
    }

    @Override
    public final String toString() {
        return "Gloves{" + super.toString()
                + "size=" + getSize()
                + '}';
    }

    public final Size getSize() {
        return size;
    }

    public final void setSize(final Size size) {
        this.size = size;
    }
}
