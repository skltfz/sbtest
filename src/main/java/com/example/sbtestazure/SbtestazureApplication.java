package com.example.sbtestazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbtestazureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbtestazureApplication.class, args);
    }

    @GetMapping("/message")
    public String message() {
        return "diu";
    }

    @GetMapping("/airc")
    public String amIReallyCrazy() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                  <title>Contact Information</title>
                  <style>
                    body {
                      font-family: Arial, sans-serif;
                      margin: 20px;
                    }
                    h1 {
                      text-align: center;
                    }
                    table {
                      width: 100%;
                      border-collapse: collapse;
                    }
                    th, td {
                      padding: 8px;
                      text-align: left;
                      border-bottom: 1px solid #ddd;
                    }
                  </style>
                </head>
                <body>
                  <h1>Contact Information</h1>
                  <table>
                    <tr>
                      <th>Name</th>
                      <td>Mak Chi Ho Sam (麥智豪)</td>
                    </tr>
                    <tr>
                      <th>Address</th>
                      <td>No. 48, Ha Keng Hau, Shatin, N.T., Hong Kong</td>
                    </tr>
                    <tr>
                      <th>Mobile</th>
                      <td>9286 3049</td>
                    </tr>
                    <tr>
                      <th>Email</th>
                      <td>skltfz@gmail.com</td>
                    </tr>
                  </table>
                </body>
                </html>""";
    }
}
