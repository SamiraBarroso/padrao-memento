package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {


    @Test
    void deveSalvarVersoes(){
        Documento documento = new Documento();
        Versao versao1 = new Versao("v1");
        Versao versao2 = new Versao("v2");
        documento.setVersao(versao1);
        documento.setVersao(versao2);
        assertEquals(2, documento.getVersoes().size());
    }

    @Test
    void deveRetornarVersaoInicial(){
        Documento doc = new Documento();
        Versao versao1 = new Versao("v1");
        Versao versao2 = new Versao("v2");
        doc.setVersao(versao1);
        doc.setVersao(versao2);
        doc.restauraVersao(0);
        assertEquals("v1", doc.getVersao().getVersao());
    }

    @Test
    void deveRetornarVersaoAnterior(){
        Documento doc = new Documento();
        Versao versao1 = new Versao("v1");
        Versao versao2 = new Versao("v2");
        Versao versao3 = new Versao("v3");
        doc.setVersao(versao1);
        doc.setVersao(versao2);
        doc.setVersao(versao1);
        doc.setVersao(versao3);
        doc.restauraVersao(0);
        assertEquals("v1", doc.getVersao().getVersao());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Documento documento = new Documento();
            documento.restauraVersao(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}