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
    * 1 - Se dois objetos tem o resultado do equals verdadeiro, então ambos devem ter o mesmo hashcode
    * 2 - Se dois objetos tem o mesmo hashcode, não necessariamente o equals de ambos têm que ser true.
    * 3 - Se dois objetos tem hashcode diferentes, então o JAVA tem que ter certeza que ambos são diferentes.
    *  */


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Celular celular = (Celular) obj;
        return serialNumber != null && serialNumber.equals(celular.serialNumber);
    }

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
