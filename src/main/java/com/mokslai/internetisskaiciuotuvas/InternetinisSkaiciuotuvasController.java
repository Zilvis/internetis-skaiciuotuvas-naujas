package com.mokslai.internetisskaiciuotuvas;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Web kontroleris leidzia viduje naudoti @RequestMapping.
// @RestController anotacija nurodo , jog pvz: String tipo rezultatas turetu buti ispauzdinamas klijentui toks koks yra.
@RestController

// Zymi konfiguracijos komponenta viduje leidzia kurti bean per metodus su @Bean anotacija.
// Si klases lygio anotacija nurodo spring karkasui "Atspeti" konfiguracija.
// Rementis priklausomybemis ( Jar bibliotekomis ) kurias programuotojas ytraukia i projekta ( pom.xml )
// Siuo atveju ji veikia kartu su main metodu.
@EnableAutoConfiguration

public class InternetinisSkaiciuotuvasController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String hello () {
        return "Internetinis Skaiciuotuvas <p>" +
                "Galimos operacijos: </br>" +
                "&nbsp;&nbsp; sudeti </br>"+
                "&nbsp;&nbsp; dauginti </br>"+
                "&nbsp;&nbsp; dalinti </br>" +
                "&nbsp;&nbsp; atimti </br></p>";
    }


}
