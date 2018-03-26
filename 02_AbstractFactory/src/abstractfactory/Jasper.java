/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.product.AbstractProductCap;
import abstractfactory.product.AbstractProductJeans;
import abstractfactory.product.AbstractProductShoes;
import abstractfactory.product.AbstractProductTshirt;

/**
 *
 * @author Mikael Kotkavuori
 */
public class Jasper {
    private AbstractFactory factory;
    private AbstractProductJeans jeans;
    private AbstractProductTshirt tshirt;
    private AbstractProductCap cap;
    private AbstractProductShoes shoes;
    
    public Jasper() { }

    public Jasper(AbstractFactory factory) {
        this.factory = factory;
    }
    
    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }
    
    public AbstractProductJeans getJeans() {
        return jeans;
    }

    public void setJeans(AbstractProductJeans jeans) {
        this.jeans = jeans;
    }

    public AbstractProductTshirt getTshirt() {
        return tshirt;
    }

    public void setTshirt(AbstractProductTshirt tshirt) {
        this.tshirt = tshirt;
    }

    public AbstractProductCap getCap() {
        return cap;
    }

    public void setCap(AbstractProductCap cap) {
        this.cap = cap;
    }

    public AbstractProductShoes getShoes() {
        return shoes;
    }

    public void setShoes(AbstractProductShoes shoes) {
        this.shoes = shoes;
    }
    
    public void getDressed() {
        jeans = factory.createJeans();
        tshirt = factory.createTshirt();
        cap = factory.createCap();
        shoes = factory.createShoes();
    }
    
    public String describeClothes() {
        return jeans.toString() + ", " + tshirt.toString() + ", " + cap.toString() + " ja " + shoes.toString() + ".";
    }
}
