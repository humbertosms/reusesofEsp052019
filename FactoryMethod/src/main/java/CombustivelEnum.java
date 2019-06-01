import sun.rmi.server.InactiveGroupException;

public enum CombustivelEnum {
    ALCOOL(1, "Alcool"),
    GASOLINA(2, "Gasolina"),
    DIESEL (3,"Diesel");
    private Integer codigo;
    private String descricao;

    CombustivelEnum(Integer codigo, String desc) {
        this.codigo = codigo;
        this.descricao = desc;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public CombustivelEnum of(Integer codigo){
        for (CombustivelEnum value : values()) {
            if(value.codigo==codigo)
                return value;
        }
        return null;
    }

}