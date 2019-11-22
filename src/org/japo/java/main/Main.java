/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */

public class Main {

    public static void main(String[] args) {
        final String NOMBRE = "Marta";
        final String PULSERA = "Pulsera hippy";
        final double DINERO =1;
        final double P_ARTICULO= 0.7;
        
        double calculo = DINERO-P_ARTICULO;
        
        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");
        System.out.println("Nombre de la niña ...: "+NOMBRE);
        System.out.printf("Dinero inicial ......: %.02f € %n",DINERO);
        System.out.println("---");
        System.out.println("Artículo a comprar ..: "+PULSERA);
        System.out.printf("Precio artículo .....: %.02f € %n",P_ARTICULO);
        System.out.println("---");
        System.out.printf("Dinero restante .....: %.02f €%n",calculo);
    }
}
