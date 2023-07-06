package br.com.pedrelosa.model;

public enum AbreviacaoLogradouro {
    CAPITAO("CAP"),
    CONSELHEIRO("CONS"),
    CORONEL("CEL"),
    DEPUTADO("DEP"),
    DESEMBARGADOR("DES"),
    ENGENHEIRO("ENG"),
    GENERAL("GAL"),
    GOVERNADOR("GOV"),
    MAJOR("MAJ"),
    MONSENHOR("MONS"),
    PROFESSOR("PROF"),
    PADRE("PE");

    private String abreviacao;


    AbreviacaoLogradouro(String tipo) {
        this.abreviacao = tipo;
    }
}
