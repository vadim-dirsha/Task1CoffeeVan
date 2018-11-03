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
package com.dirsha.model.coffee.coffee_type;

import com.dirsha.model.coffee.CoffeeInfo;
import com.dirsha.model.coffee.Product;

/**
 * @author = Vadim Dirsha
 * @date = 03.11.2018
 */
public class Coffee extends Product {

    CoffeeInfo mCoffeeInfo;

    public Coffee(String pProductName, int pPrice, CoffeeInfo pCoffeeInfo) {
        super(pProductName, pPrice);
        this.mCoffeeInfo = pCoffeeInfo;
    }
}
