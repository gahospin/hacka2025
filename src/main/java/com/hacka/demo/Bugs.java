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
    private StatusLogger.Config config;
    Connection conn;

    private int value = 0;

    public boolean isOfLegalAge(int edad) {
        return edad > 18;
    }

    public double calculateAverage(int sum, int amount) {
        return sum / amount;
    }

    public void increase() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public String process() {
        return config.getClass().getName();
    }

    public void executeQuery() throws SQLException {
        String query = "SELECT * FROM usuario WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, "ABC");
    }

    public String getData() throws IOException {
        URL url = new URL("https://api.miservicio.com/data");
        return new String(url.openStream().readAllBytes());
    }

    public void search(List<String> lista, String valor) throws InterruptedException {
        for (String s : lista) {
            if (s.equals(valor)) {
                Thread.sleep(10); // Lento pero válido
            }
        }
    }
}
