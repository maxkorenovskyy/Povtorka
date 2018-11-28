package ua.lviv.iot.goods;

import ua.lviv.iot.enums.Season;
import ua.lviv.iot.enums.Sex;
import ua.lviv.iot.enums.Size;
import ua.lviv.iot.enums.Type;

public class Hat extends Good {
    private Size size;

    private String typeOfHat;

    public Hat(final String modelName, final Sex sex, final Season season,
               final double price, final String producer, final Size size, final String typeOfHat) {
        super(modelName, sex, season, Type.HAT, price, producer);
        setSize(size);
        setTypeOfHat(typeOfHat);
    }

    @Override
    public final String toString() {
        return "Hat{" + super.toString()
                + "size=" + getSize()
                + "typeOfHat=" + getTypeOfHat()
                + '}';
    }

    public final Size getSize() {
        return size;
    }

    public final void setSize(final Size size) {
        this.size = size;
    }

    public final String getTypeOfHat() {
        return typeOfHat;
    }

    public final void setTypeOfHat(final String typeOfHat) {
        this.typeOfHat = typeOfHat;
    }
}
