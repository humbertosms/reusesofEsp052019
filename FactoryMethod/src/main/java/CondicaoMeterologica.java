public enum CondicaoMeterologica {
    SOL(1, "Sol"),
    CHUVA(2, "Chuva");

    private Integer codigo;
    private String desc;

    CondicaoMeterologica(Integer cod, String desc) {
        this.codigo = cod;
        this.desc = desc;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDesc() {
        return desc;
    }

    public CondicaoMeterologica of(Integer codigo) {
        for (CondicaoMeterologica value : values()) {
            if (value.codigo == codigo)
                return value;
        }
        return null;
    }
}
