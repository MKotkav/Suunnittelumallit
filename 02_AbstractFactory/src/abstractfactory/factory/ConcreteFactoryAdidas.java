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
import abstractfactory.product.ProductCapAdidas;
import abstractfactory.product.ProductJeansAdidas;
import abstractfactory.product.ProductShoesAdidas;
import abstractfactory.product.ProductTshirtAdidas;

/**
 *
 * @author Mikael Kotkavuori
 */
public class ConcreteFactoryAdidas implements AbstractFactory{

    @Override
    public AbstractProductJeans createJeans() {
        return new ProductJeansAdidas();
    }

    @Override
    public AbstractProductTshirt createTshirt() {
        return new ProductTshirtAdidas();
    }

    @Override
    public AbstractProductCap createCap() {
        return new ProductCapAdidas();
    }

    @Override
    public AbstractProductShoes createShoes() {
        return new ProductShoesAdidas();
    }

    
}
