package JavaCore.ClassesUtilitarias.Strings.StringBuilder;

public class StringBuilderView {
    public static void main(String[] args) {
        //É uma classe focada em otimização.
        //Por tanto, focada nisso, ela é mais complexa que a String.

        StringBuilder sb = new StringBuilder("testando");

        sb.append(" StringBuilder");
        System.out.println(sb);

        sb.reverse();
        sb.delete(0, 5);
    }
}
