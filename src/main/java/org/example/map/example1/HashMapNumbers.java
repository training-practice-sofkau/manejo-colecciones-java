package org.example.map.example1;

public class HashMapNumbers {
    public void MapNumbers(){
        IManageNumbers iManageNumbers = new ManageNumbersImp();

        // Se agregan parejas key, value al HasHMap usando el método addKeyValue
        iManageNumbers.addKeyValue("uno", Numbers.ONE);
        iManageNumbers.addKeyValue("dos", Numbers.TWO);
        iManageNumbers.addKeyValue("tres", Numbers.THREE);
        iManageNumbers.addKeyValue("cuatro", Numbers.FOUR);
        iManageNumbers.addKeyValue("cinco", Numbers.FIVE);

        // Se verifica si una key se encuentra en el HashMap, usando el método checkKey
        System.out.println(iManageNumbers.checkKey("uno"));
        System.out.println(iManageNumbers.checkKey("seis"));     ;

        // Se verifica si existe el valor en el HashMap usando el método checkValue
        System.out.println(iManageNumbers.checkValue(Numbers.FIVE));    ;

    }
}
