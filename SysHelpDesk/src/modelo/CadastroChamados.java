/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Time;
import javax.xml.crypto.Data;

/**
 *
 * @author itamar.souza
 */
public class CadastroChamados {
    long controlealteracao ; 
    long controleusuario;  //vem da tabela usuário
    long controleempresa;  //vem da tabela empresa
    long controleservico; //vem da tabela serviço 
    Data datacadastro;  
    String tipo;  
    String sumario;
    String descricao;
    String nomeformulario;
    String emailfuncionario;
    String severidade;
    String status; 
    String situacaochamado;
    String marca;
    Data  data_inc;
    Data data_hab;
    Data data_alt;
    String descricaoresposta;
    String funcionariosuporte;
    Time horachamado;

    /**
     * @return the controlealteracao
     */
    public long getControlealteracao() {
        return controlealteracao;
    }

    /**
     * @param controlealteracao the controlealteracao to set
     */
    public void setControlealteracao(long controlealteracao) {
        this.controlealteracao = controlealteracao;
    }

    /**
     * @return the controleusuario
     */
    public long getControleusuario() {
        return controleusuario;
    }

    /**
     * @param controleusuario the controleusuario to set
     */
    public void setControleusuario(long controleusuario) {
        this.controleusuario = controleusuario;
    }

    /**
     * @return the controleempresa
     */
    public long getControleempresa() {
        return controleempresa;
    }

    /**
     * @param controleempresa the controleempresa to set
     */
    public void setControleempresa(long controleempresa) {
        this.controleempresa = controleempresa;
    }

    /**
     * @return the controleservico
     */
    public long getControleservico() {
        return controleservico;
    }

    /**
     * @param controleservico the controleservico to set
     */
    public void setControleservico(long controleservico) {
        this.controleservico = controleservico;
    }

    /**
     * @return the datacadastro
     */
    public Data getDatacadastro() {
        return datacadastro;
    }

    /**
     * @param datacadastro the datacadastro to set
     */
    public void setDatacadastro(Data datacadastro) {
        this.datacadastro = datacadastro;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the sumario
     */
    public String getSumario() {
        return sumario;
    }

    /**
     * @param sumario the sumario to set
     */
    public void setSumario(String sumario) {
        this.sumario = sumario;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the nomeformulario
     */
    public String getNomeformulario() {
        return nomeformulario;
    }

    /**
     * @param nomeformulario the nomeformulario to set
     */
    public void setNomeformulario(String nomeformulario) {
        this.nomeformulario = nomeformulario;
    }

    /**
     * @return the emailfuncionario
     */
    public String getEmailfuncionario() {
        return emailfuncionario;
    }

    /**
     * @param emailfuncionario the emailfuncionario to set
     */
    public void setEmailfuncionario(String emailfuncionario) {
        this.emailfuncionario = emailfuncionario;
    }

    /**
     * @return the severidade
     */
    public String getSeveridade() {
        return severidade;
    }

    /**
     * @param severidade the severidade to set
     */
    public void setSeveridade(String severidade) {
        this.severidade = severidade;
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
     * @return the situacaochamado
     */
    public String getSituacaochamado() {
        return situacaochamado;
    }

    /**
     * @param situacaochamado the situacaochamado to set
     */
    public void setSituacaochamado(String situacaochamado) {
        this.situacaochamado = situacaochamado;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the data_inc
     */
    public Data getData_inc() {
        return data_inc;
    }

    /**
     * @param data_inc the data_inc to set
     */
    public void setData_inc(Data data_inc) {
        this.data_inc = data_inc;
    }

    /**
     * @return the data_hab
     */
    public Data getData_hab() {
        return data_hab;
    }

    /**
     * @param data_hab the data_hab to set
     */
    public void setData_hab(Data data_hab) {
        this.data_hab = data_hab;
    }

    /**
     * @return the data_alt
     */
    public Data getData_alt() {
        return data_alt;
    }

    /**
     * @param data_alt the data_alt to set
     */
    public void setData_alt(Data data_alt) {
        this.data_alt = data_alt;
    }

    /**
     * @return the descricaoresposta
     */
    public String getDescricaoresposta() {
        return descricaoresposta;
    }

    /**
     * @param descricaoresposta the descricaoresposta to set
     */
    public void setDescricaoresposta(String descricaoresposta) {
        this.descricaoresposta = descricaoresposta;
    }

    /**
     * @return the funcionariosuporte
     */
    public String getFuncionariosuporte() {
        return funcionariosuporte;
    }

    /**
     * @param funcionariosuporte the funcionariosuporte to set
     */
    public void setFuncionariosuporte(String funcionariosuporte) {
        this.funcionariosuporte = funcionariosuporte;
    }

    /**
     * @return the horachamado
     */
    public Time getHorachamado() {
        return horachamado;
    }

    /**
     * @param horachamado the horachamado to set
     */
    public void setHorachamado(Time horachamado) {
        this.horachamado = horachamado;
    }
}
