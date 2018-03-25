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
import abstractfactory.product.ProductCapBoss;
import abstractfactory.product.ProductJeansBoss;
import abstractfactory.product.ProductShoesBoss;
import abstractfactory.product.ProductTshirtBoss;

/**
 *
 * @author Mikael Kotkavuori
 */
public class ConcreteFactoryBoss implements AbstractFactory {

    @Override
    public AbstractProductJeans createJeans() {
        return new ProductJeansBoss();
    }

    @Override
    public AbstractProductTshirt createTshirt() {
        return new ProductTshirtBoss();
    }

    @Override
    public AbstractProductCap createCap() {
        return new ProductCapBoss();
    }

    @Override
    public AbstractProductShoes createShoes() {
        return new ProductShoesBoss();
    }
    
}
