package org.example.list;

import java.util.LinkedList;

public class LinkedListPracticeBuilder {

    public void ejecutarLinkedList() {
            LinkedList<Computador> computadores = new LinkedList<>();

            Computador compuSencillo = new ComputadorBuilder()
                    .board("msi 350")
                    .ram("8gb")
                    .procesador("intel i5")
                    .build();
            Computador compuMedio = new ComputadorBuilder()
                    .board("msi 570")
                    .procesador("AMD Ryzen 7800")
                    .ram("16gb")
                    .grafica("GTX 1660")
                    .build();
            Computador compuGamaAlta = new ComputadorBuilder()
                    .board("GigaByte B450")
                    .procesador("i7 9900")
                    .ram("32gb")
                    .grafica("GTX 3070")
                    .fuente("650")
                    .build();
            Computador compuNormal = new ComputadorBuilder()
                    .board("MSI 765")
                    .procesador("AMD Ryzen 5600")
                    .grafica("GTX 1050")
                    .build();

            computadores.add(compuSencillo);
            computadores.add(compuMedio);
            computadores.add(compuGamaAlta);
        System.out.println(computadores);
        computadores.addFirst(compuNormal);
        System.out.println("Ahora agregaremos un nuevo computador haciendo uso del metodo addFirst()");
        System.out.println(computadores);
    }


    class Computador {
        private String board;
        private String procesador;
        private String ram;
        private String grafica;
        private String disco_duro;
        private String fuente;

        public void setBoard(String board) {
            this.board = board;
        }

        public void setProcesador(String procesador) {
            this.procesador = procesador;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        public void setGrafica(String grafica) {
            this.grafica = grafica;
        }

        public void setDisco_duro(String disco_duro) {
            this.disco_duro = disco_duro;
        }

        public void setFuente(String fuente) {
            this.fuente = fuente;
        }
        @Override
        public String toString() {
            return "Computador{ board=" +board+" procesador="+procesador+" ram="+ram+" grafica"+grafica+" disco duro="+disco_duro+" fuente="+fuente +"}\n";
        }
    }

    class ComputadorBuilder {
        private Computador computador;

        public ComputadorBuilder() {
            computador = new Computador();
        }

        public ComputadorBuilder board(String board) {
            computador.setBoard(board);
            return this;
        }
        public ComputadorBuilder procesador(String procesador) {
            computador.setProcesador(procesador);
            return this;
        }
        public ComputadorBuilder ram(String ram) {
            computador.setRam(ram);
            return this;
        }
        public ComputadorBuilder grafica(String grafica) {
            computador.setGrafica(grafica);
            return this;
        }
        public ComputadorBuilder disco_duro(String disco_duro) {
            computador.setDisco_duro(disco_duro);
            return this;
        }
        public ComputadorBuilder fuente(String fuente) {
            computador.setFuente(fuente);
            return this;
        }

        public Computador build(){
            return this.computador;
        }
    }
}
