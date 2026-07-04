/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.br.controller;

import udesc.br.controller.interfaces.ControladorPaineis;
import udesc.br.exception.MedicamentoException;
import udesc.br.model.Medicamento;
import udesc.br.repository.MedicamentoRepositorio;
import udesc.br.vision.medicamentos.CadastrarMedicamentoVisao;

/**
 *
 * @author mayur
 */
public class CadastrarMedicamentoControlador implements ControladorPaineis {
    private CadastrarMedicamentoVisao visao;
    private MedicamentoRepositorio medicamentoRepositorio;
    private Medicamento modelo;
    
    public CadastrarMedicamentoControlador(CadastrarMedicamentoVisao visao, MedicamentoRepositorio medicamentoRepositorio){
        this.visao = visao;
        this.medicamentoRepositorio = medicamentoRepositorio;
        initTela();
    }

    @Override
    public void initTela() {
        adicionarAcoes();
    }

    @Override
    public void adicionarAcoes() {
        visao.adicionarAcaoBtnCadastrar(e -> salvarMedicamento());
    }

    @Override
    public void atualizarTela() {
        visao.limparTela();
    }

    private void salvarMedicamento() {
        // pegar informações na tela
        try{
            String nome = visao.getMedicamentoNome();
            double valorCompra = visao.getMedicamentoValorCompra();
            double estoque = visao.getMedicamentoEstoque();
            Medicamento medicamento = new Medicamento(nome, valorCompra, estoque);
            medicamentoRepositorio.salvarMedicamento(medicamento);
            visao.apresentarMensagem("Medicamento salvo com sucesso!");
            visao.limparTela();
        }catch (MedicamentoException ex) {
            visao.apresentarMensagem(ex.getMessage());
        }
    }
}
