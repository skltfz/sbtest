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

    @GetMapping("/resume")
    public String amIReallyCrazy() {
        return """
                <!DOCTYPE html>
                <html>
                  <head>
                    <title>RESUME</title>
                    <style>
                      body {
                        font-family: Arial, sans-serif;
                        margin: 20px;
                      }
                      h1 {
                        text-align: center;
                      }
                      h2 {
                        font-style: italic;
                        text-decoration: underline;
                      }
                      table {
                        width: 100%;
                        border-collapse: collapse;
                      }
                      th,
                      td {
                        padding: 8px;
                        text-align: left;
                        border-bottom: 1px solid #ddd;
                      }
                    </style>
                  </head>
                  <body>
                    <h1>RESUME</h1>
                    <table>
                      <tr>
                        <th>Name</th>
                        <td>Mak Chi Ho Sam (麥智豪)</td>
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
                    <h2>CAREER OBJECTIVE</h2>
                    <p>
                      To secure a challenging position where I can effectively contribute my
                      skills as Technical Lead who possesses competent technical skills.
                    </p>
                    <h2>EDUCATION</h2>
                    <h3>Hong Kong University of Science and Technology</h3>
                    <p>
                      Bachelor of Computer Engineering<br />
                      September 2007 - June 2010
                    </p>
                    <h3>Final Year Project</h3>
                    <p>
                      Grade A<br />
                      September 2005 - June 2007
                    </p>
                    <p>
                      Semester 2, 2005 - 2006<br />
                      Semester 1, 2006 - 2007<br />
                      Semester 2, 2006 - 2007
                    </p>
                    <h3>Hong Kong Baptist University (College of International Education)</h3>
                    <p>
                      Associate Degree of Computer Science<br />
                      May 2022 – Now<br />
                      GPA: 3.25 / 4
                    </p>
                    <p>
                      Remarks:<br />
                      Academic Honours Dean's List<br />
                      President's Honour Roll
                    </p>
                    <h2>PROFESSIONAL EXPERIENCE</h2>
                    <h3>Technical Lead</h3>
                    <p>
                      NextGen Solutions Limited<br />
                      August 2022 – April 2023
                    </p>
                    <ul>
                      <li>
                        Seconded to FWD as technical lead of enterprise app (CUBE Japan) which
                        allows solicitors to manage & trace the agents activities. The role is
                        to govern & oversee both frontend & backend development progress and
                        meet with the expectation of the client's PO / PM (team size ~8) under
                        the compliances of enterprise architecture.
                      </li>
                      <li>
                        Aligning with the UI / UX team for design requirements, provide
                        feasibility study & estimations & development.
                      </li>
                      <li>
                        Aligning with the backend team for API schema & logic implementation.
                      </li>
                    </ul>
                    <h3>Technical Lead / Application Architect</h3>
                    <p>
                      IBM<br />
                      August 2022 – April 2023
                    </p>
                    <ul>
                      <li>
                        Seconded to HKJC as technical lead in one of the react native app team
                        (team size ~ 10 developers, react native, redux, jenkins)
                      </li>
                      <li>
                        Enabling developers, following up defects & feedbacks, reviewing
                        deliverables & managing branches and releases.
                      </li>
                      <li>
                        Governing the team development progress on new stories provides
                        technical analysis and estimation.
                      </li>
                      <li>
                        Coordinate the expectations among developers, SAs, BA, scrum master POs,
                        within the team.
                      </li>
                      <li>
                        Participated in a pre-sales / consultancy project for technical analysis
                        & POC (HKTDC, Augmented Reality, swiftUI).
                      </li>
                    </ul>
                    <h2>COMPUTER COMPETENCY IN</h2>
                    <h3>Programming Language</h3>
                    <p>
                      .NET(C#, VB, core), CSS, C, C++, HTML5, JavaScript (ES6^), Java, PHP,
                      Python, React native, Regex, SCSS, SwiftUI, Vue, xml, YAML
                    </p>
                    <h3>Database & Development Framework</h3>
                    <p>
                      .NET MVC, Android, Angular, Bootstrap, EF, IOS, kendo, Laravel, MSSQL,
                      MySQL, Node.js, OpenCV, SPFX, SSRS
                    </p>
                    <h3>Cloud, CRM, CMS, DevOps, IDE</h3>
                    <p>
                      Android studio, Apache, Azure, AWS (EC2, RDS, DynamoDB), Git, IIS,
                      Jenkins, K8s, MSCRM, Visual Studio, VS Code, Unity, Unix, WordPress, Xcode
                    </p>
                    <h2>LANGUAGE SKILLS</h2>
                    <h3>Mother Tongue(s)</h3>
                    <p>Cantonese (Native)</p>
                    <h3>Other Language(s)</h3>
                    <p>English (Fluent), Mandarin (Elementary), Japanese(Elementary, N5)</p>
                    <h2>ADDITIONAL INFORMATION</h2>
                    <h3>Interest</h3>
                    <p>piano, travel, blackjack, reading, rubik cube, burr puzzle</p>
                    <h3>Personal Characteristics</h3>
                    <p>
                      adaptability, assertiveness, autonomous, diligence, efficient,
                      enthusiastic, calm, cooperative, creative, curiosity, motivation,
                      responsible
                    </p>
                    <h2>REFERENCE</h2>
                    <p>Available Upon Request</p>
                  </body>
                </html>
                """;
    }
}
