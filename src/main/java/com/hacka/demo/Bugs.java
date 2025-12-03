package com.hacka.demo;


import org.apache.logging.log4j.status.StatusLogger;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Bugs {
    public void search(List<String> lista, String valor) throws InterruptedException {
        for (String s : lista) {
            if (s.equals(valor)) {
                Thread.sleep(10); // Lento pero válido
            }
        }
    }
}
