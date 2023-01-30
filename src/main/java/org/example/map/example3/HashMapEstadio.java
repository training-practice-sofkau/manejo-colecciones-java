package org.example.map.example3;

public class HashMapEstadio {
    public void getCiudadEstadio(){
        IManageEstadio iManageEstadio = new ManageEstadioImp();
        Estadio atanasio = new Estadio("Atanasio Girardot");
        Estadio campin = new Estadio("Nemesio Camacho El Campin");
        Estadio pascual = new Estadio("Pascual Guerrero");
        Estadio metropolitano = new Estadio("Metropolitano");
        Estadio hernan = new Estadio("Hernan Ramirez Villegas");

        // para agregar elementos al HashMap se utiliza el método addkeyValue
        iManageEstadio.addKeyValue(atanasio.getNombre(), Ciudad.MEDELLIN);
        iManageEstadio.addKeyValue(campin.getNombre(), Ciudad.BOGOTA);
        iManageEstadio.addKeyValue(pascual.getNombre(), Ciudad.CALI);
        iManageEstadio.addKeyValue(metropolitano.getNombre(), Ciudad.BARRANQUILLA);
        iManageEstadio.addKeyValue(hernan.getNombre(), Ciudad.PEREIRA);

        // para obtener el valor asociado a una key en el HashMap, se utiliza el método getValue()
        iManageEstadio.getValue(atanasio.getNombre());
        iManageEstadio.getValue(hernan.getNombre());

        // para obtener el numero de elementos en el HashMap se utiliza el método getSize()
        iManageEstadio.getSize();
    }
}
