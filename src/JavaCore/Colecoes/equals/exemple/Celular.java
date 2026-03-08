package JavaCore.Colecoes.equals.exemple;

import java.util.Objects;

public class Celular {
    private String serialNumber;
    private String name;

    public Celular(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    // Como implementar o equals na nossa classe?

    /*
    * Antes de implementar o equals em determinada classe, precisamos saber algumas regras para implementar o equals.
    *
    * 1 - Reflexivo: x.equals(x), ou seja, o próprio valor referenciado dentro do equals, tem que sempre retornar verdadeiro.
    * 2 - Simétrico: Para diferentes valores como x e y, por exemplo, sendo diferentes de null(sem nenhum valor), se y.equals(x) == true,
    * o contrario deve ser verdadeiro, x.equals(y) == true.
    * 3 - Transitividade: Para x, y, z diferentes de null, se x.equals(y) == true, y.equals(z) == true, então x.equals(z) tem que retornar true.
    * Se você não entendeu sobre transitividade, imagine um triângulo com x, y, z nos seus vértices, o triângulo tem que fechar nos vértices entre ambos.
    * Dito isso, ficaria assim: se x == y e y == z, então x == z.
    * 4 - Consistente: os valores não mudaram, o resultado do equals não pode mudar, se obj for diferente de null.
    * 5 - Nulo: Se x.equals(null), então deve sempre retornar falso.
    * */

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Celular celular = (Celular) obj;
        return serialNumber != null && serialNumber.equals(celular.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
