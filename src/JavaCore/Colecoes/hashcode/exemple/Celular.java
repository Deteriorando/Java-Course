package JavaCore.Colecoes.hashcode.exemple;

import java.util.Objects;

public class Celular {
    private String serialNumber;
    private String name;

    public Celular(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    // Como implementar o hashcode na nossa classe?
    /*
    * 1 - Se um objetoA.equal(objetoB) for verdadeiro, então o hashcode de ambos têm que ser igual.
    * 2 - Se dois objetos tem o mesmo hashcode, não necessariamente o equals de um deles tem que ser verdadeiro.
    * 3 - Se dois objetos forem diferentes, o equals deles tem que ser falso, o JAVA tem que ter certeza que eles são objetos diferentes.
    * */

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Celular celular = (Celular) obj;
        return serialNumber != null && serialNumber.equals(celular.serialNumber);
    }

    // Uma das formas de implementação mais simples.
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
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
