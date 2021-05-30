package br.com.fiap.model;

import java.awt.event.ActionListener;
import br.com.fiap.dao.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Filme{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String txtTitulo;
	private String txtSinopse;
	private String cbGenero;
	private String onde = null;
	private String ckbAssistido;
	
	public String getTxtTitulo() {
		return txtTitulo;
	}

	public void setTxtTitulo(String titulo) {
		this.txtTitulo = titulo;
	}

	public String getTxtSinopse() {
		return txtSinopse;
	}

	public void setTxtSinopse(String sinopse) {
		this.txtSinopse = sinopse;
	}

	public String getCbGenero() {
		return cbGenero;
	}

	public void setCbGenero(String genero) {
		this.cbGenero = genero;
	}

	public String getOnde() {
		return onde;
	}

	public void setOnde(String ondeAssistir) {
		this.onde = ondeAssistir;
	}

	public String getCkbAssistido() {
		return ckbAssistido;
	}

	public void setCkbAssistido(String assistido) {
		this.ckbAssistido = assistido;
	}

	public int getSrAvaliacao() {
		return srAvaliacao;
	}

	public void setSrAvaliacao(int avaliacao) {
		this.srAvaliacao = avaliacao;
	}

	private int srAvaliacao;
	
	public static ActionListener cadastrar(br.com.fiap.app.Filme filme) {
		
		FilmeDAO dao = new FilmeDAO();
		dao.cadastrar(filme);
		return null;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

}
