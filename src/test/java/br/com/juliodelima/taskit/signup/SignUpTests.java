package br.com.juliodelima.taskit.signup;

//package org.openqa.selenium.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes automatizados da Funcionalidade Sign UP")
public class SignUpTests {
    @Test
    @DisplayName("Registrar um novo usuário com dados válidos")

    public void testRegistrarUmNovoUsuarioComDadosValidos(){
   //Vou abrir o chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
    //Abrir o site do taskit
        navegador.get("https://www.juliodelima.com.br/taskit/");

        //vou preencher o formulário
        navegador.findElement(By.id("name-sign-up")).sendKeys("Rafaela");
        navegador.findElement(By.id("login-sign-up")).sendKeys("Rambo");
        navegador.findElement(By.id("password-sign-up")).sendKeys("XPTO");



    }

}
