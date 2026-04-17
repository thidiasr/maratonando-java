package learning.thdramos.maratonajava.javacore.aula19.enums.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int value;
    private String formName;

    TipoCliente(int value, String formName) {
        this.value = value;
        this.formName = formName;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String formName) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getFormName().equals(formName)) {
                return tipoCliente;
            }
        }
        return null;
    }


    public int getValue() {
        return value;
    }

    public String getFormName() {
        return formName;
    }
}
