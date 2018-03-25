/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.factory;

import abstractfactory.product.AbstractProductCap;
import abstractfactory.product.AbstractProductJeans;
import abstractfactory.product.AbstractProductShoes;
import abstractfactory.product.AbstractProductTshirt;

/**
 *
 * @author mikae
 */
public interface AbstractFactory {
    
    public abstract AbstractProductJeans createJeans();
    public abstract AbstractProductTshirt createTshirt();
    public abstract AbstractProductCap createCap();
    public abstract AbstractProductShoes createShoes();
    
}
