package ua.lviv.iot.goods;

import ua.lviv.iot.enums.Season;
import ua.lviv.iot.enums.Sex;
import ua.lviv.iot.enums.Type;

public class Good {
    private String modelName;
    private Sex sex;
    private Season season;
    private Type type;
    private double price;
    private String producer;


    public Good() {
    }

    public Good(final String modelName, final Sex sex, final Season season,
                final Type type, final double price, final String producer) {
        setModelName(modelName);
        setSex(sex);
        setSeason(season);
        setType(type);
        setPrice(price);
        setProducer(producer);
    }

    @SuppressWarnings("CheckStyle")
    @Override
    public String toString() {
        return " modelName='" + getModelName() + '\''
                + "sex='" + getSex() + '\''
                + "season='" + getSeason() + '\''
                + "type='" + getType() + '\''
                + ", price=" + getPrice()
                + ", producer='" + getProducer()
                + '\'';
    }

    public final String getModelName() {
        return modelName;
    }

    public final void setModelName(final String modelName) {
        this.modelName = modelName;
    }

    public final Sex getSex() {
        return sex;
    }

    public final void setSex(final Sex sex) {
        this.sex = sex;
    }

    public final Season getSeason() {
        return season;
    }

    public final void setSeason(final Season season) {
        this.season = season;
    }

    public final Type getType() {
        return type;
    }

    public final void setType(final Type type) {
        this.type = type;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final String getProducer() {
        return producer;
    }

    public final void setProducer(final String producer) {
        this.producer = producer;
    }
}
