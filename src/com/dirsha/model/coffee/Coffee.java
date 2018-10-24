/**
 * Vadim Dirsha
 * Copyright (c) 2018 Java Open Source Project
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package com.dirsha.model.coffee;

/**
 @author = Vadim Dirsha
 @date = 22.10.2018
 */
public class Coffee implements ICoffee {
    String mCoffeeName;
    CoffeePhysicalState mCoffeePhysicalState;
    CoffeeQuantity mCoffeeQuantity;
    int mCoffeePrice;


    //TODO: not implement
    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public CoffeeQuantity getCoffeeQuantity() {
        return null;
    }

    @Override
    public CoffeePhysicalState getCoffeePhysicalState() {
        return null;
    }
}
