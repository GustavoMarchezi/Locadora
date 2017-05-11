/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author sala308b
 */
public class filmes {
    
    private int codigo;
    private String titulo;
    private int codgenero;
    private String sinopse;
    private String diretor;
    private int anolancamento;
    private String status;
    private String usuariocadastro;
    private Date datahoracadastro;

    public filmes() {
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the codgenero
     */
    public int getCodgenero() {
        return codgenero;
    }

    /**
     * @param codgenero the codgenero to set
     */
    public void setCodgenero(int codgenero) {
        this.codgenero = codgenero;
    }

    /**
     * @return the sinopse
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * @param sinopse the sinopse to set
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    /**
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * @return the anolancamento
     */
    public int getAnolancamento() {
        return anolancamento;
    }

    /**
     * @param anolancamento the anolancamento to set
     */
    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the usuariocadastro
     */
    public String getUsuariocadastro() {
        return usuariocadastro;
    }

    /**
     * @param usuariocadastro the usuariocadastro to set
     */
    public void setUsuariocadastro(String usuariocadastro) {
        this.usuariocadastro = usuariocadastro;
    }

    /**
     * @return the datahoracadastro
     */
    public Date getDatahoracadastro() {
        return datahoracadastro;
    }

    /**
     * @param datahoracadastro the datahoracadastro to set
     */
    public void setDatahoracadastro(Date datahoracadastro) {
        this.datahoracadastro = datahoracadastro;
    }
    
    
    
    
    
}
