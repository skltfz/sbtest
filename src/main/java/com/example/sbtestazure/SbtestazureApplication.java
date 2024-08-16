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
                      .section {
                        margin-bottom: 30px;
                      }
                      .experience {
                        margin-bottom: 20px;
                      }
                      .experience h3 {
                        margin-top: 0;
                      }
                      .experience p {
                        margin: 5px 0;
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
                      September 2007 - June 2010 <br />
                       <b>Final Year Project: Grade A</b>
                    </p>
                    <h3>Hong Kong Baptist University (College of International Education)</h3>
                    <p>
                      Associate Degree of Computer Science<br />
                      September 2005 - June 2007 <br />
                      GPA: 3.25 / 4
                    </p>
                    </p>
                    <p>
                      Remarks:<br />
                      Academic Honours Dean's List<br />
                      President's Honour Roll
                    </p>
                    <h2>PROFESSIONAL EXPERIENCE</h2>
                    <div class="experience">
                      <h3>Technical Lead</h3>
                      <p>NextGen Solutions Limited</p>
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
                      <p>May 2023 – August 2024</p>
                    </div>
                    <div class="experience">
                      <h3>Application Architect / Technical Lead</h3>
                      <p>IBM</p>
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
                          Coordinate the expectations among developers, SAs, BA, scrum master
                          POs, within the team.
                        </li>
                        <li>
                          Participated in a pre-sales / consultancy project for technical
                          analysis & POC (HKTDC, Augmented Reality, swiftUI).
                        </li>
                      </ul>
                      <p>August 2022 – Apr 2023</p>
                    </div>
                    <div class="experience">
                      <h3>
                        Manager - Digital Enablement / Associate Consultant - Full Stack
                        Engineering
                      </h3>
                      <p>Hong Kong Productivity Council</p>
                      <ul>
                        <li>
                          Lead of Po Leung Kuk HRIS system & HKAEE development (6 devs).
                          (C#.NET, MSSQL, vuejs)
                        </li>
                        <li>
                          Lead of FitEasyApp development (1 dev) (react native, laravel, MySql,
                          vue2js, python, openCV).
                        </li>
                        <li>Maintenance of LMS projects (2 dev) (PHP, ASP, MySQL)</li>
                        <li>
                          Setup a DevOps automation server POC integrated with test automation,
                          code scan, SRAA & notification (Jenkins, JIRA, sonarqube)
                        </li>
                        <li>
                          R&D (45%), enable developers, review deliverables, task assignment &
                          objectives assurance (35%), technical consultation, requirement
                          analysis, estimation, tutor (20%)
                        </li>
                      </ul>
                      <p>November 2020 – July 2022</p>
                    </div>
                    <div class="experience">
                      <h3>Senior System Analyst</h3>
                      <p>Pro-Tech Technology (Asia) Ltd</p>
                      <ul>
                        <li>
                          Development lead, firefighting the ad-hot projects. Providing guidance
                          of standard, technologies, tools and techniques for the team, work
                          closely with PM / BA / business users and end-users on issues related
                          to design and requirements
                        </li>
                        <li>
                          Timesheet system, Contract & Budget System, Online Application Form &
                          Reporting System (Nan Fung, New World China, WHARF)[ K2 workflow, .NET
                          MVC, kendo, EF6, MSSQL]
                        </li>
                        <li>
                          Home Care System (SHENG KUNG HUI WELFARE COUNCIL LIMITED, .net core
                          3.1 integrating with Azure's [key vault, App services, VM])
                        </li>
                      </ul>
                      <p>September 2019 – October 2020</p>
                    </div>
                    <div class="experience">
                      <h3>Senior Analyst Programmer</h3>
                      <p>Integrated Enterprise Solution</p>
                      <ul>
                        <li>
                          Support, enhance & develop for 3 projects which are government
                          department, HKEX, and Philip Morris. (.NET, MSSQL, Network & Security
                          tinkering on code scan and security scan (Fortify, QUALYS))
                        </li>
                      </ul>
                      <p>February 2019 – June 2019</p>
                    </div>
                    <div class="experience">
                      <h3>Senior Analyst Programmer</h3>
                      <p>Pactera</p>
                      <ul>
                        <li>
                          Seconded to Swire Properties for development and maintenance on the
                          property lease system, management system & ballot system (.NET, MSSQL)
                        </li>
                      </ul>
                      <p>December 2017 – January 2019</p>
                    </div>
                    <div class="experience">
                      <h3>Application Developer</h3>
                      <p>Social Career Limited</p>
                      <ul>
                        <li>
                          Develop and maintain the company website UI & UX. (Angular JS, MySQL,
                          node JS)
                        </li>
                      </ul>
                      <p>June 2017 – December 2017</p>
                    </div>
                    <div class="experience">
                      <h3>Analyst Programmer</h3>
                      <p>LazyBug Studio Limited</p>
                      <ul>
                        <li>
                          Develop and maintain the company's CRM, back office, cash site
                          systems.
                        </li>
                        <li>
                          Implementing console program to bridge the data connection with other
                          external systems (.NET, MSSQL, MVC, ReactJS, NodeJS)
                        </li>
                      </ul>
                      <p>November 2016 – May 2017</p>
                    </div>
                    <div class="experience">
                      <h3>Senior Programmer</h3>
                      <p>Neo Derm Group Ltd</p>
                      <ul>
                        <li>
                          Retrieve the user requirements of the company dashboard and import
                          portal sites from the business analyst. Analyze them, perform
                          feasibility studies and impact analysis.
                        </li>
                        <li>
                          Perform technical design, development, unit testing and development
                          integration testing to the implementation. (.NET MSSQL)
                        </li>
                      </ul>
                      <p>April 2016 – August 2016</p>
                    </div>
                    <div class="experience">
                      <h3>Analyst Programmer</h3>
                      <p>We Software Limited</p>
                      <ul>
                        <li>
                          As a sole developer to maintain web instances for a global,
                          consortium-backed operator of alternative equity trading venues (.NET
                          DNN CMS, AWS EC2), handling any upcoming incidents include database,
                          web change requests and reporting.
                        </li>
                        <li>
                          Develop an android application using native android & Phonegap,
                          leading the development of the project. (JAVA)
                        </li>
                        <li>
                          Implement PHP web services, mail server, website (supporting small
                          projects & the company's leave system) (PHP, LAMP).
                        </li>
                      </ul>
                      <p>December 2013 – April 2016</p>
                    </div>
                    <div class="experience">
                      <h3>Programmer</h3>
                      <h3>Analyst Programmer</h3>
                      <p>ITOPIA LIMITED</p>
                      <ul>
                        <li>
                          Working with PM or taking lead for development of more than 12 full
                          life cycle MSCRM customization projects, tasks include implementing
                          entities, processes, plugins, workflows and external web services,
                          SSRS reports and managing SQL data & schemas upon user request.
                        </li>
                      </ul>
                      <p>July 2010 – December 2013</p>
                    </div>
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
