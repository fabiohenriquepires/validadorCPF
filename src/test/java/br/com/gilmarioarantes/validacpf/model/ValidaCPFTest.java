package br.com.gilmarioarantes.validacpf.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidaCPFTest {

    private ValidaCPF validaCPF;

    @Before
    public void setup() {
        validaCPF = new ValidaCPF();
    }


    @Test
    public void testQtdDigitosMaiorQuePermitido() {
        String cpf = "700190731600";
        Assert.assertFalse(validaCPF.isCPF(cpf));
    }

    @Test
    public void testeQtdDigitosMenorQuePemitido() {
        String cpf = "7001907316";
        Assert.assertFalse(validaCPF.isCPF(cpf));
    }

    @Test
    public void testeValorNaoNumerico() {
        String cpf = "xxxxxxxxxxx";
        Assert.assertFalse(validaCPF.isCPF(cpf));
    }

    @Test
    public void testeCpfDigitVerificadorInvalido() {
        String cpf = "32367903001";
        Assert.assertFalse(validaCPF.isCPF(cpf));
    }

    @Test
    public void testeCPFValidoComPontoETraco() {
        String cpf = "323.679.030-00";
        Assert.assertTrue(validaCPF.isCPF(cpf));
    }


}
