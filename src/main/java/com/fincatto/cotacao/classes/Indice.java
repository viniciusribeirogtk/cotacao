package com.fincatto.cotacao.classes;

/**
 * Representa um indice de consulta de valores no Banco Central do Brasil.
 * Para ver o indice completo de moedas suportadas, veja o arquivo indices.txt na pasta resources.
 * Esse arquivo foi tirado de: http://egas.digital/cotacoes.txtAtualizad
 */
public enum Indice {

    //moedas
    DOLAR_VENDA(1, "D\u00f3lar (venda)"),
    DOLAR_COMPRA(10813, "D\u00f3lar (compra)"),
    EURO_VENDA(21619, "Euro (venda)"),
    EURO_COMPRA(21620, "Euro (compra)"),

    //indices
    IGPM(189, "IGP-M"),
    OURO_BMF(4, "Ouro BMF"),
    SELIC(11, "Selic"),
    PIB_MENSAL(4380, "PIB"),
    SELIC_META(432, "Selic Meta"),
	CDI_MES(4392, "CDI Mensal");


    private final long codigo;
    private final String descricao;

    Indice(final long codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Indice{");
        sb.append("codigo=").append(codigo);
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}